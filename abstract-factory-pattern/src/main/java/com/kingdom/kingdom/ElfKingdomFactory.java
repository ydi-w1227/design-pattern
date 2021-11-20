package com.kingdom.kingdom;

import com.kingdom.army.ElfArmy;
import com.kingdom.castle.ElfCastle;
import com.kingdom.king.ElfKing;
import com.kingdom.army.Army;
import com.kingdom.castle.Castle;
import com.kingdom.king.King;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
