package com.kingdom.army;

import com.kingdom.army.Army;

public class OrcArmy implements Army {
    static final String DESCRIPTION = "This is the orc king.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
