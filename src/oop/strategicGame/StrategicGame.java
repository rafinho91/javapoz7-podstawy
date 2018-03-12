package oop.strategicGame;
// napisac gre - kupowanie jednostek i walka //todo
public class StrategicGame {
    public static void main(String[] args) {
        Monster[] squadA = {new Soldier("blue",2), new Soldier("yellow", 3)};
        Monster[] squadB = {new Zombie("blue",1), new Soldier("bad", 4)};

        showArmy(squadA);
        showArmy(squadB);
    }

    public static void showArmy(Monster[] monsters) {
        System.out.println("Army has " + monsters.length + " units");
        System.out.println("Combined attack power equals: " + computeArmyPower(monsters));
        System.out.println("Combined defence of the army is: " + computeArmyDefence(monsters));
    }

    private static int computeArmyPower(Monster[] monsters) {
        int sum = 0;
        for (int i = 0; i < monsters.length; i++) {
            sum += monsters[i].attack();
        }
        return sum;
    }

    private static int computeArmyDefence(Monster[] monsters) {
        int sum = 0;
        for (int i = 0; i < monsters.length; i++) {
            sum += monsters[i].defence();
        }
        return sum;
    }
}
