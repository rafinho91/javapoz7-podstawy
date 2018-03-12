package oop.strategicGame;

import oop.strategicGame.Monster;

public class Dragon implements Monster {
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defence() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
