package practice;

import java.util.Scanner;

public class TrucksAndContainers {
    static final int BOXES_IN_CONTAINER = 27;
    static final int CONTAINERS_IN_TRUCK = 12;
    static final int BOXES_IN_TRUCK = BOXES_IN_CONTAINER * CONTAINERS_IN_TRUCK;
    public static void main(String[] args) {

        int container = 0;
        int truck = 0;

        Scanner scanner = new Scanner(System.in);

        int boxes = scanner.nextInt();

        for (int i = 0; i < boxes; i++) {
            if (i % BOXES_IN_TRUCK == 0) {
                truck++;
                System.out.println("Грузовик: " + truck);
            }
            if (i % 27 == 0) {
                container++;
                System.out.println("\tКонтейнер: " + container);
            }
            System.out.println("\t\tЯщик: " + (i+1));
        }
        System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + truck + " шт." + System.lineSeparator() + "контейнеров - " +container + " шт.");



        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
