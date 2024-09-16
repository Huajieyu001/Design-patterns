package com.huajieyu.pattern.behavior.memento.white;

public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public GameRole() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void init(){

    }

    public void fight(){

    }

    public RoleMemento saveState(){
        return new RoleMemento(this.vit, this.atk, this.def);
    }

    public void recoverState(RoleMemento memento){
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }
}
