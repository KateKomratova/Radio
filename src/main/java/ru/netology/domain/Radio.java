package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;
    private int maxNumberRadioStation = 10;
    private int minRadioStation;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }


    public void nextRadioStation() {
        if (currentRadioStation == maxNumberRadioStation--) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxNumberRadioStation--;
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
        if (currentRadioStation > maxNumberRadioStation--) {
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


    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
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


