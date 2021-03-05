package com.demo.shortcuts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    @Test
    void doesThisHaveFourCornor() {
        Square square = new Square();
        int numbers = square.checkingFourCoronor();
        Assertions.assertEquals(numbers, 0);
    }
}