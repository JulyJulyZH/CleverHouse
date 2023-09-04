import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation ()
    {Radio radio = new Radio();
    radio.setRadioStation(3);
        int expected = 3;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationExcess()
    {Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.setRadioStation(12);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationUnder()
    {Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.setRadioStation(-2);
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStation()
    {Radio radio = new Radio();
        radio.setRadioStation(6);
        radio.nextRadioStation();
        int expected = 7;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStationExcess()
    {Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStation()
    {Radio radio = new Radio();
        radio.setRadioStation(2);
        radio.prevRadioStation();
        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStationUnder()
    {Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume()
    {Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume()
    {Radio radio = new Radio();
        radio.setVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolume()
    {Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotDecreaseVolume()
    {Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeExcess()
    {Radio radio = new Radio();
        radio.setVolume(94);
        radio.setVolume(102);
        int expected = 94;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolume()
    {Radio radio = new Radio();
        radio.setVolume(12);
        radio.setVolume(-10);
        int expected = 12;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
