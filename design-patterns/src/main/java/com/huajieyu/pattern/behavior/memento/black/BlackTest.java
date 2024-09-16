package com.huajieyu.pattern.behavior.memento.black;

public class BlackTest {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.init();

        System.out.println(role);

        role.fight();
        Memento roleMemento = role.saveState();

        System.out.println(role);

        role.fight();
        System.out.println(role);

        role.recoverState(roleMemento);
        System.out.println(role);
    }
}
