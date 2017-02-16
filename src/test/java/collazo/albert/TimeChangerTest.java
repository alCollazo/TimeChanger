package collazo.albert;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class TimeChangerTest {
    TimeChanger timeChanger;

    @Before
    public void setup(){
        timeChanger = new TimeChanger();
    }
    //String time = "12:30";


 /*  @Test
    public void splitHoursFromMinutesTest(){
        Integer expected = 12;
        Integer actual = timeChanger.splitHoursFromMinutes(time);
        assertEquals(expected,actual);
    }

    @Test
    public void splitColonFromTimeTest(){
        String expected = ":";
        String actual = timeChanger.splitColonFromString(time);
        assertEquals(expected,actual);
    }

    @Test
    public void splitMinutesFromHoursTest(){
        Integer expected = 30;
        Integer actual = timeChanger.splitMinutesFromHours(time);
        assertEquals(expected,actual);
    }*/

    @Test
    public void convertNumberTest(){
        String expected = "Twelve Fifty Nine";
        String actual = timeChanger.convertNumber(12,59);
        assertEquals(expected, actual);
    }
}
