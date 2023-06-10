package com.junit.and.mockito.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JunitBasicTest {
    JunitBasic junitBasic = null;
    @BeforeAll
    void initialize () {
        junitBasic = new JunitBasic();
    }
    @DisplayName("Add a + b")
    @Test
    void divide() {
        assertEquals(5, new JunitBasic().divide(10,2));

    }
    @DisplayName("divideThrowsExeption")
    @Test
    void divideThrowsExeption() {
        assertThrows(IllegalArgumentException.class, () -> {
            junitBasic.divide(10,0);
        }, "IllegalArgumentException thrown");
    }

    @DisplayName("check if method returning null")
    @Test
    void checkNullPointer() {
        assertAll(
                () ->    assertNull(junitBasic.divide(null, null)),
                () -> assertNull(junitBasic.divide(10, null)),
                () -> assertNull(junitBasic.divide(null, 5))
        );

    }
    @DisplayName("check if method not returning null")
    @Test
    void checkNoNullPointer() {
        assertNotNull(junitBasic.divide(10, 2));
    }
}