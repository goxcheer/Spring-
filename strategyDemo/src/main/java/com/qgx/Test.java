package com.qgx;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        context.executeStrategy(2,1);
        System.out.println("2,1 executeStrategy OperationAdd :"+context.executeStrategy(2,1));
        context = new Context(new OperationSubstract());
        System.out.println("2,1 executeStrategy OperationSubstract :"+context.executeStrategy(2,1));
    }
}
