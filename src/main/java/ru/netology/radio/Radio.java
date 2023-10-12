package ru.netology.radio;

public class Radio {
    private int currentRadioStation;   //Текущая радиотанции
    private int currentSoundVolume;   //Текущая громкость звука
    private int soundVolume;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;


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

    public void setDownCurrentSoundVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = minSoundVolume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

   public void setSoundVolume(int soundVolume) {
      this.soundVolume = soundVolume;
    }

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























