package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void testCurrentNumberStation() {

        //Assertions.assertEquals(9, radio.getMaxNumberRadioStation());
        //  Assertions.assertEquals(0, radio.getMinNumberRadioStation());
        Assertions.assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void testCurrentRadioVolume() {

        //  Assertions.assertEquals(100, radio.getVolume());
        //  Assertions.assertEquals(0, radio.getMinRadioVolume());
        Assertions.assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void testCountRadioStation() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(30, radio.getCountRadioStation());
    }

    @Test
    public void testNotCountRadioStation() {

        Assertions.assertEquals(10, radio.getCountRadioStation());
    }

    //   @Test
    //  public void testMaxNumberRadioStation() {
    //    Radio radio = new Radio(30);
//
    //    Assertions.assertEquals(29, radio.getMaxNumberRadioStation());
    // }

    /// @Test
    // public void testMaxRadioVolume() {
    // Radio radio = new Radio();
    //    radio.setCurrentSoundVolume(101);

    //    Assertions.assertEquals(100, radio.getMaxRadioVolume());
    //   Assertions.assertEquals(0, radio.getMinRadioVolume());
    //   Assertions.assertEquals(0, radio.getCurrentSoundVolume());
    //  }

    //  @Test
    //  public void testSmallRadioVolume() {
    //     radio.setCurrentSoundVolume(-1);

    //    Assertions.assertEquals(100, radio.getMaxRadioVolume());
    //   Assertions.assertEquals(0, radio.getMinRadioVolume());
    //   Assertions.assertEquals(0, radio.getCurrentSoundVolume());
    // }

    //  @Test
    // public void testBigCurrentNumberRadioStation() {
    //     radio.setCurrentNumberRadioStation(28);

    //     Assertions.assertEquals(9, radio.getMaxNumberRadioStation());
    //     Assertions.assertEquals(0, radio.getMinNumberRadioStation());
    //     Assertions.assertEquals(0, radio.getCurrentNumberRadioStation());
    // }

    //   @Test
    //  public void testSmallCurrentStation() {
    //      radio.setCurrentNumberRadioStation(-1);
//
    //    Assertions.assertEquals(9, radio.getMaxNumberRadioStation());
    //    Assertions.assertEquals(0, radio.getMinNumberRadioStation());
    //    Assertions.assertEquals(0, radio.getCurrentNumberRadioStation());
    // }

    // @Test

    //  public void shouldMinCurrentNumberRadioStation() {
    //     Radio radio = new Radio();

    //    radio.setCurrentNumberRadioStation(0);

    //   int expected = 0;
    //   int actual = radio.getCurrentNumberRadioStation();

    //   //   Assertions.assertEquals(expected, actual);
    //  }

    //  @Test

    // public void shouldMaxCurrentStationStation() {
    //    Radio radio = new Radio();

    //    radio.setCurrentNumberRadioStation(9);

    //   int expected = 9;
    //   int actual = radio.getCurrentNumberRadioStation();
//
    //    Assertions.assertEquals(expected, actual);
    // }


    @Test

    public void shouldAnyCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMinNotCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMaxNotCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetNextCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(2);
        radio.setNextCurrentNumberRadioStation();

        int expected = 3;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);
        radio.setNextCurrentNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(8);
        radio.setPrevCurrentNumberRadioStation();

        int expected = 7;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevCurrentNumberRadioStationZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(0);
        radio.setPrevCurrentNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMinNotCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMaxNotCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetMaxCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetMinCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetAnyCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(50);

        int expected = 50;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldUpCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(50);
        radio.setUpCurrentSoundVolume();

        int expected = 51;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldUpMaxCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.setUpCurrentSoundVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDownCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(89);
        radio.setDownCurrentRadioVolume();

        int expected = 88;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDownCurrentRadioVolumeZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.setDownCurrentRadioVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
