package com.example.demowow.classes.characters;

import com.example.demowow.classes.AttackType;
import com.example.demowow.classes.CharacterClass;

public class Roge extends CharacterClass {
    public Roge(String name) {
        this.setLevel(1);
        this.setMaxHealtspoint(100);
        this.setMaxManaPoint(75);
        this.setHealPoint(75);
        this.setManaPoint(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(7);

    }
}
