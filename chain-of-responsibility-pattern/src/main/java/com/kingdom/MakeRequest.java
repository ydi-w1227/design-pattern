package com.kingdom;

import com.kingdom.request.Request;
import com.kingdom.request.RequestType;

public class MakeRequest {
    public static void main(String[] args) {
        OrcKing orcKing = new OrcKing();
//        orcKing.makeRequest(new Request(RequestType.DEFEND_CASTLE, "Defend castle"));
        orcKing.makeRequest(new Request(RequestType.TORTURE_PRISONER, "Torture prisoner"));
//        orcKing.makeRequest(new Request(RequestType.COLLECT_TAX, "Collect tax"));

    }
}
