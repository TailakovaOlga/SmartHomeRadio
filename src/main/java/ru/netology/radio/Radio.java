package ru.netology.radio;

public class Radio {
    private int currentRadioStation;   //Текущая радиотанции
    public int currentSoundVolume;   //Текущая громкость звука
    public int soundVolume;   //Громкость звука
    private int MaxNumberRadioStation = 9;
    private int MinNumberRadioStation = 0;
    private int CurrentRadioVolume;
    private int MaxSoundVolume = 100;
    private int MinSoundVolume = 0;


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
        if (currentRadioStation < MaxNumberRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = MaxNumberRadioStation;
        }
    }

    public void setPrevCurrentRadioStation() {
        if (currentRadioStation > MinNumberRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = MaxNumberRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return CurrentRadioVolume;
    }

    public void setCurrentSoundVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume > MaxSoundVolume) {
            return;
        }
        if (newCurrentRadioVolume < MinSoundVolume) {
            return;
        }
        CurrentRadioVolume = newCurrentRadioVolume;
    }

    public void setUpCurrentSoundVolume() {
        if (CurrentRadioVolume < MaxSoundVolume) {
            CurrentRadioVolume = CurrentRadioVolume + 1;
        } else {
            CurrentRadioVolume = MaxSoundVolume;
        }
    }

    public void setDownCurrentSoundVolume() {
        if (CurrentRadioVolume > MinSoundVolume) {
            CurrentRadioVolume = CurrentRadioVolume - 1;
        } else {
            CurrentRadioVolume = MinSoundVolume;
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


    public void changeOnPreviousRadioStation() { //Переключение на 9 радиостанцию, если текущая радиостанция 0
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation--;
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
        if (soundVolume > 0) {
        }
        if (soundVolume < 100) {
        }
        this.soundVolume = soundVolume;
    }


    // public void volumeDownForByOne() {
    //    if (soundVolume == 0) {
    //       this.soundVolume = soundVolume;
    //  }
    //  if (soundVolume > 0) {
    //     this.soundVolume--;
    // }
    //}

    public void increaseCurrentSoundVolumeByOne() {   // увеличение громкости на 1
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
            for (int i = 0; i < currentSoundVolume; i++) {
            }
        }
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

    // public void nextCurrentRadioStation() {                // следующая радиостанция
    //  if (currentRadioStation < 9) {
    //      currentRadioStation = currentRadioStation + 1;
    // } else {
    //     currentRadioStation = 0;
}















