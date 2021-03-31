package helloworld;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getString() {

        Main m = new Main();
        String expected = "Hello World!";
        String actual = m.getString();
        assertEquals(expected, actual);


    }
}