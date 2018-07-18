package com.experiment.model;

// 子类
// extends 让 ChildClass成为ParentClass的子类
public class ChildClass extends ParentClass implements Readable{

    public void test() {
        System.out.println(b);
        System.out.println(c);
    }

    // 重载，不属于面向对象范畴，只是同样的方法名，不同的参数类型或数量
    public void test(int i) {

    }

    // 重写，覆盖父类方法，关系出现在继承里
    public void testParent() {
        System.out.println("child");
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public String readLine() {
        return null;
    }
}