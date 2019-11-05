package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        changescd changescd = new changescd();
        int Time1,Time2,TimeD;
        Time1 = changescd.getTotal(1);
        Time2 = changescd.getTotal(2);
        TimeD=Math.abs(Time1-Time2);
        System.out.printf("¨Time difference %d",TimeD);
    }
}