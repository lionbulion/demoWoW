package com.example.demowow;

import com.example.demowow.classes.characters.*;
import com.example.demowow.dunge.Dungeo;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Warrior("колотушка"), new Roge("затычка"), new Mage("ледянка"),
                new Hunter("пиупиу"), new Shaman("хиллибор"));
        party.info();
        Dungeo dungeo = new Dungeo();
        if(party.enterDunge(dungeo)){
            party.setDungeo(dungeo);
            party.runDunge();
        }else {
            System.out.println("это конец");
        }

    }
}
