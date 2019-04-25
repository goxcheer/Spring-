package com.qgx;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(new EmployeeA());
        manager.doing();
        manager = new Manager(new EmployeeB());
        manager.doing();
    }
}
