package ru.job4j.oop;

public class JukeBox {
    public static void main(String[] args) {
        JukeBox phonograf = new JukeBox();
        phonograf.music(1);
        phonograf.music(2);
        phonograf.music(3);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
