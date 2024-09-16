package com.huajieyu.pattern.behavior.interpret;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Var, Integer> map = new HashMap<>();

    public void assign(Var var, Integer value){
        map.put(var, value);
    }

    public int getValue(Var var){
        return map.get(var);
    }

}
