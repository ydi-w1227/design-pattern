package com.kingdom.kingdom;

import com.kingdom.army.OrcArmy;
import com.kingdom.castle.OrcCastle;
import com.kingdom.army.Army;
import com.kingdom.castle.Castle;
import com.kingdom.king.King;
import com.kingdom.king.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
