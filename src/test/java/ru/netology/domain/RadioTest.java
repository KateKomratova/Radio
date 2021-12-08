package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldClickNextRadioStation() {
        Radio radioStation = new Radio(12);
        radioStation.setCurrentRadioStation(5);
        radioStation.nextRadioStation();
        assertEquals(6, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickNextRadioStationDefault() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.nextRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickNextRadioStationLast() {
        Radio radioStation = new Radio(18);
        radioStation.setCurrentRadioStation(16);
        radioStation.nextRadioStation();
        assertEquals(17, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickNextRadioStationMin() {
        Radio radioStation = new Radio(31);
        radioStation.setCurrentRadioStation(0);
        radioStation.nextRadioStation();
        assertEquals(1, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickNextRadioStationMax() {
        Radio radioStation = new Radio(12);
        radioStation.setCurrentRadioStation(11);
        radioStation.nextRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickPrevRadioStation() {
        Radio radioStation = new Radio(15);
        radioStation.setCurrentRadioStation(14);
        radioStation.prevRadioStation();
        assertEquals(13, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickPrevRadioStationMin() {
        Radio radioStation = new Radio(13);
        radioStation.setCurrentRadioStation(0);
        radioStation.prevRadioStation();
        assertEquals(12, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickPrevRadioStationLast() {
        Radio radioStation = new Radio(15);
        radioStation.setCurrentRadioStation(14);
        radioStation.prevRadioStation();
        assertEquals(13, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(75);
        volume.increaseVolume();
        assertEquals(76, volume.getCurrentVolume());
    }

    @Test
    void shouldClickIncreaseVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    void shouldClickIncreaseVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-5);
        volume.increaseVolume();
        assertEquals(1, volume.getCurrentVolume());
    }

    @Test
    void shouldClickTurnDownVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(55);
        volume.turnDownVolume();
        assertEquals(54, volume.getCurrentVolume());
    }

    @Test
    void shouldClickTurnDownVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.turnDownVolume();
        assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    void shouldOverInitialRadioStation() {
        Radio radioStation = new Radio(50);
        radioStation.setCurrentRadioStation(58);
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldUnderInitialRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-10);
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldOverInitialVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(105);
        assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldUnderInitialVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-50);
        assertEquals(0, volume.getCurrentVolume());
    }
}
