public class Radio {
    private int radioStationAmount = 10;
    private int currentRadioStation;
    private int currentVolume;

    public Radio(int radioStationAmount) {

        this.radioStationAmount = radioStationAmount;
        this.currentRadioStation = 0;

    }

    public Radio() {

        this.radioStationAmount = 10;
        this.currentRadioStation = 0;
    }


    public int getRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < radioStationAmount - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = radioStationAmount - 1;
        }
    }

    public void setRadioStation(int station) {
        if (station < 0) {
            return;
        }
        if (station >= radioStationAmount) {
            return;
        }
        currentRadioStation = station;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        currentVolume = volume;
    }


    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }


    }

}
