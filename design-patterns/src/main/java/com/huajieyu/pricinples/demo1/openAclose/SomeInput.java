package com.huajieyu.pricinples.demo1.openAclose;

/**
 * 输入法
 */
public class SomeInput {

    private AbstractSkin skin;

    public AbstractSkin getSkin() {
        return skin;
    }

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
