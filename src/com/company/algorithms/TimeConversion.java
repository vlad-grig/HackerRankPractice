package com.company.algorithms;

public class TimeConversion {

    public static void main(String[] args) {
        String s = "10:05:45AM";
        String timeConversion = timeConversion(s);
        System.out.println(timeConversion);
    }

    private static String timeConversion(String s) {
        String time24hFormat = "";
        String hour = s.substring(0, 2);
        String minuteAndSecond = s.substring(2);
        if (s.contains("AM")) {
            if (hour.contains("12")) {
                hour = "00";
                return getString(hour, minuteAndSecond);
            }
        }
        if (s.contains("PM")) {
            for(int index = 1; index < 12; index++) {
                if (Integer.parseInt(String.valueOf(hour.charAt(1))) == index) {
                    int parseInt = Integer.parseInt(hour);
                    parseInt += 12;
                    if (parseInt < 24) {
                        hour = Integer.toString(parseInt);
                        return getString(hour, minuteAndSecond);
                    }
                }
                if (hour.contains(Integer.toString(index))) {
                    int parseInt = Integer.parseInt(hour);
                    parseInt += 12;
                    if (parseInt < 24) {
                        hour = Integer.toString(parseInt);
                        return getString(hour, minuteAndSecond);
                    }
                }
            }
        }
        time24hFormat = s.substring(0, s.length() - 2);
        return time24hFormat;
    }

    private static String getString(String hour, String minuteAndSecond) {
        String concat24hFormat = hour.concat(minuteAndSecond);
        concat24hFormat = concat24hFormat.substring(0, concat24hFormat.length() - 2);
        return concat24hFormat;
    }
}
