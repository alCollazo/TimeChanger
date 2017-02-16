package collazo.albert;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        TimeChanger timeChanger = new TimeChanger();
        String wordForTime = timeChanger.convertNumber(12,30);
        System.out.println(wordForTime);
    }
}
