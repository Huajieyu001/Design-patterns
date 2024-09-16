package com.huajieyu.pattern.behavior.memento.black;

public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public GameRole() {
    }

    public GameRole(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public void init(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit -= 20;
        this.atk -= 20;
        this.def -= 20;
    }

    public RoleMemento saveState(){
        return new RoleMemento(this.vit, this.atk, this.def);
    }

    public void recoverState(Memento memento){
        RoleMemento roleMemento = (RoleMemento) memento;
        this.vit = roleMemento.getVit();
        this.atk = roleMemento.getAtk();
        this.def = roleMemento.getDef();
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

    class RoleMemento implements Memento{

        private int vit;
        private int atk;
        private int def;

        public RoleMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
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
    }
}
