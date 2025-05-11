import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Quiz> questions = Questions.getQuestions();
        Quiz randomQuestion = questions.get(new Random().nextInt(questions.size()));

        System.out.println(randomQuestion.question + "\n");

        String[] options = {"A", "B", "C", "D", "E"};
        for(int i = 0; i < randomQuestion.answers.size(); i++) {
            System.out.println(options[i] + ". " + randomQuestion.answers.get(i));
        }

        System.out.print("\nAnswer: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();

        boolean isValidAnswer = answer.chars()
                .allMatch(c -> "abcde".indexOf(c) != -1);
        if(answer.length() != 1 || !isValidAnswer || Arrays.asList(options).indexOf(answer.toUpperCase()) > randomQuestion.answers.size() - 1) {
            System.out.println("Invalid answer");
            System.exit(0);
        }

        answer = randomQuestion.answers.get(Arrays.asList(options).indexOf(answer.toUpperCase()));

        if(!Objects.equals(answer, randomQuestion.correctAnswer)) {
            System.out.println("Wrong! The correct answer was " + options[randomQuestion.answers.indexOf(randomQuestion.correctAnswer)] + ". " + randomQuestion.correctAnswer);
            System.exit(0);
        }
        System.out.println("You are correct!");
    }
}