package com.csc;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Calculator {
  public int maximumUsingForLoop(int[] nums){
    int max = Integer.MIN_VALUE;
    for (int num : nums){
      if (num > max){
        max = num;
      }
    }
    return max;
  }
  public int minimumUsingForLoop(int[] nums){
    int min = Integer.MAX_VALUE;
    for (int num : nums){
      if (num < min){
        min = num;
      }
    }
    return min;
  }

  public int sumUsingForLoop(int[] nums){
    int sum = 0;
    for (int num : nums){
      sum += num;
    }
    return sum;
  }
  public double averageUsingForLoop(int[] nums){
    if (nums.length == 0){
      return 0;
    }
    return (double) sumUsingForLoop(nums) / nums.length;
  }

  public int maximumUsingStreamAPI(int[] nums){
    return Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
  }

  public int minimumUsingStreamAPI(int[] nums) {
    return Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
  }

  public int sumUsingStreamAPI(int[] nums){
    return Arrays.stream(nums).sum();
  }

  public double averageUsingStreamAPI(int[] nums){
    if (nums.length ==0){
      return 0.0;
    }
    return Arrays.stream(nums).average().getAsDouble();
  }
}
