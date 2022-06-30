import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите адрес папки для копирования");
            String fromDir = scanner.nextLine();
            System.out.println("Куда копировать ?");
            String toDir = scanner.nextLine();
            FileUtils.copyFolder(fromDir, toDir);
        }


    }
}
