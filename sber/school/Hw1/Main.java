package sber.school.Hw1;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long k = scanner.nextLong();
    long d = 1;
    long n = 9;
    while (k >= n * d) {
      k -= n * d;
      d++;
      n *= 10;
    }
    long f = (long) Math.pow(10, (double) (d - 1)) + k / d;
    k = d - (k % d);
    while (f > 0 && k > 0) {
      long ans = f % 10;
      f = f / 10;
      k--;
      if (k == 0) {
        System.out.println(ans);
        return;
      }
    }
  }
}
