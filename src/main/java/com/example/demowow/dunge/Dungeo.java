package com.example.demowow.dunge;

import com.example.demowow.Party;
import com.example.demowow.monsters.Monster;

public class Dungeo implements BasicDunge{
    private boolean isOpen = false;
    private Monster[] monsters;
    @Override
    public boolean open(Party party) {
        if (party.getPartyMembers().length < 3){
            System.out.println("вы не пройдёте, нужно больше мяса");
            isOpen = false;
        }else {
            System.out.println("добро пожаловать...  \nребят тут новое мясо  подъехало... ");
            isOpen = true;
        }
        return isOpen;


    }
}
