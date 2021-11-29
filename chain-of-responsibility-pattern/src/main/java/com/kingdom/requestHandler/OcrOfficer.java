package com.kingdom.requestHandler;

import com.kingdom.request.Request;
import com.kingdom.request.RequestType;

public class OcrOfficer extends RequestHandler {

    public OcrOfficer(RequestHandler handler) {
        super(handler);
    }

    @Override
    // handle the request or pass the request to next handler
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(req);
            req.makeHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
