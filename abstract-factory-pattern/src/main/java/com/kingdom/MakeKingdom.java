package com.kingdom;

import com.kingdom.army.Army;
import com.kingdom.castle.Castle;
import com.kingdom.king.King;
import com.kingdom.kingdom.ElfKingdomFactory;
import com.kingdom.kingdom.KingdomFactory;

public class MakeKingdom {
    public static void main(String[] args) {
        KingdomFactory kingdomFactory = new ElfKingdomFactory();
        Castle castle = kingdomFactory.createCastle();
        King king = kingdomFactory.createKing();
        Army army = kingdomFactory.createArmy();

        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());
//
//        KingdomFactory kingdomFactory = FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF);
//        Castle castle = kingdomFactory.createCastle();
//        King king = kingdomFactory.createKing();
//        Army army = kingdomFactory.createArmy();
//        System.out.println(castle.getDescription());
//        System.out.println(king.getDescription());
//        System.out.println(army.getDescription());
    }
}
