package session_8_PracticeProblems;

import java.util.Scanner;

abstract class Question {

    int points;

    Question(int points) {
        this.points = points;
    }

    abstract double evaluate();
}

class MCQ extends Question {

    String correctAnswer;
    String studentAnswer;

    MCQ(String correctAnswer, String studentAnswer, int points) {
        super(points);
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
    }

    double evaluate() {
        if (correctAnswer.equals(studentAnswer))
            return points;
        return 0;
    }
}

class TF extends Question {

    String correctAnswer;
    String studentAnswer;

    TF(String correctAnswer, String studentAnswer, int points) {
        super(points);
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
    }

    double evaluate() {
        if (correctAnswer.equals(studentAnswer))
            return points;
        return 0;
    }
}

class Essay extends Question {

    int keywordCount;

    Essay(int keywordCount, int points) {
        super(points);
        this.keywordCount = keywordCount;
    }

    double evaluate() {

        if (keywordCount >= 2)
            return points * 0.75;
        else if (keywordCount == 1)
            return points * 0.50;
        else
            return 0;
    }
}

public class ExaminationGraderDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();

            Question q;

            if (type.equals("MCQ")) {

                String correct = sc.next();
                String student = sc.next();
                int points = sc.nextInt();

                q = new MCQ(correct, student, points);

            } else if (type.equals("TF")) {

                String correct = sc.next();
                String student = sc.next();
                int points = sc.nextInt();

                q = new TF(correct, student, points);

            } else {

                int keywordCount = sc.nextInt();
                int points = sc.nextInt();

                q = new Essay(keywordCount, points);
            }

            double score = q.evaluate();

            System.out.printf("%s: %.2f%n", type, score);

            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
    }
}