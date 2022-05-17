package ru.netology.sqr;


public class SQRService {
    public int numbersOfSquaresIncCertainRange(int bottomLine, int upperLine) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomLine) {
                if (i * i <= upperLine) {
                    count++;
                }
            }

        }

        return count;
    }
}
