package com.example.circlecisample;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class HolidayTest {

    @Test
    public void today_is_xmas_12_25() {
        Holiday holiday = spy(Holiday.class);
        when(holiday.getCurrentMonth()).thenReturn(12);
        when(holiday.getCurrentDayOfMonth()).thenReturn(25);
        assertEquals("Merry Xmas1", holiday.sayXmas());
    }
}
