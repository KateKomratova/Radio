package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation--;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }

        this.currentVolume = currentVolume;
    }
}


