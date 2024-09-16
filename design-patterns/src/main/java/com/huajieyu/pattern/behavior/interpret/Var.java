package com.huajieyu.pattern.behavior.interpret;

public class Var extends AbstractExpression{

    private String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context){
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
