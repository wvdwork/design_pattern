package com.wvd.designpattern.strategy.interfaceimp;

import com.wvd.designpattern.strategy.interfaces.Strategy;

/**
 * Created by valwang on 2018/3/5.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
