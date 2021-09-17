package nandor.ledenyi.armyoop;

public class Swordsman extends MilitaryUnit {

    private int healthPoints = 100;
    private int damage = 10;
    private boolean isArmored;
    private int round = 1;

    public Swordsman(boolean isArmored) {
        this.isArmored = isArmored;
    }

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
        if (round == 1) {
            damage = 0;
            round++;
        }
        if (isArmored) {
            healthPoints = healthPoints - damage / 2;
        } else {
            healthPoints -= damage;
        }
    }
}
