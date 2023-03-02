package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
            if (i * i > max) {
                break;
            }
        }
        return counter;
    }
}
