package com.psuti.books.dto;

import com.psuti.books.model.ExchangeList;
import com.psuti.books.model.OfferList;
import lombok.Data;

@Data
public class UserExchangeListDTO {
    private Long id;
    private ExchangeList exchangeList;
    private OfferList offerList;
    private String trackNumber;
    private boolean receiving;
}
