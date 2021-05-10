package sber.school.hw7;

public class MyInteger {

  private long var;

  public MyInteger(long var) {
    this.var = var;

  }

  public long getVarPrime() {
    long ans = 0;
    for (int i = 2; i < Math.sqrt(var); i++) {
      if (var % i == 0) {
        ans++;
        if (var / i != i) {
          ans++;
        }
      }
    }
    return ans;
  }

  public long getVarCountNumber() {
    long var = this.var;
    int[] numbers = new int[10];
    long answer = 0;
    while (var > 0) {
      int index = (int) var % 10;
      if (numbers[index] == 0) {
        numbers[index] = 1;
        answer++;
      }
      var = var / 10;
    }
    return answer;
  }

  public long getVar() {
    return var;
  }

}
