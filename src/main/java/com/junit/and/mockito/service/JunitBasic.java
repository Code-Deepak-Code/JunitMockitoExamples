package com.junit.and.mockito.service;

import org.springframework.stereotype.Service;

@Service
public class JunitBasic {

    Integer divide(Integer a , Integer b) {
        Integer testNull = null;

        if(a == null || b == null) {
           return null;
        }

        if(b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("denominator must be greater than zero");
        }
    }
}
