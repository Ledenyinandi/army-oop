# Army OOP

In this project we can model a medieval army battle.

All units have health points and attack damage. Some units may have an armor.

These methods are available for all the units:

- **doDamage()**: give back the unit's damage in *int*.
- **sufferDamage(int damage)**: subtract the parameter value from the unit's health points.<br>
    If the unit has an armor, the damage is half.
  
### Archer

- **health point**: 50
- **damage**: 20
- no armor

### Heavy Cavalry

- **health point**: 150
- **damage**: 20
- has an armor
- battle starts with a rush attack, all heavy cavalry units' first damage is triple damage

### Swordsman

- **health point**: 100
- **damage**: 10
- has an armor for the first strike, after it breaks

## Army

- **addUnit(MilitaryUnit militaryUnit)**: add a unit to the army
- **damageAll(int damage)**: subtract the parameter value from all the units' health points,<br>
    and take out units with 25 or less health points, because they are dead or incapable of fighting
- **getArmyDamage()**: give back all the damage of the army
- **getArmySize()**: give back the number of units