package com.example.demowow.classes.characters;

import com.example.demowow.classes.AttackType;
import com.example.demowow.classes.CharacterClass;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
        this.setLevel(1);
        this.setMaxHealtspoint(150);
        this.setMaxManaPoint(75);
        this.setHealPoint(100);
        this.setManaPoint(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);
    }
}
