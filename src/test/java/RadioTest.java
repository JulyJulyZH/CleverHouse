import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio2 = new Radio(102);
    @Test
    public void defaultRadioStation() {
        int expected =0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void defaultRadioStationSet() {
        int expected = 0;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation() {
        radio.setRadioStation(3);
        int expected = 3;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationSet() {
        radio2.setRadioStation(3);
        int expected = 3;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationExcess() {
        radio.setRadioStation(10);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationExcessSet() {
        radio2.setRadioStation(103);
        int expected = 0;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNegativeNumSet() {
        radio2.setRadioStation(0);
        radio2.setRadioStation(-5);
        int expected = 0;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNegativeNum() {
        radio.setRadioStation(9);
        radio.setRadioStation(-2);
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        radio.setRadioStation(6);
        radio.nextRadioStation();
        int expected = 7;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStationSet() {
        radio2.setRadioStation(6);
        radio2.nextRadioStation();
        int expected = 7;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationExcess() {
        radio.setRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStationExcessSet() {
        radio2.setRadioStation(101);
        radio2.nextRadioStation();
        int expected = 0;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        radio.setRadioStation(2);
        radio.prevRadioStation();
        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStationSet() {
        radio2.setRadioStation(2);
        radio2.prevRadioStation();
        int expected = 1;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationUnder() {
        radio.setRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStationUnderSet() {
        radio2.setRadioStation(0);
        radio2.prevRadioStation();
        int expected = 101;
        int actual = radio2.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeExcess() {
        Radio radio = new Radio();
        radio.setVolume(94);
        radio.setVolume(102);
        int expected = 94;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(12);
        radio.setVolume(-10);
        int expected = 12;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}

