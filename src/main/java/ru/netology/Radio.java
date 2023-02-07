package ru.netology;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation >= 0 && newCurrentRadioStation <= 9) {
            currentRadioStation = newCurrentRadioStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 && newCurrentVolume <= 10) {
            currentVolume = newCurrentVolume;
        }
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }
}
