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
        assertEquals("Merry Xmas", holiday.sayXmas());
    }

    @Test
    public void today_is_xmas_12_24() {
        Holiday holiday = spy(Holiday.class);
        when(holiday.getCurrentMonth()).thenReturn(12);
        when(holiday.getCurrentDayOfMonth()).thenReturn(24);
        assertEquals("Merry Xmas", holiday.sayXmas());
    }

    @Test
    public void today_is_not_xmas_11_24() {
        Holiday holiday = spy(Holiday.class);
        when(holiday.getCurrentMonth()).thenReturn(11);
        when(holiday.getCurrentDayOfMonth()).thenReturn(24);
        assertEquals("Today is not Xmas", holiday.sayXmas());
    }
}
