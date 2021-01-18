package Scribble.TEST;

import java.util.Arrays;

/*
* Вопрос 1
Псевдокод
Данный псевдокод используется для описания алгоритмов.

1. Отступ от левого поля указывает на уровень вложенности.
2. Циклы while, for, repeat и условные конструкции имеют тот же смысл, что и в pascal-е.
3. Символ “--” обозначает комментарий
4. Символ “:=” обозначает присваивание
5. Переменные локальны в рамках процедуры, если не оговорено иначе
6. Индекс массива пишется в квадратных скобках, конструкция A[i] означает i элемент в массиве A
7. Возможно использование объектов, состоящих из нескольких полей, или имеющих несколько атрибутов, значения поля записывается как ИмяПоля[ИмяОбъекта].
К примеру, длина массива A записывается как Length[A]; что означают квадратные скобки - выясняется по контексту (переменная, обозначающая массив, или объект является указателем на составляющие его данные). После присвоения y:=x для любого поля f будет выполняться равенство f[y]=f[x]; определение того, что является атрибутом – функция, переменная или что-либо еще, - делается по контексту.
8. Указатель может иметь специальное значение NIL, не указывающее ни на какой объект.
9. Параметры передаются по значению: вызванная процедура получает собственную копию параметров, изменения параметров внутри процедуры снаружи не видно. При передаче объектов копируется указатель на данные, соответствующие этому объекту.



Задача

Функция сортирующая массив элементов A:
Sort(A,p,r)
1 if p < r
2    then           q := round_half_down((p+r)/2)
3                       Sort(A,p,q)
4                       Sort(A,q+1,r)
5                       Merge(A,p,q,r)

Пример массива:
A = (5,2,4,6,1,3,2,6)

Примера запуска:
Sort(A,1,length[A])


Необходимо:
Разработать алгоритм функции Merge(A,p,q,r) на любом удобном вам языке, с использованием дополнительной памяти или без нее, как вам будет быстрее или удобнее в реализации.
Если у вас получится - с радостью ждем вас для прохождения дополнительного тестирования.
*
*
*
*
* */
public class MarcoPolo {
    public static void main(String[] args) {

/*
        int[] arrayA = {5, 2, 4, 6, 1, 3, 2, 6};
        int[] buffer = new int[arrayA.length];
        int p = 1;
        int r = arrayA.length;
        int[] result = sort(arrayA, buffer, p, r);
        System.out.println(Arrays.toString(result));

        */

/*"Тест2" объядинение
*
*
*
* */

/*

        while (n < 24) {
            while (m = n - 1) {
                System.out.print(" ");
                System.out.println("*");
            }
            n++;
        }
*/


    }


    private static int[] sort(int[] arrayA, int[] buffer, int p, int r) {
        int[] result = new int[arrayA.length];//?

        int q = 0;
        if (p <= r - 1) {
            q = (p + r) / 2;
//            System.out.println("I-" + p + " " + q + " " + r);

            int[] sorted1 = sort(arrayA, buffer, p, q);
//            System.out.println("II-" + p + " " + q + " " + r);
            int[] sorted2 = sort(arrayA, buffer, q + 1, r);
//            System.out.println("III-" + p + " " + q + " " + r);
            int[] merge = marge1(arrayA, buffer, sorted1, sorted2, p, q, r);

        }
        return result;
    }


    private static int[] marge1(int[] arrayA, int[] buffer, int[] sorted1, int[] sorted2,
                                int startIndex, int middle, int endIndex) {
//это нужно?
        if (startIndex >= endIndex - 1) {
            return arrayA;
        }

/*

        int middle = (startIndex + endIndex) / 2;
        int[] sorted1 = mergesortInner(arrayA, buffer, startIndex, middle);
        int[] sorted2 = mergesortInner(arrayA, buffer, middle, endIndex);
*/

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;

        int[] result = sorted1 == arrayA ? buffer : arrayA;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;

    }


    private static int[] marge2(int[] arrayA, int startIndex, int middle, int endIndex) {


        return null;
    }


}
