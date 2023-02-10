package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;
    private int maxVolume = 100;

    public Radio() {
        this.maxRadioStation = 9;
    }

    public Radio(int RadioStationCount) {
        this.maxRadioStation = RadioStationCount - 1;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
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
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
        } else currentRadioStation = 0;
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else currentRadioStation = maxRadioStation;
    }
}
