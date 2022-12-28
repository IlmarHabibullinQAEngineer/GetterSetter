import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio(15);

    //СТАНЦИИ
    //Выбор определенной станции.
    @Test
    public void currentStationNew() {
        radio.setCurrentRadioStationNumber(5);

        Assertions.assertEquals(5, radio.getCurrentRadioStationNumber());
    }

    //Выбор Максимальной станции
    @Test
    public void currentStationNewMax() {
        radio.setCurrentRadioStationNumber(15);

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    //Выбор минимальной станции
    @Test
    public void currentStationNewMinChoice() {
        radio.setCurrentRadioStationNumber(1);

        Assertions.assertEquals(1, radio.getCurrentRadioStationNumber());
    }

    //Переключение на максимальную станцию
    @Test
    public void currentStationNewNextMax() {
        radio.setCurrentRadioStationNumber(14);

        radio.next();

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    //Переключение с максимальной на минимальную станцию
    @Test
    public void currentStationNewMaxMin() {
        radio.setCurrentRadioStationNumber(15);

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentRadioStationNumber());
    }

    //Переключение на минимальную станцию
    @Test
    public void currentStationNewMin() {
        radio.setCurrentRadioStationNumber(2);

        radio.prev();

        Assertions.assertEquals(1, radio.getCurrentRadioStationNumber());
    }

    //Переключение с минимальной на максимальную станцию
    @Test
    public void currentStationNewNullMax() {
        radio.setCurrentRadioStationNumber(1);

        radio.prev();
        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    //Выбор негативной 0 станции
    @Test
    public void currentStationNewNegativeNull() {
        radio.setCurrentRadioStationNumber(0);

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    //Негативная минусовая станция
    @Test
    public void currentNegativNewStation() {
        radio.setCurrentRadioStationNumber(-1);

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }

    //Негативная Плюсовая станция
    @Test
    public void currentNeagativeNewStationPlus(){
        radio.setCurrentRadioStationNumber(16);

        Assertions.assertEquals(15, radio.getCurrentRadioStationNumber());
    }


    //РАБОТА РАДИО БЕЗ ВЫСТАВЛЕННОЙ МАКСИМАЛЬНОЙ СТАНЦИИ
    //Выбор станции
    @Test
    public void currentStationMid() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        Assertions.assertEquals(5, radio.getCurrentRadioStationNumber());
    }

    //Выбор минимальной станции
    @Test
    public void currentStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        Assertions.assertEquals(1, radio.getCurrentRadioStationNumber());
    }

    //Выбор максимальной станции
    @Test
    public void currentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        Assertions.assertEquals(10, radio.getCurrentRadioStationNumber());
    }

    //Переключение на максимальную станцию
    @Test
    public void currentStationMaxNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.next();

        Assertions.assertEquals(10, radio.getCurrentRadioStationNumber());
    }

    //Переклчюение с макисмальной на минимальную
    @Test
    public void currentStationMaxNextMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        radio.next();

        Assertions.assertEquals(1, radio.getCurrentRadioStationNumber());
    }

    //Переключение станции с минимальной на следующую
    @Test
    public void currentStationMinNextTwo() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.next();

        Assertions.assertEquals(2, radio.getCurrentRadioStationNumber());
    }

    //Переключение станции со второй на первую
    @Test
    public void currentStationTwoPrevOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(2);

        radio.prev();

        Assertions.assertEquals(1, radio.getCurrentRadioStationNumber());
    }

    //Перелючение с минимальной на максимальную
    @Test
    public void currentStationMinprevMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);

        radio.prev();

        Assertions.assertEquals(10, radio.getCurrentRadioStationNumber());
    }

    //Переключение с макимальной на одну станцию
    @Test
    public void currentStationMaxPrevNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentRadioStationNumber());
    }

    //Выбор нулевой станции
    @Test
    public void currentStationNull(){
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prev();

        Assertions.assertEquals(10, radio.getCurrentRadioStationNumber());
    }


    //ГРОМКОСТЬ
    //Выбор громкости
    @Test
    public void currentVolumeNewMid() {
        radio.setCurrentVolume(50);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    //Выбор минимальной громкости
    @Test
    public void currentVolumeNewMin() {
        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    //Выбор максимальной громкости
    @Test
    public void currentVolumeNewMax() {
        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    //Прибавление громкости в середение
    @Test
    public void currentVolumeNewMidPlus() {
        radio.setCurrentVolume(50);

        radio.plus();

        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    //Прибавление громкости на максимальную
    @Test
    public void currentVolumeNewMaxPlus() {
        radio.setCurrentVolume(99);

        radio.plus();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    //Прибавление к максимальной скорости
    @Test
    public void currentVolumeNewMaxPlusHundrend() {
        radio.setCurrentVolume(100);

        radio.plus();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    //Убавление на минимальную громкость
    @Test
    public void currentVolumeNewMinMinus() {
        radio.setCurrentVolume(1);

        radio.minis();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    //Убавление громкости с нуля
    @Test
    public void currentVolumeNewMinusNull() {
        radio.setCurrentVolume(0);

        radio.minis();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
