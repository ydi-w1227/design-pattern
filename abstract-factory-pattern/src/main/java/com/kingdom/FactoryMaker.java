package com.kingdom;

import com.kingdom.kingdom.ElfKingdomFactory;
import com.kingdom.kingdom.OrcKingdomFactory;
import com.kingdom.kingdom.KingdomFactory;

public class FactoryMaker {
    public enum KingdomType {
        ELF, ORC
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("Kingdom type not supported.");
        }
    }
}

