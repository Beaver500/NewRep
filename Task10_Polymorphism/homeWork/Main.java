package Task10_Polymorphism.homeWork;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

/*надо написать так, чтобы будь у игрока хоть 100500 оружия, вы класс Main  не поменяли бы
это до сих пор не соблюдается, найдите что не так с этим в Main)
зачем вы на 17й строке сравниваете через строки если вы уже превратили строку в число?*/

        while (true) {

            System.out.format("У игрока %d слотов с оружием," +
                    " введите номер от 0 до " + (player.getSlotCount() - 1) + ", чтобы выстрелить," +
                    " -1 чтобы выйти %n", player.getSlotCount());

            String s = scanner.nextLine();
            int slot = Integer.parseInt(s);

            if (slot == -1) {
                System.out.println("end");
                break;
            }
            player.shotWithWeapon(slot);
        }
    }
}
