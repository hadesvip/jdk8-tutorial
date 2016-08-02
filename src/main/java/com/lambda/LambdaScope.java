package com.lambda;

import java.util.function.IntUnaryOperator;

/**
 * lambda作用域
 * Created by wy33082 on 16-8-2.
 */
public class LambdaScope {

    Runnable r1 = () -> {
        System.out.println(this);
    };

    Runnable r2 = () -> {
        System.out.println(toString());
    };

    Runnable r3 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    Runnable r4 = new Runnable() {
        @Override
        public void run() {
            System.out.println(toString());
            System.out.println("调用外围对象:" + LambdaScope.this);
        }
    };


    @Override
    public String toString() {
        return "hello,world!!!";
    }

    public static void main(String[] args) {

        //会打印lambda外围对象toString方法，即LambdaScope
        new LambdaScope().r1.run();
        new LambdaScope().r2.run();

        System.out.println("==========华丽的分割线==========");

        //会打印run方法的调用者的toString方法,即Runnable
        new LambdaScope().r3.run();
        new LambdaScope().r4.run();
    }
}

class Foo {
    Object i, j;

    // 对于全局变量，lambda块中的局部变量可以与之重复
    IntUnaryOperator iuo = i -> {
        int j = 3;
        return i + j;
    };

    /**
     * 对于局部变量，lambda块中变量不能与局部变量同名
     */
    void foo() {
        final int i = 2;
        Runnable runnable = () -> {
            //     int i =2;
        };


        IntUnaryOperator iuo = a -> {
            int j = 3;
            return j + a;
        };
    }
}

