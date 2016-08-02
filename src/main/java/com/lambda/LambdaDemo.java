package com.lambda;

import org.junit.Test;

/**
 * Created by wy33082 on 16-8-2.
 */
public class LambdaDemo {

    /**
     *
     */
    @Test
    public void helloLambda() {

        new Thread(() -> System.out.println("hello lambda..")).start();
    }

}
