package com.pb.mamyga.hw10;

public class NumBox<T extends Number> {
    T[] numbers;
    int size;
    int curIndex;

    NumBox(int size) {
        this.numbers = (T[]) new Number[size];
        this.size = size;
        this.curIndex = 0;
    }

    void add(T num) throws Exception {
        if(curIndex >= size)
            throw new Exception("Достигнута максимальная длина массива.");

        numbers[curIndex++] = num;
    }

    T get(int i) {
        return numbers[i];
    }

    int length() {
        return numbers.length;
    }

    double average() {
        return sum() / length();
    }

    double sum() {
        double sum = 0;
        for (T num : numbers) {
            if(num == null)
                break;

            sum += num.doubleValue();

        }
        return sum;
    }

    T max(){
        T max = null;
        for (T num : numbers) {
            if(num == null)
                break;

            if(max == null || max.doubleValue() < num.doubleValue())
                max = num;
        }

        return max;
    }
}
