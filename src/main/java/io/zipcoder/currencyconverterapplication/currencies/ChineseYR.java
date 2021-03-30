package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {

    @Override
    public Double convert(CurrencyType currency) {
        return currency.getRate()/13.84;
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CHINESE_YR;
    }
}
