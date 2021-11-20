package com.kingdom.requestHandler;

import com.kingdom.request.Request;

public abstract class RequestHandler {
    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    // if next handler is not null, then pass request to next handler
    // commander -> officer -> soldier
    public void handleRequest(Request req) {
        if (next != null) {
            System.out.println(next);
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this.toString() + " handling request " + req);
    }

    @Override
    public abstract String toString();
}
