import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Quiz> questions = Questions.getQuestions();
        Quiz randomQuestion = questions.get(new Random().nextInt(questions.size()));

        System.out.println(randomQuestion.question + "\n");

        String[] options = {"A", "B", "C", "D", "E"};
        for(int i = 0; i < randomQuestion.answers.length; i++) {
            System.out.println(options[i] + ". " + randomQuestion.answers[i]);
        }

        System.out.print("\nAnswer: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();

        boolean isValidAnswer = answer.chars()
                .allMatch(c -> "abcde".indexOf(c) != -1);
        if(answer.length() != 1 || !isValidAnswer || Arrays.asList(options).indexOf(answer.toUpperCase()) > randomQuestion.answers.length - 1) {
            System.out.println("Invalid answer");
            System.exit(0);
        }

        answer = randomQuestion.answers[Arrays.asList(options).indexOf(answer.toUpperCase())];

        if(!Objects.equals(answer, randomQuestion.correctAnswer)) {
            System.out.println("Wrong! The correct answer was " + options[Arrays.asList(randomQuestion.answers).indexOf(randomQuestion.correctAnswer)] + ". " + randomQuestion.correctAnswer);
            System.exit(0);
        }
        System.out.println("You are correct!");
    }
}