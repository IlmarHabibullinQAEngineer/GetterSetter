public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        if (currentRadioStationNumber != minRadioStation) {
            return currentRadioStationNumber;
        } else {
            return currentRadioStationNumber = maxRadioStation + 1;
        }
    }

    public Radio() {

    }

    //Выбор количества станций.
    public Radio(int selectingStationNumber) {
        this.maxRadioStation = selectingStationNumber - 1;
    }

    //Проверка количества станций.
    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < minRadioStation) {
            return;
        }
        if (currentRadioStationNumber > maxRadioStation + 1) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    //Переключене станций вперед
    public void next() {
        if (currentRadioStationNumber != maxRadioStation + 1) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minRadioStation + 1;
        }
    }

    //Переключение станции назад.
    public void prev() {
        if (currentRadioStationNumber != minRadioStation) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxRadioStation + 1 ;
        }
    }

    //ГРОМКОСТЬ
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    //Прибавление громкости
    public int plus() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    //Убавление громкости
    public int minis() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
