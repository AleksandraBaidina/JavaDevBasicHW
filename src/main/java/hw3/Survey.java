package hw3;

import java.util.Scanner;

public class Survey {
  public static void main(String[] args) {
    String[] questions = new String[]
        {"Какого цвета солнце?\nA.желтое\nB.белое\nC.синее",
            "Сколько цветов у светофора?\nA.1\nB.2\nC.3",
            "Что храниться в файлах с расширением *.class?\nA.байткод\nB.лайткод\nC.исходный код"};
    String[] answers = new String[]{"A", "C", "A"};
    int result = 0;

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      String answer = sc.nextLine();
      result += answer.toUpperCase().equals(answers[i]) ? 1 : 0;
      System.out.println("Your current result = " + result + " from " + (i + 1));
    }
  }
}

