package oop.message;
// KOLEJNOSC KODU
// pola statyczne, metoda statyczne, pola, konstruktory,
// publiczne metody - gettery settery na koncu, metody private i protected, na koncu met. abstrakcyjne

import java.util.Random;

public class RandomMessage implements Message {
    private int bound;
    private int offset;
    private Random random;

    public RandomMessage(int bound, int offset) {
        this.bound = bound;
        this.offset = offset;
        this.random = new Random();
    }

    public String getMessage() {
        return String.valueOf(random.nextInt(bound) + offset);
    }

    public int getBound() {
        return bound;
    }

    public int getOffset() {
        return offset;
    }

}
