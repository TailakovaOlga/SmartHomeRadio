package ru.netology.radio;

public class Radio {
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentSoundVolume;
    private int currentRadioStation;

    public int getMaxRadioStation() {  // Опции Радиоcтанций
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentStation(int currentRadioStation) {  // Установка радиостанции
        if (currentRadioStation < maxRadioStation) {
        }

        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentRadioStation() {   // Следущая радиостанция
        int currentStation = this.currentRadioStation;
        if (currentStation >= maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        } else {
            this.currentRadioStation = currentStation + 1;
        }
    }

    public void prevCurrentRadioStation() {     // Предыдущая радиостанция
        int currentStation = this.currentRadioStation;
        if (currentStation <= minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getMaxSoundVolume() {    // Опции громкости звука
        return maxSoundVolume;
    }

    public void setMaxVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getCurrentVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {  // Установка громкости звука
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void nextCurrenSoundVolume() {   //  Громкости звука следующая за максимальной
        int currentSoundVolume = this.currentSoundVolume;
        if (currentSoundVolume == maxSoundVolume) {
            this.currentSoundVolume = maxSoundVolume;
        } else {
            this.currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void prevCurrentSoundVolume() {   //Громкость звука предыдущая текущей
        int currentVolume = this.currentSoundVolume;
        if (currentVolume == minSoundVolume) {
            this.currentSoundVolume = minSoundVolume;
        } else {
            this.currentSoundVolume = currentSoundVolume - 1;
        }
    }
}








