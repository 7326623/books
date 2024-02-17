package com.psuti.books.dto;

import com.psuti.books.model.OfferList;
import com.psuti.books.model.WishList;
import lombok.Data;

@Data
public class ExchangeListDTO {
    private OfferList offerList1;
    private OfferList offerList2;
    private WishList wishList1;
    private WishList wishList2;
    private Boolean isBoth;
}
