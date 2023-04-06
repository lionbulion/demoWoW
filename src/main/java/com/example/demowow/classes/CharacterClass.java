package com.example.demowow.classes;

public abstract class CharacterClass implements BaseClass {
    private int healPoint;
    private int manaPoint;
    private int level;
    private int attackAmount;
    private String name;
    private int maxHealtspoint;
    private int maxManaPoint;
    private AttackType attackType;


    @Override
    public void attack() {

    }

    @Override
    public void lostHeal(int amount) {
        setHealPoint(this.healPoint - amount);

    }

    @Override
    public void restHeal(int amount) {
        setHealPoint(this.healPoint  + amount);

    }

    @Override
    public void restMana(int amount) {
        setManaPoint(this.manaPoint + amount);

    }

    @Override
    public void lostMana(int amount) {
        setManaPoint(this.manaPoint - amount);

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
        System.out.println("name: "  + this.name + "\nHp :" + this.healPoint  + "\nMp: " + this.manaPoint +
                 "\nLvL: " + this.level);

    }

    public int getMaxManaPoint() {
        return maxManaPoint;
    }

    public void setMaxManaPoint(int maxManaPoint) {
        this.maxManaPoint = maxManaPoint;
    }

    public int getMaxHealtspoint() {
        return maxHealtspoint;
    }

    public void setMaxHealtspoint(int maxHealtspoint) {
        this.maxHealtspoint = maxHealtspoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        if (attackAmount < 0) System.out.println("лол урона нет");
        else this.attackAmount = attackAmount;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level < 0) System.out.println("хуйня какая то");
        this.level = level;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        if(healPoint  <  0)  this.healPoint = 0;
        else if(healPoint > this.maxHealtspoint) this.healPoint = this.maxHealtspoint;
        else this.healPoint = healPoint;
    }

    public int getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(int manaPoint) {
        if (manaPoint < 0) this.manaPoint = 0;
        else if(manaPoint > this.maxManaPoint) manaPoint = this.maxManaPoint;
        else this.manaPoint = manaPoint;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}
