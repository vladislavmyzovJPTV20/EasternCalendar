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
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        int rule = (year/10)*10; // Делим введённый год на десять, а потом умножаем на десять
        int colour1 = year - rule; // Вычитаем rule от вашего года рождения и получаем остаток
        int animals = year%12; // Делим год нашего рождения на 12 с остатком, чтобы в будущем определить животное

        System.out.print("Вы родились в год ");

        switch (animals) { // Создаем условний оператор свитч-кейс для того, чтобы сравнивать наше значение с другими значениями
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
        switch (colour1) {
            case 0:
            case 1:
                System.out.print("белой ");
                break;
            case 2:
            case 3:
                System.out.print("черной ");
                break;
            case 4:
            case 5:
                System.out.print("зеленой ");
                break;
            case 6:
            case 7:
                System.out.print("красной ");
                break;
            case 8:
            case 9:
                System.out.print("желтой ");
                break;
            default:
                break;
        }
                break;
            
            case 6:
            case 7:
            case 8:
        switch (colour1) {
            case 0:
            case 1:
                System.out.print("белого ");
                break;
            case 2:
            case 3:
                System.out.print("черного ");
                break;
            case 4:
            case 5:
                System.out.print("зеленого ");
                break;
            case 6:
            case 7:
                System.out.print("красного ");
                break;
            case 8:
            case 9:
                System.out.print("желтого ");
                break;
            default:
                break;
        }
                break;
        }

        switch (animals) {
            case 0:
                System.out.println("обезьяны!");
                break;
            case 1:
                System.out.println("курицы!");
                break;
            case 2:
                System.out.println("собаки!");
                break;
            case 3:
                System.out.println("свиньи!");
                break;
            case 4:
                System.out.println("крысы!");
                break;
            case 5:
                System.out.println("коровы!");
                break;
            case 6:
                System.out.println("тигра!");
                break;
            case 7:
                System.out.println("кролика!");
                break;
            case 8:
                System.out.println("дракона!");
                break;
            case 9:
                System.out.println("змеи!");
                break;
            case 10:
                System.out.println("лошади!");
                break;
            case 11:
                System.out.println("овцы!");
                break;
        }
    }
}