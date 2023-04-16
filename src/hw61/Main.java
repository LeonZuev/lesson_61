package hw61;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
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
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike", 93, 87, 95));
        students.add(new Student("Dror", 85, 96, 93));
        students.add(new Student("Anna", 87, 90,95));
        students.add(new Student("Jane", 97, 95, 84));
        students.add(new Student("Olga", 70, 95, 95));
        students.add(new Student("Steve", 90, 80, 97));
        students.add(new Student("Linda", 87, 92, 93));
        students.add(new Student("Nataly", 97, 89, 90));
        students.add(new Student("Igor", 89,95, 92));
        students.add(new Student("Maxim", 87, 89, 98));
        students.add(new Student("Ludmila", 88, 95, 90));
        students.add(new Student("John", 88, 95, 95));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum passing score: ");
        int minScore = scanner.nextInt();

        List<Student> result = students.stream()
                .filter(s -> (s.getScoreFirstSemester() + s.getScoreSecondSemester() + s.getScoreFirstSemester()) >= minScore)
                .sorted(Comparator.comparingDouble((Student s) ->(s.getScoreFirstSemester() + s.getScoreSecondSemester() + s.getScoreThirdSemester()) / 2.0))
                .limit(10)
                .toList();
        result.forEach(System.out::println);
    }
}
