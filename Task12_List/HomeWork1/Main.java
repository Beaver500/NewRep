package Task12_List.HomeWork1;
/*Описание
Мы уже делали записную книжку с описанием дел, но не сохраняли их в какую-то структуру данных. Списки дел можно хранить в массивах и списках. Массивы имеют фиксированную длину, и после того как массив создан, он не может расти или уменьшаться. ArrayList (одна из имплементаций списка) может менять свой размер во время исполнения программы, при этом не обязательно указывать размерность при создании объекта. Кроме того, вы без проблем можете вставить новый элемент в середину коллекции, а также спокойно удалить элемент из любого места. Поэтому очень удобно использовать List для ведения списка дел, ведь часто бывает, что нужно добавить какие-то дела в середине дня или же что-то удалить.

Необходимо реализовать программу, в которой пользователь вводит с консоли описание дел (одно дело — одна строка, затем Enter) в бесконечном цикле, пока не введет ключевое слово "end". Программа сохраняет все эти дела в списке "List" и после команды "end" выводит их в консоль.

Функционал программы
Запрос списка задач/дел у пользователя;
Возможность добавить задачу в список;
Возможность удалить задачу из списка;
Возможность вывода всех задач.
Пример
Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
1 <enter>
Введите задачу для планирования:
Почитать про ArrayList

Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
1 <enter>
Введите задачу для планирования:
Повторить примитивные типы данных

Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
2 <enter>
Список задач:
1. Почитать про ArrayList
2. Повторить примитивные типы данных

Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
0 <enter>
Процесс реализации
Используя Scanner scanner = new Scanner(System.in) и scanner.nextLine(), в бесконечном цикле необходимо последовательно получить названия дел или слово end. Перед каждым запросом на ввод нужно выводить сообщение System.out.println("Введите название задачи (для завершения введите end)"), чтобы пользователь понимал, что ему вводить.

Добавьте проверку, равно ли введенное значение условию для выхода из цикла - строке end.

Если не введено слово end, то сохраните введенное значение в переменную task типа String String task = scanner.nextLine() и добавьте его в список list.

Если введено слово end, то используя конструкцию for (String task : list ), выводим задачи в консоль. Можно также вывести и индекс, иcпользуя локальный счетчик.

* Дополнительное задание: дополните программу выше функцией удаления.
После вывода списка дел в консоль, программа дает пользователю возможность удалить из списка определенное дело по индексу. Это происходит в бесконечном цикле, пока пользователь не введет ключевое слово "Finish".

Процесс реализации
Используя Scanner scanner = new Scanner(System.in) и scanner.nextLine() в бесконечном цикле, получите индекс дела, которое необходимо удалить, и сохранить это значение в переменную String input = scanner.nextLine().

Добавьте проверку, равно ли введенное значение условию для выхода из цикла — строке Finish.

Используя метод ArrayList remove(int index), удалите дело из списка. Обратите внимание, что необходимо будет перевести String в int.

Если введено слово Finish, то, используя конструкцию for (String task : list), выведите задачи в консоль вместе с индексом. Убедитесь, что дело корректно удалилось из списка и индексы были сдвинуты влево.*/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> taskList = new ArrayList<>();
        boolean output = false;

        while (!output) {
            System.out.println();
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            System.out.println();

            String taskEnter = scanner.nextLine();

            switch (taskEnter) {
                case "0":
                    end(taskList);
                    output = true;
                    break;

                case "1":
                    System.out.println("Введите название задачи для добавления (для завершения введите end)");
                    System.out.print("Задача: ");
                    String taskAdd = scanner.nextLine();
                    if (taskAdd.equals("end")) {
                        end(taskList);
                        output = true;
                        break;
                    } else {
                        taskList.add(taskAdd);
                    }
                    break;

                case "2":
                    System.out.println("Для вывода списка нажмите enter (для завершения введите end):  ");
                    String taskOutput = scanner.nextLine();
                    if (taskOutput.equals("end")) {
                        end(taskList);
                        output = true;
                        break;
                    } else {
                        System.out.println("*****************");
                        for (String tasks : taskList) {
                            System.out.println(tasks + "; ");
                        }
                        System.out.println("*****************");
                    }
                    break;

                case "3":
                    System.out.print("Для удаления задачи введите её номер (для завершения введите end): ");
                    String taskToDelete = scanner.nextLine();
                    if (taskToDelete.equals("end")) {
                        end(taskList);
                        output = true;
                        break;
                    } else {
                        int deleteTask = Integer.parseInt(taskToDelete);
                        taskList.remove(deleteTask - 1);
                        System.out.println("*****************");
                        for (String tasks : taskList) {
                            System.out.println(tasks + "; ");
                        }
                        System.out.println("*****************");
                        break;
                    }
            }
        }
    }

    static void end(ArrayList<String> taskList) {

        System.out.println();
        System.out.println("Выход из программы");
        System.out.println();
        System.out.println("Список составленных задач: ");
        System.out.println("*****************");
        for (String tasks : taskList) {
            System.out.println(tasks + "; ");
        }
        System.out.println("*****************");
    }
}