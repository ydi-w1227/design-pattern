package com.staticFactory;


import com.staticFactory.Coin.Coin;
import com.staticFactory.Coin.CopperCoin;
import com.staticFactory.Coin.GoldCoin;
import lombok.Getter;

import java.util.function.Supplier;

//A Java enum is a data type that stores a list of constants.
// By default creation of the Enum instance is thread-safe,
// because only initialized once by a single thread, before it is used
//@RequiredArgsConstructor // generate constructor for each field in class
@Getter
public enum CoinType {
    // CopperCoin::new -> ref for constructor, i.e. new CopperCoin()
    // Supplier can be used as the assignment target for a lambda expression or method reference.
    // here is Supplier<CopperCoin> = CopperCoin::new
    COPPER(CopperCoin::new),
    GOLD(GoldCoin::new);

    // Supplier<Coin> constructor will hold the ref of constructor method
    private final Supplier<Coin> constructor;

    CoinType(Supplier<Coin> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Coin> getConstructor() {
        return constructor;
    }
}
