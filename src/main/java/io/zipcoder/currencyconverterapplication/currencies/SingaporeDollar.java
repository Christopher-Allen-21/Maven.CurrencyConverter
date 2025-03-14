package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currency) {
        return currency.getRate()/1.86;
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}
