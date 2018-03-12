package oop.strategicGame;

public class Soldier implements Monster {

    private String name;
    private int weapon;
    private int health;

    public Soldier(String name, int weapon) {
        this.name = name;
        this.weapon = weapon;
        this.health = 100*weapon;
    }

    @Override
    public int attack() {
        return 5 * weapon * weapon;
    }

    @Override
    public int defence() {
        return weapon * 2;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
