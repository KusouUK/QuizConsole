public class Quiz {
    public String question;
    public String[] answers;
    public String correctAnswer;

    public Quiz(String Question, String[] Answers, String CorrectAnswer) {
        question = Question;
        answers = Answers;
        correctAnswer = CorrectAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
