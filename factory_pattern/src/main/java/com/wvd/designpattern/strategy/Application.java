package com.wvd.designpattern.strategy;

import com.wvd.designpattern.strategy.comtext.Context;
import com.wvd.designpattern.strategy.interfaceimp.OperationAdd;
import com.wvd.designpattern.strategy.interfaceimp.OperationMultiply;
import com.wvd.designpattern.strategy.interfaceimp.OperationSubstract;

public class Application {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(" 7 + 8 = " + (context.executeStrategy(7, 8)));

        context = new Context(new OperationSubstract());
        System.out.println(" 7 - 8 = " + (context.executeStrategy(7, 8)));

        context = new Context(new OperationMultiply());
        System.out.println(" 7 * 8 = " + (context.executeStrategy(7, 8)));
    }
}
