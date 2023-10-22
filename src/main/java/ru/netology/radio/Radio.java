package ru.netology.radio;

public class Radio {
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 9;
    private int currentSoundVolume;
    private int currentNumberRadioStation;
    private int countRadioStation = 10;

    //public Radio() {
    //    this.currentNumberRadioStation = maxNumberRadioStation;
    //    this.countRadioStation = countRadioStation;
    //  }

    // public Radio(int countRadioStation) {
//this.countRadioStation = 10;
    //   }
    public Radio(int countRadioStation) {
        this.maxNumberRadioStation = countRadioStation - 1;
    }

    public Radio() {
        this.maxNumberRadioStation = 9;
    }

    // public Radio() {
    //   this.minNumberRadioStation = minNumberRadioStation;
    //  this.maxNumberRadioStation = maxNumberRadioStation;
    //  this.currentNumberRadioStation = minNumberRadioStation;
    //this.countRadioStation = countRadioStation;
    //   }

    public int getCurrentNumberRadioStation() {

        return currentNumberRadioStation;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    // public void setNumberRadioStation(int numberRadioStation) {
    //  if (currentNumberRadioStation > maxNumberRadioStation) {
    //      this.currentNumberRadioStation = 9;
    //   }
    //   if (currentNumberRadioStation < minNumberRadioStation) {
    //      this.currentNumberRadioStation = 0;
    //  }
    //  }
    public void setNextCurrentNumberRadioStation() {
        if (currentNumberRadioStation < maxNumberRadioStation) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else {
            //currentNumberRadioStation = maxNumberRadioStation;
            currentNumberRadioStation = 0;
        }
    }

    public void setPrevCurrentNumberRadioStation() {
        if (currentNumberRadioStation > minNumberRadioStation) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        } else {
            currentNumberRadioStation = maxNumberRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume > maxSoundVolume) {
            return;
        }
        if (newCurrentSoundVolume < minSoundVolume) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void setUpCurrentSoundVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        } else {
            currentSoundVolume = maxSoundVolume;
        }
    }

    public void setDownCurrentRadioVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = minSoundVolume;
        }
    }
}

