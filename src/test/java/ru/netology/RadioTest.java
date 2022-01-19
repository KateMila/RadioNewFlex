package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldGetCurrentStation() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationWhenStationGraterThenMaxAllowed() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationWhenStationAllowed() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationWhenStationNotAllowed() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSwitchToNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.switchToNextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToNextStation2() {
        Radio radio = new Radio();

        radio.switchToNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToNextStationWhenStationGraterThenMaxAllowed() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.switchToNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToNextStationWhenStationGraterWhenStationAllowed() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.switchToPreviousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwithToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.switchToPreviousStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void shouldSwithToPreviousStationValidValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.switchToPreviousStation();
        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwithToPreviousStationWhenStationMinValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.switchToPreviousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwithToPreviousStationGraterWhenStationAllowed() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.switchToPreviousStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSwithToPreviousStationWhencurrentStationMinValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.switchToPreviousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSetCurrentVolumeWhenVolumeGraterThenMaxAllowed() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeWhenVolumeAllowed() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeWhenVolumeNotAllowed() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeWhenValueIsValidByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseVolumeWhenValueIsValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldReduceVolumeWhenValueIsValidByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumebyOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.reduceVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumeInTheRangeValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolumeWhenVolumeAllowed() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
