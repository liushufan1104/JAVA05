package com.example.lib;
import java.util.Scanner;
public class changescd {
    private Scanner scanner = new Scanner(System.in);
    private int total,hr,min,sec = 0;
    public int getTotal(int i){
        System.out.printf("enter %d time,hr\n",i);
        hr = scanner.nextInt();
        System.out.printf("enter %d time,min\n",i);
        min = scanner.nextInt();
        System.out.printf("enter %d time,sec\n",i);
        sec = scanner.nextInt();
        total=hr*3600+min*60+sec;
        return total;
    }
}