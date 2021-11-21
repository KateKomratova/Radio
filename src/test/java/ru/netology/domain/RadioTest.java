package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldClickNextRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(5);
        radioStation.nextRadioStation();
        assertEquals(6, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickNextRadioStationMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.nextRadioStation();
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickPrevRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(6);
        radioStation.prevRadioStation();
        assertEquals(5, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickPrevRadioStationMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.prevRadioStation();
        assertEquals(9, radioStation.getCurrentRadioStation());
    }

    @Test
    void shouldClickIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.increaseVolume();
        assertEquals(6, volume.getCurrentVolume());
    }

    @Test
    void shouldClickIncreaseVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        assertEquals(10, volume.getCurrentVolume());
    }

    @Test
    void shouldClickIncreaseVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        assertEquals(1, volume.getCurrentVolume());
    }

    @Test
    void shouldClickTurnDownVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.turnDownVolume();
        assertEquals(5, volume.getCurrentVolume());
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
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(10);
        assertEquals(0, radioStation.getCurrentRadioStation());
    }
    @Test
    public void shouldUnderInitialRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);
        assertEquals(0, radioStation.getCurrentRadioStation());
    }

    @Test
    public void shouldOverInitialVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(12);
        assertEquals(0, volume.getCurrentVolume());
    }

    @Test
    public void shouldUnderInitialVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        assertEquals(0, volume.getCurrentVolume());
    }
}
