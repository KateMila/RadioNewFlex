package ru.netology;

public class Radio {

    private static final int DEFAULT_STATION_COUNT = 10;
    private static final int DEFAULT_MAX_VOLUME = 100;

    private final int stationsCount;
    private final int maxVolume;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.maxVolume = DEFAULT_MAX_VOLUME;
        this.stationsCount = DEFAULT_STATION_COUNT;
    }

    public Radio(int stationsCount) {
        this.maxVolume = DEFAULT_MAX_VOLUME;
        this.stationsCount = stationsCount;
    }

    public void switchToNextStation() {
        this.currentStation = (this.currentStation == stationsCount - 1) ? 0 : ++this.currentStation;
    }

    public void switchToPreviousStation() {
        this.currentStation = (this.currentStation == 0) ? stationsCount - 1 : --this.currentStation;
    }

    public void increaseVolume() {
        if (this.currentVolume != this.maxVolume) {
            this.currentVolume++;
        }
    }

    public void reduceVolume() {
        if (this.currentVolume != 0) {
            this.currentVolume--;
        }
    }

    public int getStationsCount() {
        return stationsCount;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < stationsCount) {
            this.currentStation = station;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= this.maxVolume) {
            this.currentVolume = currentVolume;
        }
    }
}

