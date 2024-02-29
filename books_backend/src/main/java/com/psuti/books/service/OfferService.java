package com.psuti.books.service;

import com.psuti.books.model.OfferList;
import com.psuti.books.model.WishList;
import com.psuti.books.repository.OfferListRepository;
import com.psuti.books.repository.WishListRepository;
import com.psuti.books.security.UserPrincipal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class OfferService {
    private OfferListRepository offerListRepository;
    private WishListRepository wishListRepository;

    public Object get(UserPrincipal principal) {
        List<OfferList> offers = offerListRepository.findByUserIdNot(principal.getUserId());
        List<WishList> wishlists = wishListRepository.findByUserId(principal.getUserId());

        List<WishAndOffer> fullMatch = new ArrayList<>();
        List<WishAndOffer> partialMatch = new ArrayList<>();
        List<WishAndOffer> notMatch = new ArrayList<>();

        for (WishList wishList : wishlists) {
            for (OfferList offerList : offers) {
                float percent = matchPercentage(wishList, offerList);
                if (percent == 100f) {
                    fullMatch.add(new WishAndOffer(wishList, offerList));
                }
                if (percent > 0f && percent < 100f) {
                    partialMatch.add(new WishAndOffer(wishList, offerList));
                }
                if (percent == 0f) {
                    notMatch.add(new WishAndOffer(wishList, offerList));
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
        int startSize = wishList.getCategories().size();
        wishList.getCategories().retainAll(offerList.getCategories());
        return ((float) wishList.getCategories().size() / startSize) * 100;
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
    WishList wishlist;
    OfferList offerList;


    @Override
    public int compareTo(WishAndOffer o) {
        return Integer.compare(o.getOfferList().getUser().getRating(), this.offerList.getUser().getRating());
    }
}