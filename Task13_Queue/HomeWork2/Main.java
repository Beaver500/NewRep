package Task13_Queue.HomeWork2;
/*Задача - написать программу перевода инфиксной записи (например 2 + 3) в постфиксную запись (2 3 +), что и будет являться так называемой "Обратной польской записью". Обра́тная по́льская запись (англ. Reverse Polish notation, RPN) — форма записи математических и логических выражений, в которой операнды расположены перед знаками операций (источник https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%BB%D1%8C%D1%81%D0%BA%D0%B0%D1%8F_%D0%BD%D0%BE%D1%82%D0%B0%D1%86%D0%B8%D1%8F). Такая запись имеет ряд преимуществ перед инфиксной записью при выражении математических формул:

Любая формула может быть выражена без скобок.
Удобна для вычисления формул в stack машинах (например JVM).
Нет нежелательных приоритетов операторов.
Необходимо реализовать алгоритм на основе очереди, который прочитает математическое выражение, найдет все числа и сохранит их отдельно от знаков (в отдельную коллекцию).

Функционал программы
Ввод математического выражения
Вывод выражения в формате обратной польской записи.
Пример
Введите математическое выражение:
7 − 2 * 3
Выражение в формате обратной польской записи:
7 2 3 * −
Процесс реализации
Создадим объект Scanner и запросим у пользователя ввод выражения в формате: 2 + 3 * 4.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите математическую формулу:");
    String input = scanner.nextLine();
Создадим две коллекции для хранения знаков и чисел. Для хранения чисел можно использовать Queue, а знаков - Stack, так как нужно будет их доставать с конца коллекции.
    Stack<String> sign = new Stack<>();
    Queue<Integer> numbers = new ArrayDeque<>();
Разберем выражение по символам.
Во время того как мы будем перебирать элементы выражения, нужно научиться отличать числа от арифметических знаков.
Создадим цикл. Чтобы перебрать все элементы массива чисел и знаков, можно использовать Stream API или преобразовать в List. Я же создам цикл с индексом и буду добавлять в очередь числа, а в стэк все операции.
   for (int i = 0; i < arrayValues.length; i++) {
       String value = arrayValues[i];
       if (...) {
           numbers.add(Integer.parseInt(value));
       } else {
           sign.add(value);
       }
   }
Завершающим этапом можно создать два цикла, прочитать и вывести сначала все числа из очереди, а следом прочитать и вывести все из стэка знаков. Пример:
   while (!numbers.isEmpty()) {
       //ваш код
   }

   while (!sign.isEmpty()) {
       //ваш код
   }
Завершаем работу программы.*/
public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();

        Stack<String> sign = new Stack<>();
        Queue<Integer> numbers = new ArrayDeque<>();
       int [] arrayValues;

        for (int i = 0; i < arrayValues.length; i++) {
            String value = arrayValues[i];
            if (...) {
                numbers.add(Integer.parseInt(value));
            } else {
                sign.add(value);
            }
        }

        while (!numbers.isEmpty()) {
            //ваш код
        }

        while (!sign.isEmpty()) {
            //ваш код
        }*/
    }
}