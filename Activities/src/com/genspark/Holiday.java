package com.genspark;

import java.util.ArrayList;


public class Holiday {
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    private final String name;
    private final int day;
    private final String month;

    public boolean inSameMonth(Holiday h2) {
        return this.month.equals(h2.month);
    }
    public double avgDate(ArrayList<Holiday> holidays){
        int length = holidays.size();
        int sum =0;
        for (Holiday holy:holidays){
            sum +=holy.day;
        }
        return Double.parseDouble(String.valueOf(sum/length));
    }

    public static void main(String[] args){
        Holiday holiday = new Holiday("Independence Day",4,"July");
        Holiday holiday1 = new Holiday("b Day",4,"August");
        Holiday holiday2 = new Holiday("c Day",4,"July");
        ArrayList<Holiday> holidays = new ArrayList<Holiday>();
        holidays.add(holiday);
        holidays.add(holiday1);
        holidays.add(holiday2);
        System.out.println(holiday.avgDate(holidays));
        System.out.println(holiday2.inSameMonth(holiday1));
    }
}
