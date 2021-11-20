package com.kingdom.kingdom;

import com.kingdom.army.Army;
import com.kingdom.castle.Castle;
import com.kingdom.king.King;

// different version of kingdom will create different families of related objects
// KingdomFactory is a super factory of factories, an interface with a list of creation method for everyone in family
// declare interfaces for each distinct part of kingdom family
// each factory use their base class and will be overridden the initialization code for creating concrete objects

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
