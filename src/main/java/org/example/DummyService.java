package org.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DummyService {

    public String foo(String arg) {
        return arg;
    }

}
