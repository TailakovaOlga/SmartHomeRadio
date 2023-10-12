package ru.netology.radio;

public class Radio {
    private int currentRadioStation;   //Текущая радиотанции
    private int currentSoundVolume;   //Текущая громкость звука
    private int soundVolume;   //Громкость звука
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;


    public int getCurrenSoundVolume() {
        return currentSoundVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {  // Установка радиостанции
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentSoundVolume = newCurrentVolume;
    }

    public void setNextCurrentRadioStation() {
        if (currentRadioStation < maxNumberRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = maxNumberRadioStation;
        }
    }

    public void setPrevCurrentRadioStation() {
        if (currentRadioStation > minNumberRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxNumberRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > maxSoundVolume) {
            return;
        }
        if (newCurrentRadioVolume < minSoundVolume) {
            return;
        }
        currentSoundVolume = newCurrentRadioVolume;
    }

    public void setUpCurrentSoundVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        } else {
            currentSoundVolume = maxSoundVolume;
        }
    }

    public void setDownCurrentSoundVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = minSoundVolume;
        }
    }

    public void next() {                // Следущая радиостанция
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {                // Предыдущая радиостанция
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void changeOnNextRadioStation() { //Переключить на следующую радиостанцию
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation++;
    }

    public int getSoundVolume() {

        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {

        this.soundVolume = soundVolume;
    }

    //public void increaseSoundVolumeByOne() {   // увеличение громкости на 1
    //    if (currentSoundVolume < 100) {
          //  currentSoundVolume = currentSoundVolume + 1;
       // }
    //}

    public void currentSoundVolumeUp() {                // увеличение громкости на 1
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void currentsoundVolumeDown() {              // уменьшение громкости на 1
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}

        // public void nextCurrentRadioStation() {                // следующая радиостанция
        //  if (currentRadioStation < 9) {
        //      currentRadioStation = currentRadioStation + 1;
        // } else {
        //     currentRadioStation = 0;




















