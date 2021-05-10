package sber.school.hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<MyInteger> list = new ArrayList<>();
    MyInteger myInteger = new MyInteger(123465);
    MyInteger myInteger1 = new MyInteger(3);
    MyInteger myInteger2 = new MyInteger(30);
    MyInteger myInteger3 = new MyInteger(210);
    MyInteger myInteger4 = new MyInteger(211);

    list.add(myInteger);
    list.add(myInteger1);
    list.add(myInteger2);
    list.add(myInteger3);
    list.add(myInteger4);

    Comparator<MyInteger> comparatorPrime = new Comparator<MyInteger>() {
      @Override
      public int compare(MyInteger o1, MyInteger o2) {
        if (o1.getVarPrime() > o2.getVarPrime()) {
          return -1;
        }
        return 1;
      }
    };

    Collections.sort(list, comparatorPrime);
    System.out.print("Число отсорт по кол-вам простых чисел: ");
    for (MyInteger myInteger5 : list) {
      System.out.print(myInteger5.getVar() + " ");
    }
    System.out.println();

    Comparator<MyInteger> myIntegerComparator = new Comparator<MyInteger>() {
      @Override
      public int compare(MyInteger o1, MyInteger o2) {
        if (o1.getVarCountNumber() > o2.getVarCountNumber()) {
          return -1;
        }
        return 1;
      }
    };

    Collections.sort(list, myIntegerComparator);
    System.out.print("Число отсорт по кол-вам различных цифр в десятичном представлении: ");
    for (MyInteger myInteger5 : list) {
      System.out.print(myInteger5.getVar() + " ");
    }

  }
}
