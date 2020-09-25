package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mCount = 11;
        int player = 1;
        String playerName;
        System.out.println("Игра 11");
        System.out.println("На столе 11 спичек, необходимо вытягивать" + System.lineSeparator()
                + "от 1-ой до 3-ех спичек, победит тот кто" + System.lineSeparator()
                + "заберёт последние спички.");
        boolean check = mCount > 0;
        while (check) {
            if (player == 1) {
                playerName = "1-ый игрок";
            } else {
                playerName = "2-ой игрок";
            }
            System.out.println(playerName);
            System.out.println("Сколько спичек вы возьмете?");
            int count = Integer.valueOf(input.nextLine());
            while (true) {
                if (count >= 1 && count <= 3) {
                    mCount -= count;
                    break;
                } else {
                    System.out.println("Вы ввели некорректное числою." + System.lineSeparator()
                                        + "Попробуйте ещё раз.");
                    count = Integer.valueOf(input.nextLine());
                }
            }
            System.out.println("Осталось " + mCount + " спич(ек)/(ка) на столе.");
            if (mCount <= 0) {
                System.out.println(playerName + " ВЫ ПОБЕДИЛИ!!!");
                break;
            }
            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
        }
    }
}
