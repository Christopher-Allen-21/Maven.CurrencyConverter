package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currency) {
        return currency.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }
}
