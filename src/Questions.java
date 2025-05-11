import java.util.ArrayList;

public class Questions {
    public static ArrayList<Quiz> getQuestions() {
        ArrayList<Quiz> questions = new ArrayList<Quiz>();
        questions.add(new Quiz("Who is Bjarne Stristrup", new String[]{"The creator of Python", "The creator of Java", "The creator of C#", "The creator of C++"}, "The creator of C++"));
        questions.add(new Quiz("Quem é doc?", new String[]{"Gênio do python", "Vagabundo", "doido", "lindo"}, "doido"));
        questions.add(new Quiz("True or false?", new String[]{"true", "false"}, "true"));
        questions.add(new Quiz("Which number is the greatest?", new String[]{"1", "2", "3", "4", "5"}, "5"));

        return questions;
    }
}
