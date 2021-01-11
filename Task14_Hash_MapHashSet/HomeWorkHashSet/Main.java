package Task14_Hash_MapHashSet.HomeWorkHashSet;

import java.util.*;


/*
* Задача 2 (HashSet). Список студентов
Описание
Вы разрабатываете систему учета студентов. Для каждого студента нужно хранить следующие данные – ФИО, номер группы, номер студенческого билета.
Уникальным идентификатором является номер студенческого билета. Пользователь вводит данные студентов в бесконечном цикле до ввода команды "end".
По окончании ввода программа должна вывести список студентов. Структура данных, куда сохраняются студенты, должна отбрасывать ввод одного и того же студента более одного раза. Учитывайте, что имена у людей могут быть одинаковыми, а номера документов – нет.

Функционал программы
Ввод информации о студентах;
Вывод списка студентов.
Пример
Введите информацию о студенте: "ФИО, номер группы, номер студенческого билета"
Иванов Петр Николаевич, 1243-Б, 31231343 <enter>
Введите информацию о студенте (для завершения работы программы введите "end")
Петрова Татьяна Михайловна, 1243-Б, 43221343 <enter>
Введите информацию о студенте (для завершения работы программы введите "end")
end <enter>
Список студентов:
  - Иванов Петр Николаевич, 1243-Б, 31231343
  - Петрова Татьяна Михайловна, 1243-Б, 43221343

Реализация
Создайте класс Student с полями name, group, studentId. Тип каждого поля – String.
Переопределите методы hashcode и equals для класса Student так, чтобы нельзя было сохранить двух студентов с одинаковым номером студенческого билета.
Продемонстрируйте добавление объектов класса в HashSet, ошибку при добавлении студентов с одинаковым номером, возможность существования студентов с одинаковыми именами.
*
* */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<Student> studentSet = new HashSet<>();

        System.out.println("Введите информацию о студенте: ФИО, номер группы, номер студенческого билета");
        String infoStudent = scanner.nextLine();

        while (true) {

            String[] infoStudentArray = infoStudent.split(",", 3);

            String name = infoStudentArray[0];
            String group = infoStudentArray[1];
            String studentId = infoStudentArray[2];
            Student student = new Student(name, group, studentId);//?

            if (!studentSet.contains(student)) {
                studentSet.add(student);
            } else {
                System.out.println("Такой студент уже есть в списке! Повторите ввод!");
            }

/*
//            check
            System.out.println("Количество записей: " + studentSet.size());
*/


            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
            infoStudent = scanner.nextLine();

            if (infoStudent.equals("end")) {
                System.out.println("Конец программы...");
                System.out.println("Список студентов: ");
                for (Student student1 : studentSet) {
                    System.out.println(student1);
                }
//                student.printStudents();
                break;
            }
        }
    }
}