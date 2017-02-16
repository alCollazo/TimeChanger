package collazo.albert;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeChanger {

    private final String[] hours = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private final String[] tens = {"","", "Twenty", "Thirty", "Forty", "Fifty"};

   /* public int splitHoursFromMinutes(String item){
        int hour =0;
        Matcher m = Pattern.compile("(\\d+)(:)(\\d+)").matcher(item);
        while (m.find()){
        hour = Integer.parseInt(m.group(1));
        }
        return hour;
    }

    public String splitColonFromString(String item){
        String colon = ":";
        Matcher m = Pattern.compile("(\\d+)(:)(\\d+)").matcher(item);
        while(m.find()){
            colon = m.group(2);
        }
        return colon;
    }

    public int splitMinutesFromHours(String item){
        int minute = 0;
        Matcher m = Pattern.compile("(\\d+)(:)(\\d+)").matcher(item);
        while(m.find()){
            minute = Integer.parseInt(m.group(3));
        }
        return minute;
    }*/

    public String convertNumber(int hour, int minute){
        String time = "";
        time += hours[hour];
        time += " ";
        if (minute < 20)
            time += hours[minute];
        else if(minute >= 20){
            if(hours[minute % 10].equals("Zero")) {
                time += tens[minute / 10];
                time += " ";
            }
            else
                time += tens[minute / 10] + " "+ hours[minute % 10];
        }
        return time;
        }
    }
