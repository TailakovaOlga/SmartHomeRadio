package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetCurrentRadioStation() {//Установи текущую радиостанцию
        Radio radio = new Radio();
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnNextRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void setStation() {      //Выбор станции
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setSoundVolume(volume);
        // radio.volumeDownForOne();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseSoundVolumeByOne() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.getSoundVolume();
        int expected = 1;
        int actual = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnNextRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void increaseVolume() {   //прибавить громкость
        radio.setCurrentVolume(5);
        radio.currentSoundVolumeUp();

        int expected = 6;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {   //прибавить громкость больше Max
        radio.setCurrentVolume(100);
        radio.currentSoundVolumeUp();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {      //убавить громкость
        radio.setCurrentVolume(5);
        radio.currentsoundVolumeDown();

        int expected = 4;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessMin() {      //убавить громкость меньше мин
        radio.setSoundVolume(0);
        radio.currentsoundVolumeDown();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAnyCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxNotCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);
        radio.setNextCurrentRadioStation();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.setNextCurrentRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.setPrevCurrentRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevCurrentNumberRadioStationZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.setPrevCurrentRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

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
    public void shouldSetAnyCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(50);

        int expected = 50;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(89);
        radio.setDownCurrentSoundVolume();

        int expected = 88;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownCurrentRadioVolumeZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.setDownCurrentSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}




