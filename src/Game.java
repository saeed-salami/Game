import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Server server = new Server();

        Scanner scanner = new Scanner(System.in);
        Car c1 = new Car();
        while (true) {
            String str = scanner.next();
            if (str.equals("end")) {
                break;
            }
            c1.showStatus(str);
        }
    }

}
