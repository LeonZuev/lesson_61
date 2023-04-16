package hw61;
/*
Используйте класс Student из урока 60 (см. Student.java).
Создайте список учеников с баллами.
Попросите пользователя ввести минимальный проходной балл.
Выведите список учеников согласно следующим условиям:

каждый ученик выведен в отдельной строке
сумма баллов каждого ученика выше минимального проходного
ученики отсортированы по убыванию среднего балла
в списке не больше 10 учеников (извините, конкурс)
Для обработки и вывода результата используйте потоки (Stream).
 */


public class Student {

    private String name;
    private int scoreFirstSemester;// балл
    private int scoreSecondSemester;
    private int scoreThirdSemester;


    public Student(String name, int firstScore, int secondScore, int thirdScore) {
        this.name = name;
        this.scoreFirstSemester = firstScore;
        this.scoreSecondSemester = secondScore;
        this.scoreThirdSemester = thirdScore;
    }

    public String getName() {
        return name;
    }

    public int getScoreFirstSemester() {
        return scoreFirstSemester;
    }

    public int getScoreSecondSemester() {
        return scoreSecondSemester;
    }

    public int getScoreThirdSemester() {
        return scoreThirdSemester;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScoreFirstSemester(int scoreFirstSemester) {
        this.scoreFirstSemester = scoreFirstSemester;
    }

    public void setScoreSecondSemester(int scoreSecondSemester) {
        this.scoreSecondSemester = scoreSecondSemester;
    }

    public void setScoreThirdSemester(int scoreThirdSemester) {
        this.scoreThirdSemester = scoreThirdSemester;
    }

    @Override
    public String toString() {
        double totalScore = (scoreFirstSemester + scoreSecondSemester + scoreThirdSemester);
        return name + " (" + scoreFirstSemester + ", " +
                scoreSecondSemester + ", " +
                scoreThirdSemester + ") - Average: " +
                totalScore / 2;
    }
}

