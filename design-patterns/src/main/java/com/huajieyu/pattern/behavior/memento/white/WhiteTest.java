package com.huajieyu.pattern.behavior.memento.white;

public class WhiteTest {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        System.out.println(role);

        System.out.println("-------------------------------");

        role.setVit(80);
        role.setAtk(80);
        role.setDef(80);

        RoleMemento roleMemento = role.saveState();
        System.out.println(role);
        System.out.println("刚刚的状态备份了----------------------------");

        role.setVit(60);
        role.setAtk(60);
        role.setDef(60);
        System.out.println(role);

        System.out.println("恢复后：-------------------------");
        role.recoverState(roleMemento);
        System.out.println(role);
    }
}
