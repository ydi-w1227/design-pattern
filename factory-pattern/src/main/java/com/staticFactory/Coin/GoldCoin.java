package com.staticFactory.Coin;

import com.staticFactory.Coin.Coin;

public class GoldCoin implements Coin {
    static final String DESCRIPTION = "This is a gold coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
