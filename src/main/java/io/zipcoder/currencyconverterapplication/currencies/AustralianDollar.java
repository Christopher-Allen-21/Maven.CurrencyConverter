package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    public AustralianDollar(){

    }

    @Override
    public Double convert(CurrencyType currency) {
        return currency.getRate()/2.7;
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }

}
