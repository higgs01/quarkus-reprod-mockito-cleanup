package org.example;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

public class MicroServiceComponent {

    @Inject
    DummyService optionalDummyService;

    void onStart(@Observes StartupEvent ev) {
    }

}
