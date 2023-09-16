import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the first point (x1): ");
        int x1 = scanner.nextInt();
        System.out.println("Enter the y-coordinate of the first point (y1): ");
        int y1 = scanner.nextInt();
        System.out.println("Enter the x-coordinate of the second point (x2): ");
        int x2 = scanner.nextInt();
        System.out.println("Enter the y-coordinate of the second point (y2): ");
        int y2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is: " + distance);
    }
}

