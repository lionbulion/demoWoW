package com.example.demowow.classes.characters;

import com.example.demowow.classes.AttackType;
import com.example.demowow.classes.CharacterClass;

public class Hunter  extends CharacterClass {
    public Hunter(String name) {
        this.setLevel(1);
        this.setMaxHealtspoint(100);
        this.setMaxManaPoint(75);
        this.setHealPoint(75);
        this.setManaPoint(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(3);
    }


}
