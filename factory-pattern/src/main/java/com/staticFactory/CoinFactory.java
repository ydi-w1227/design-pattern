package com.staticFactory;

import com.staticFactory.Coin.Coin;

// CoinType makes sure only two type of input can pass
public class CoinFactory {

    public static Coin getCoin(CoinType type) {
        // Supplier have .get method which return the results of function
        // i.e. execute and return the result of the method ()-> new Copper() which should be an object created?
        return type.getConstructor().get();
    }
}
