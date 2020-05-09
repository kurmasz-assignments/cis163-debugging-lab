public class Buggy {

  public static int summation(int x) {
    int answer = 0;
    for (int i = 0; i < x; ++i) {
      answer += i;
    }
    return answer;
  }

  public static int factorial_v1(int x) {
    int answer = 1;
    for (int i = 0; i < x; ++i) {
      answer *= (i+1);
    }
    return answer;
  }

  public static int factorial_v2(int x) {
    int answer = x;
    for (int i = x-1; i > 1; ++i) {
      answer *= i;
    }
    return answer;
  }



}