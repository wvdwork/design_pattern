package com.wvd.designpattern.strategy.comtext;

import com.wvd.designpattern.strategy.interfaces.Strategy;

/**
 * Created by valwang on 2018/3/5.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
