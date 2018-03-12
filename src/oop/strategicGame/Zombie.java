package oop.strategicGame;

public class Zombie implements Monster {
    private static int DEFAULT_ATTACK = 4;

    private String name;
    private double power;
    private int health;

    public Zombie(String name, double power) {
        this.name = name;
        this.power = power;
        this.health = (int)(200 * power);

    }

    @Override
    public int attack() {
        return (int)(DEFAULT_ATTACK * power);
    }

    @Override
    public int defence() {
        return 5;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > -30;
    }
}
