package com.example.demowow;

import com.example.demowow.classes.CharacterClass;
import com.example.demowow.dunge.Dungeo;

public class Party {
    private CharacterClass[] partyMembers;
    private Dungeo dungeo;

    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }
    public void runDunge(){

    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public Party(CharacterClass... members) {
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++){
            partyMembers[i] = members[i];
        }

    }
    public boolean enterDunge(Dungeo dungeo){
       return dungeo.open(this);
    }
    public void info(){
        for(CharacterClass partyMember : partyMembers){
            partyMember.info();
        }
    }

    public Dungeo getDungeo() {
        return dungeo;
    }

    public void setDungeo(Dungeo dungeo) {
        this.dungeo = dungeo;
    }
}
