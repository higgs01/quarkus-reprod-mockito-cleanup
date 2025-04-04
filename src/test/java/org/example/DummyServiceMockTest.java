package org.example;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectSpy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@QuarkusTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DummyServiceMockTest {

    @InjectSpy
    DummyService dummyService;

    @Test
    void testWithMock() {
        when(dummyService.foo(any())).thenReturn("test");
        assertEquals("test", dummyService.foo("test"));
    }

    @Test
    void testWithoutMock() {
        var result = dummyService.foo("bar");
        assertEquals("bar", result);
    }

}
