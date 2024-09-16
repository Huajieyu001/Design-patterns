package com.huajieyu.pattern.behavior.interpret;

public class InterpretTest {

    public static void main(String[] args) {
        Context context = new Context();

        Var a = new Var("a");
        Var b = new Var("b");
        Var c = new Var("c");
        Var d = new Var("d");
        Var e = new Var("e");
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);

        AbstractExpression expression = new Minus(new Plus(new Plus(new Plus(a, b), c), d), e);

        System.out.println(expression.interpret(context));
    }
}
