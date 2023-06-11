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

       @Test
    public void setStation2() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation3() {
        Radio rad = new Radio();

        rad.setCurrentStation(11);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToNextStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldSetToIncreaseVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(80);

        rad.increaseVolume();

        int expected = 81;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDecreaseVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(65);

        rad.decreaseVolume();

        int expected = 64;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDecreaseVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume2() {
        Radio rad = new Radio();

        rad.setCurrentVolume(102);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}


