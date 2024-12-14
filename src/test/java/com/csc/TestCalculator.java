package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

  @Test
  void testFilterEvenNumbers(){
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] expected = {2, 4, 6, 8};
    assertArrayEquals(expected, calculator.filterEvenNumbers(input));
  }

  @Test
  void testFilterOddNumbers(){
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] expected = {1, 3, 5, 7};
    assertArrayEquals(expected, calculator.filterOddNumbers(input));
  }

  @Test
  void testAddFiveToEachElement(){
    int[] input = {1, 2, 3, 4, 5, 6};
    int[] expected = {6, 7, 8, 9, 10, 11};
    assertArrayEquals(expected, calculator.addFiveToEachElement(input));
  }

  @Test
  void testSquareNumbers(){
    int[] input = {1, -2, 3, -4, 5};
    int[] expected = {1, 4, 9, 16, 25};
    assertArrayEquals(expected, calculator.squareNumbers(input));
  }
}
