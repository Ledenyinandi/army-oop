package nandor.ledenyi.armyoop;

public class Archer extends MilitaryUnit{

    private int healthPoints = 50;
    private int damage = 20;
    private boolean isArmored = false;

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int doDamage() {
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
