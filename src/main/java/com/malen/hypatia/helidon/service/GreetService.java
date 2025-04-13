package com.malen.hypatia.helidon.service;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.HttpService;

public class GreetService implements HttpService {
    @Override
    public void routing(HttpRules httpRules) {
        httpRules.get("/", (req, res) -> res.send("Hello World!\n"));
    }
}
