package com.demo.spi.service.impl;

import com.demo.spi.service.OperationService;

public class MultiplyOperationService implements OperationService {
    @Override
    public Object operation(int a, int b) {
        int result = a * b;
        System.out.println("multply---> args[a = "+a+",b = "+b+"],result: a * b = "+result );
        return result;
    }
}
