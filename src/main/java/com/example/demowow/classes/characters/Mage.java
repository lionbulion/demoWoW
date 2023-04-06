package com.example.demowow.classes.characters;

import com.example.demowow.classes.AttackType;
import com.example.demowow.classes.CharacterClass;

public class Mage extends CharacterClass {
    public Mage(String name) {
        this.setLevel(1);
        this.setMaxHealtspoint(100);
        this.setMaxManaPoint(150);
        this.setHealPoint(75);
        this.setManaPoint(100);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(7);
    }
}
