package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testSum() {
        App app = new App();
        assertEquals(7, app.sum(3, 4));
    }
}
