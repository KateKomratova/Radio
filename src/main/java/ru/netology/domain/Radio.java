package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(int currentRadioStation, int maxRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(int currentVolume, int minVolume, int maxVolume) {
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

}


