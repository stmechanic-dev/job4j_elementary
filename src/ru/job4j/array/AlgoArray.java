package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] ints = new int[] {5, 3, 2, 1, 4};
        int temp = ints[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        ints[0] = ints[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        ints[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
        temp = ints[1];
        ints[1] = ints[2];
        ints[2] = temp;
        temp = ints[3];
        ints[3] = ints[4];
        ints[4] = temp;

        for (int n : ints) {
            System.out.println(n);
        }
    }
}
