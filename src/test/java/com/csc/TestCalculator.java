package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testMaximumUsingForLoop(){
    assertEquals(10, calculator.maximumUsingForLoop(new int[]{1, 5, 10}));
  }

  @Test
  void testMinimumUsingForLoop(){
    assertEquals(1, calculator.minimumUsingForLoop(new int[]{1, 5, 10}));
  }

  @Test
  void testSumUsingForLoop(){
    assertEquals(16, calculator.sumUsingForLoop(new int[]{1, 5, 10}));
  }

  @Test
  void testAverageUsingForLoop(){
    assertEquals(5.333333333333333,calculator.averageUsingForLoop(new int[]{1, 5, 10}));
  }

  @Test
  void testMaximumUsingStreamAPI(){
    assertEquals(10, calculator.maximumUsingStreamAPI(new int[]{1, 7, 9, 10}));
  }

  @Test
  void testMinimumUsingStreamAPI(){
    assertEquals(1, calculator.minimumUsingStreamAPI(new int[]{1, 7, 9, 10}));
  }

  @Test
  void testSumUsingStreamAPI(){
    assertEquals(27, calculator.sumUsingStreamAPI(new int[]{1, 7, 9, 10}));
  }

  @Test
  void testAverageUsingStream(){
    assertEquals(6.75, calculator.averageUsingStreamAPI(new int[]{1, 7, 9, 10}));
  }
}
