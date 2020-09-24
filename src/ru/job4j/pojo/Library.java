package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 649);
        Book thinkInJava = new Book("Thinking in Java", 568);
        Book atlant = new Book("Atlant", 351);
        Book revizor = new Book("Revizor", 495);
        Book[] array = new Book[4];
        array[0] = cleanCode;
        array[1] = thinkInJava;
        array[2] = atlant;
        array[3] = revizor;
        print(array);
        Book temp = array[3];
        array[3] = array[0];
        array[0] = temp;
        print(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i].getBookName().equals("Clean Code")) {
                System.out.println(array[i].getBookName() + " - "
                        + array[i].getPages());
            }
        }
    }

    public static void print(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getBookName() + " - "
                                    + books[i].getPages());
        }
    }
}
