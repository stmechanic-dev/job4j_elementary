package ru.job4j.oop.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int index = 0;
        for (String s : value) {
            if (key.equals(s)) {
               rsl = index;
            }
            index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Неудалось найти элемент.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = new String[] {"1", "2", "3"};
        String word = "4";
        try {
            indexOf(array, word);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
