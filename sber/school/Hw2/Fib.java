package sber.school.Hw2;

import java.util.Scanner;

public class Fib {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong();
    long[] dp = new long[91];
    dp[0] = 1;
    dp[1] = 2;
    for (int i = 2; i < dp.length; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    int[] ans = new int[91];
    while (x != 0) {
      int k = 0;
      while (x >= dp[k]) {
        k++;
      }
      if (k != 0) {
        k--;
      }
      ans[k] = 1;
      x -= dp[k];
    }

    int t = 0;
    for (int i = 90; i >= 0; i--) {
      if (ans[i] != 0) {
        t = i;
        break;
      }
    }

    for (int i = t; i >= 0; i--) {
      System.out.print(ans[i]);
    }
  }
}

