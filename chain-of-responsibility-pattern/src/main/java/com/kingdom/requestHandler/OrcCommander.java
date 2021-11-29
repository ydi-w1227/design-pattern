package com.kingdom.requestHandler;

import com.kingdom.request.Request;
import com.kingdom.request.RequestType;

public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler handler) {
        super(handler);
    }

    @Override
    // handle the request or pass the request to next handler
    public void handleRequest(Request req) {
        // if RequestType = DEFEND_CASTLE, then this handler handles the request
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(req);
            req.makeHandled();
        } else {
            // next one in the chain handle the request
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
