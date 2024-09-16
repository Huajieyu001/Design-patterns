package com.huajieyu.pattern.behavior.memento.black;

import com.huajieyu.pattern.behavior.memento.white.RoleMemento;

public class RoleCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
