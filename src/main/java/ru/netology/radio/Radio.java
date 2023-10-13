package ru.netology.radio;

public class Radio {

    private int currentSoundVolume;   // Текущая громкость звука
    private int currentRadioStation;  // Текущая радиостанция

    public int getCurrentVolume() {
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

    public void volumeUp() {                // Увеличение громкости на 1
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void volumeDown() {              // Уменьшение громкости на 1
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

    public void next() {                 // Следущая радиостанция
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
}
