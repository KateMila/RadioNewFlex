package ru.netology;

public class Radio {

    private static final int MAX_STATION = 9;
    private static final int MAX_VOLUME = 10;
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= MAX_STATION) {
            this.currentStation = station;
        }
    }

    public void switchToNextStation() {
        this.currentStation = (this.currentStation == MAX_STATION) ? 0 : ++this.currentStation;
    }

    public void switchToPreviousStation() {
        this.currentStation = (this.currentStation == 0) ? MAX_STATION : --this.currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= MAX_VOLUME) {
            this.currentVolume = currentVolume;
        }
    }

    public void increaseVolume() {
        this.currentVolume = (this.currentVolume == MAX_VOLUME) ? 0 : ++this.currentVolume;
    }

    public void reduceVolume() {
        this.currentVolume = (this.currentVolume == 0) ? MAX_VOLUME : --this.currentVolume;
    }


}
