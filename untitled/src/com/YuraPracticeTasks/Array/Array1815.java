package com.YuraPracticeTasks.Array;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.15
 * Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.
 *
 * После заполнения класс должен вывести на экран значения массива следующим образом:
 * • в первой строке - значения из четных ячеек массива;
 *  • во второй строке - значения из нечетных ячеек массива.
 *
 *
 *
 *  Задание 18.16 Напишите класс,
 *  который заполняет случайными двузначными числами массив,
 *  размер которого при инициализации вводится с клавиатуры.
 *  После заполнения класс должен вывести на экран значения массива следующим образом:
 *
 * • в первой строке - четные значения, содержащиеся в массиве;
 * • во второй строке - нечетные значения, содержащиеся в массиве.
 */

public class Array1815 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(" size massive?");

        int [] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) { // здесь я тоько заполняю массив !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            arr[i] = random.nextInt();
        }

        for (int i = 0; i < arr.length; i+=2) { // здесь уже только перебираю

            System.out.print(i + ": " + arr[i] + " ");

        }
        System.out.println();

        for (int i = 1; i < arr.length; i+=2) { // т здесь только перебипаю

            System.out.print(i + ": " + arr[i] + " ");
        }

        System.out.println();
        System.out.println(" task 1816 in here, cause i'm to lazy to right new task fo this  ");

        for (int i = 0; i < arr.length; i++) {          // т здесь только перебипаю

            if (arr[i] % 2 == 0){
                System.out.print(i + ": " + arr[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {            // т здесь только перебипаю

            if (arr[i] % 2 != 0) {
                System.out.print(i + ": " + arr[i] + " ");
            }

        }
    }
    /**
     * Вот сделал бы отдельно, не налажал бы;) смотри:
     * в строке 45 ты закончил заполнять массив. пусть он выглядит так:
     * [15 33 18 98 22]
     * в строке 54 ты его зачемто перезаполняешьб и получаешь тот-же массив но с другими значениями. например:
     * [88 11 93 21 35]
     * потом в строке 64 ты его еще раз перезаполняешь. и получаешь что-то типа того:
     * [78 15 90 34 56]
     * Вопрос - зачем ты его перезаполняешь? тебе нужно работать с первым вариантом везде.
     */
}
