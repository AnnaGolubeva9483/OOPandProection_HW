package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void test() {
        Radio rad = new Radio();
    }

    @Test
    public void test2() {
        Radio rad = new Radio(9);

        Assertions.assertEquals(9, rad.getQuantityStation());
        Assertions.assertEquals(8, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getMinStation());
    }
}


