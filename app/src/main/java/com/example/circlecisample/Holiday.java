package com.example.circlecisample;

import java.util.Calendar;

public class Holiday {

    private static final int DECEMBER = 12;
    private static final int DAY_OF_XMAS = 25;
    private static final int DAY_OF_XMAS_NIGHT = 24;

    public String sayXmas() {
        int month = getCurrentMonth();
        int day = getCurrentDayOfMonth();

        if (month == DECEMBER && (day == DAY_OF_XMAS || day == DAY_OF_XMAS_NIGHT)) {
            return "Merry Xmas";
        } else {
            return "Today is not Xmas";
        }
    }

    protected int getCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    protected int getCurrentDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }
}
