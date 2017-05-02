package com.functions;

import java.io.BufferedReader;

/**
 * Created by wangyong on 4/18/17.
 */
@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader reader);
}
