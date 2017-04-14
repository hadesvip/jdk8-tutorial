package com.functions;

import com.bean.Apple;

/**
 * Created by wangyong on 4/13/17.
 */
@FunctionalInterface
public interface AppleFormatter {
    String accept(Apple apple);
}
