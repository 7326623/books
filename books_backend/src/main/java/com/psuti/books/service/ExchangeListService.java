package com.psuti.books.service;

import com.psuti.books.dto.ExchangeListDTO;
import com.psuti.books.model.Category;
import com.psuti.books.model.ExchangeList;
import com.psuti.books.model.OfferList;
import com.psuti.books.model.WishList;
import com.psuti.books.repository.ExchangeListRepository;
import com.psuti.books.repository.OfferListRepository;
import com.psuti.books.repository.WishListRepository;
import com.psuti.books.security.UserPrincipal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ExchangeListService {
    private OfferListRepository offerListRepository;
    private WishListRepository wishListRepository;

    public Object get(UserPrincipal principal) {
        List<OfferList> offers = offerListRepository.findByUserIdNot(principal.getUserId());

        List<OfferList> offers1 = offerListRepository.findByUserId(principal.getUserId());
        List<WishList> wishlists1 = wishListRepository.findByUserId(principal.getUserId());

        List<WishAndOffer> fullMatch = new ArrayList<>();
        List<WishAndOffer> partialMatch = new ArrayList<>();
        List<WishAndOffer> notMatch = new ArrayList<>();

        float percent;

        for (WishList wishList1 : wishlists1) {
            for (OfferList offerList2 : offers) {
                for (WishList wishList2 : wishListRepository.findByUserId(offerList2.getUser().getId())) {
                    for (OfferList offerList1 : offers1) {
                        percent = (matchPercentage(wishList1, offerList2) + matchPercentage(wishList2, offerList1))/2;

                        if (percent >= 100f) {
                            fullMatch.add(new WishAndOffer(wishList1, offerList1, wishList2, offerList2, percent));
                        }
                        if (percent > 0f && percent < 100f) {
                            partialMatch.add(new WishAndOffer(wishList1, offerList1, wishList2, offerList2, percent));
                        }
                        if (percent == 0f) {
                            notMatch.add(new WishAndOffer(wishList1, offerList1, wishList2, offerList2, percent));
                        }
                    }
                }
            }
        }

        Collections.sort(fullMatch);
        Collections.sort(partialMatch);
        Collections.sort(notMatch);

        return Offers.builder()
                .fullMatch(fullMatch)
                .partialMatch(partialMatch)
                .notMatch(notMatch)
                .build();
    }

    private float matchPercentage(WishList wishList, OfferList offerList) {
//        int startSize = wishList.getCategories().size();
//        wishList.getCategories().retainAll(offerList.getCategories());
//        return ((float) wishList.getCategories().size() / startSize) * 100;
        int a = 0;
        for(Category category : wishList.getCategories()) {
            for (Category category1 : offerList.getCategories()) {
                if (category.equals(category1))
                    a++;
            }
        }
        return (float) a /wishList.getCategories().size() * 100;
    }
}

@AllArgsConstructor
@Getter
@Setter
@Builder
class Offers {
    List<WishAndOffer> fullMatch;
    List<WishAndOffer> partialMatch;
    List<WishAndOffer> notMatch;
}

@AllArgsConstructor
@Getter
@Setter
class WishAndOffer implements Comparable<WishAndOffer>{
    private WishList wishlist1;
    private OfferList offerList1;
    private WishList wishlist2;
    private OfferList offerList2;
    private float percentage;

    @Override
    public int compareTo(WishAndOffer o) {
        if (this.getPercentage() != o.getPercentage())
            return Float.compare(o.getPercentage(), this.getPercentage());
        else
            return Integer.compare(o.getOfferList2().getUser().getRating(), this.offerList2.getUser().getRating());
    }
}