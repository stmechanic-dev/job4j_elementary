package ru.job4j.oop.inheritance;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ilya Kovalev");
        student.setGroup("Elementary");
        student.setStartDate("08.09.2020");
        System.out.println(student.getName() + " "
                                + student.getGroup() + " "
                                    + student.getStartDate());
    }
}
