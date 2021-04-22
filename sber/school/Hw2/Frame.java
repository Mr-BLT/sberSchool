package sber.school.Hw2;

import java.util.Scanner;

public class Frame {

  public static void f(int m) {
    for (int i = 0; i < m; i++) {
      System.out.print("*");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    String str = scanner.nextLine();

    if (str.length() > m) {
      System.out.println("Ошибка");
      return;
    }

    f(m);
    ff(n-2, m);
    fff(m, str);
    ff(n, m);
    f(m);
  }

  public static void ff(int n, int m) {
    int k = n / 2 + n % 2;
    k--;

    while (k != 0) {
      System.out.print("*");

      for (int i = 1; i < m - 1; i++) {
        System.out.print(" ");
      }

      System.out.print("*");

      k--;

      System.out.println();
    }

  }

  public static void fff(int m, String slova) {
    String str = "";
    str += "*";
    int w = slova.length();
    int k = (m - w) / 2;
    int l = m - (k + w);
    l--;
    k--;

    while (k > 0) {
      str += " ";
      k--;
    }

    str += slova;

    while (l > 0) {
      str += " ";
      l--;
    }

    str += "*";
    System.out.println(str);
  }
}
