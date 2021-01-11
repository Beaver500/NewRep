package task6_1_Arrays_are_one_dimensional;

class Product{
     int price;
     String name;

    public Product(int price, String name){
        this.price=price;
        this.name=name;
    }
}

/*
 * Задача, есть рейсы автобусов, чем ближе автобус тем раньше он поедет.
 * */
// создаем макет "Автобуса"
/*class TransportSchedule implements Comparable<TransportSchedule> {
    String bus;
    String time;
    String number;

    public TransportSchedule(String bus, String time, String number) {
        this.bus = bus;
        this.time = time;
        this.number = number;
    }

    int timeToSeconds(){
        String [] c = time.split(":");
        int hours =Integer.parseInt(c[0]);
        int minutes =Integer.parseInt(c[1]);
        return hours*60*60+minutes*60;
    }

    @Override
    public int compareTo(TransportSchedule other) {

        return timeToSeconds()-other.timeToSeconds();
    }


    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t", time,bus,number);
    }
}*/


public class Main {

    public static void main(String[] args) {

        //пример 1

        /*int [] price = new int [10];

        for (int i = 0; i < price.length; i++) {
            price[i]=i*100;
        }
        for (int i = 0; i <price.length ; i++) {
            System.out.print(price[i] + " ");
        }*/

        //пример 2

Product [] products = new Product[]{ new Product(10,"Cheese"), new Product(20, "Bread")}; //массив из продуктов, после такого объявления  "}:"
int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            Product currentProduct = products[i];
            totalPrice+= currentProduct.price;
        }
        System.out.println(totalPrice);

        // прмер 3 сортировка

        // int [] array = new int[]{ 5,13,66,5,34,12,111};
        //Arrays.sort(array); // простой метод сортировки
        //System.out.println(Arrays.toString(array));//Arrays.toString(array) преобразует массив в строку

        // сортировка ПУЗЫРЬКОМ
        /*for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length  ; j++) {
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i]= array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));*/

        // прмер 4 смассив случайных чисел

        /*int [] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100+1)*2-50;// любые элементы не более 100. array[i] = random.nextInt(100)
        }
        System.out.println(Arrays.toString(array));*/


//Пример 5
/*
        TransportSchedule [] schedule = new TransportSchedule[10];
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите через пробел тип транспорта, номер маршрута и время прибытия в формате (hh:MM)");
            System.out.println("end для выхода из программы");
            String input = scanner.nextLine();
            if ("end".equals(input) || counter == 10) {
                System.out.println("Программа завершена.");
                break;
            }
            String [] info = input.split(" ");
            TransportSchedule item =new TransportSchedule(info[0], info[1],info[2]);
            schedule[counter] = item;
            Arrays.sort(schedule, 0, counter);
            counter +=1;
            System.out.println("Актуально расписание: ");
            for (int i = 0; i < counter; i++) {
                System.out.println(schedule[i]);
            }
            }*/
        }



    }

