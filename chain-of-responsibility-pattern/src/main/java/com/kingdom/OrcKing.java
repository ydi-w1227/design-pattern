package com.kingdom;

import com.kingdom.request.Request;
import com.kingdom.requestHandler.OcrOfficer;
import com.kingdom.requestHandler.OrcCommander;
import com.kingdom.requestHandler.OrcSoldier;
import com.kingdom.requestHandler.RequestHandler;

public class OrcKing {
    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        // request handler chain  {
        //        this.next = next;
        //    }
        // commander -> officer -> soldier -> null
        chain = new OrcCommander(new OcrOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req) {
        System.out.println(chain.toString());
        chain.handleRequest(req);
    }
}
