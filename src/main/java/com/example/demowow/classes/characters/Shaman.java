package com.example.demowow.classes.characters;

import com.example.demowow.classes.AttackType;
import com.example.demowow.classes.CharacterClass;

public class Shaman extends CharacterClass {
    public Shaman(String name) {
        this.setLevel(1);
        this.setMaxHealtspoint(150);
        this.setMaxManaPoint(150);
        this.setHealPoint(100);
        this.setManaPoint(100);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL);
        this.setAttackAmount(2);
    }


}
