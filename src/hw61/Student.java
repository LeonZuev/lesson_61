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
    private int score; // балл

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }
}

