package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setMinStationTest() {      //Выбор минимальной радиостанции
        radio.setMaxRadioStation(0);
        Assertions.assertEquals(0, radio.getMaxRadioStation());
    }

    @Test
    public void setMaxStationTest() {      //Выбор максимальной радиостанции
        radio.setMaxRadioStation(9);
        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void nextStation() {     //Следующая радиостанция
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentStation(4);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationTest() {     //Предыдущая радиостанция
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentStation(4);
        radio.prevCurrentRadioStation();
        Assertions.assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStation() { //Текущая радиостанция
        radio.setCurrentStation(4);
        Assertions.assertEquals(4, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStationAfterMaxTest() {     //Следущая радиостанция после Max
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentStation(9);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMinBorderTest() {     //Предыдущая радиостанция после минимальной
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.prevCurrentRadioStation();

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation() { //
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentStation(8);
        radio.setCurrentStation(-1);
        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void setMaxSoundVolumeTest() {  //Максимальная громкость звука
        radio.setMaxVolume(100);
        Assertions.assertEquals(100, radio.getMaxSoundVolume());
    }

    @Test
    public void setMinVolumeTest() {  //Минимальная громкость звука
        radio.setMinSoundVolume(0);
        Assertions.assertEquals(0, radio.getMinVolume());

    }

    @Test
    public void setCurrentSoundVolume() { //Текущая громкость звука
        radio.setCurrentSoundVolume(70);
        Assertions.assertEquals(70, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume() { //Громкость звука предыдущая после текущей
        radio.setMaxVolume(100);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(40);
        radio.prevCurrentSoundVolume();
        Assertions.assertEquals(39, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
        radio.setMaxVolume(100);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(7);
        radio.setCurrentSoundVolume(160);
        Assertions.assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume() { // Громкость звука следующая после текущей
        radio.setMaxVolume(100);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(4);
        radio.nextCurrenSoundVolume();
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume() {  //Громкость звука следующая после максимальной
        radio.setMaxVolume(100);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(100);
        radio.nextCurrenSoundVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseSoundVolumeLessMinTest() {      //
        radio.setMaxVolume(100);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(50);
        radio.setCurrentSoundVolume(-1);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentSoundVolumeTestMinBorderVolume() { //Минимальная граница громкости звука
        radio.setMaxVolume(100);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(0);
        radio.prevCurrentSoundVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextSoundVolumeTest() {   // Увеличить громкость
        radio.setCurrentSoundVolume(50);
        radio.setMinSoundVolume(0);
        radio.setMaxVolume(100);
        radio.nextCurrenSoundVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());
    }


    @Test
    public void prevCurrentVolumeTest() {      //Уменьшить громкость
        radio.setCurrentSoundVolume(50);
        radio.setMinSoundVolume(0);
        radio.setMaxVolume(100);
        radio.prevCurrentSoundVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void getMinNotSoundVolume() { //Громкость звука меньше текущей
        radio.setCurrentSoundVolume(50);
        radio.setMinSoundVolume(0);
        radio.setMaxVolume(100);
        radio.prevCurrentSoundVolume();

        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownCurrentRadioVolumeZero() { //Звук ниже 0
        radio.setCurrentSoundVolume(0);
        radio.setCurrentSoundVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume() {
        radio.setMaxVolume(10);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(0);
        radio.prevCurrentSoundVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxVolumeTest() {
        radio.setMaxVolume(100);
        Assertions.assertEquals(100, radio.getMaxSoundVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {
        radio.setMaxVolume(10);
        radio.setMinSoundVolume(0);
        radio.setCurrentSoundVolume(7);
        radio.setCurrentSoundVolume(-1);
        Assertions.assertEquals(7, radio.getCurrentVolume());
    }
}

