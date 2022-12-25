import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //СТАНЦИИ
    //Выбор определенной станции.
    @Test
    public void currentRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Выбор несуществующей 10 станции.
    @Test
    public void currentRadioStationTen() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Выбор несуществующей -1 станции.
    @Test
    public void currentRadioStationMinusOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    //Переключение станции в середине выбора.
    @Test
    public void currentStationForwardFiveSix() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Переключение станции с 8 на 9.
    @Test
    public void currentStationForwardNineNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Переключение станции с 9 на 0.
    @Test
    public void currentStationForward() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Переключение станции с 0 на 1.
    @Test
    public void currentStationForwardNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Переключение станции с 1 на 0.
    @Test
    public void currentStationForwardBackOneNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Переключении станции назад от 0 станции на 9.
    @Test
    public void currentStationForwardBackNullNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Переключение станции с 9 на 8.
    @Test
    public void currentStationForwardBackNineEigh() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //ГРОМКОСТЬ
    //Выбор определенной станции
    @Test
    public void currentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Выбор несуществующей громкости 11.
    @Test
    public void currentVolumeEleven() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Выбор несуществующей громкости -1.
    @Test
    public void currentVolumeMinusOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Прибавление громкости
    @Test
    public void currentVolumePlus(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.plus();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Прибавление громкости от 0 к 1.
    @Test
    public void currentVolumePlusNullOne(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.plus();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Прибавление громкости от 9 к 10.
    @Test
    public void currentVolumePlusNineTen(){
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.plus();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Прибавление громкости к пределу громкости 10.
    @Test
    public void currentVolumePlusTenTen(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.plus();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Убавление громкости от 10 к 9.
    @Test
    public void currentVolumeMinusTenNine(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.minis();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Убавление громкости от 1 к 0.
    @Test
    public void currentVolumeMinusOneNull(){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.minis();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Убавление громкости от 0 к -1.
    @Test
    public void currentVolumeMinusNull(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.minis();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
