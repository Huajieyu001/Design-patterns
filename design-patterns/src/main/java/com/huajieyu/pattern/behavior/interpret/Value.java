package com.huajieyu.pattern.behavior.interpret;

public class Value extends AbstractExpression{

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context){
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
