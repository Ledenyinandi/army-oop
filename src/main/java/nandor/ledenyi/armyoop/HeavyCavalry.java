package nandor.ledenyi.armyoop;

public class HeavyCavalry extends MilitaryUnit {

    private int healthPoints = 150;
    private int damage = 20;
    private boolean isArmored = true;
    private int round = 1;

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int doDamage() {
        if (round == 1) {
            round++;
            return damage * 3;
        }
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if (isArmored) {
            healthPoints = healthPoints - damage / 2;
        } else {
            healthPoints -= damage;
        }
    }
}
