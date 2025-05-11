import java.util.List;
import java.util.Arrays;

public class Questions {
    public static List<Quiz> getQuestions() {
        return List.of(
                new Quiz(
                        "Who is Bjarne Stristrup",
                        Arrays.asList("The creator of Python", "The creator of Java", "The creator of C#", "The creator of C++"),
                        "The creator of C++"
                ),
                new Quiz(
                        "Quem é doc?",
                        Arrays.asList("Gênio do python", "Vagabundo", "doido", "lindo"),
                        "doido"
                ),
                new Quiz(
                        "True or false?",
                        Arrays.asList("true", "false"),
                        "true"
                ),
                new Quiz(
                        "Which number is the greatest?",
                        Arrays.asList("1", "2", "3", "4", "5"),
                        "5"
                )
        );
    }
}
