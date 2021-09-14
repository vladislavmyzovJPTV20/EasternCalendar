/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easterncalendar;

import java.util.Scanner;

/**
 *
 * @author Влад
 */
public class EasternCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш год рождения: ");
        int year = scanner.nextInt();
        //int animals = (year + 8) % 12;
        //int colors1 = year % 10;
        //int colors2 = (year + 1) % 5;
        int colors1;
        int colors2;
        int animals;
        
        System.out.print("Вы родились в год ");
        
        switch(colors1 = year % 10) {
            case 0:
            case 1:
                System.out.print("бел");
                break;
            case 2:
            case 3:
                System.out.print("чёрн");
                break;
            case 4:
            case 5:
                System.out.print("зелён");
                break;
            case 6:
            case 7:
                System.out.print("красн");
                break;
            case 8:
            case 9:
                System.out.print("жёлт");
                break;
            }
        
        switch(colors2 = (year + 1) % 5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
                System.out.print("ой ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("ого ");
                break;
            }
        
        switch(animals = (year + 8) % 12) {        
            case 0:
                System.out.print("крысы");
                break;
            case 1:
                System.out.print("коровы");
                break;
            case 2:
                System.out.print("тигра");
                break;
            case 3:
                System.out.print("зайца");
                break;
            case 4:
                System.out.print("дракона");
                break;
            case 5:
                System.out.print("змеи");
                break;
            case 6:
                System.out.print("лошади");
                break;
            case 7:
                System.out.print("овцы");
                break;
            case 8:
                System.out.print("обезьяны");
                break;
            case 9:
                System.out.print("курицы");
                break;
            case 10:
                System.out.print("собаки");
                break;
            case 11:
                System.out.print("свиньи");
                break;
        }
            
    }
    
}
