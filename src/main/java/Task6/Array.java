package Task6;

import java.util.Arrays;

public class Array implements IMath, ISort, IShow {
    private int[] numbers;

    public Array(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int Max() {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        float sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    @Override
    public void SortAsc() {
        Arrays.sort(numbers);
    }

    @Override
    public void SortDesc() {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }

    @Override
    public void Print() {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public void Print(String info) {
        System.out.println(info);
        Print();
    }

    public void display() {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}