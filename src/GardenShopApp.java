import java.util.Scanner;

public class GardenShopApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        GardenShop gardenShop = new GardenShop();
        do {
            System.out.println("---------garden shop------------");
            System.out.println("1 -add flower");
            System.out.println("2 -add fetilizer");
            System.out.println("3 -display all");
            System.out.println("0 -exit");
            System.out.println("---------------------------------");
            option = scanner.nextInt();
            scanner.nextLine(); // /n

            switch (option) {

                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Type: ");
                    String type = scanner.nextLine();

                    Flower flower = new Flower(name, price, type);
                    gardenShop.addFlower(flower);
                    break;

                case 2:
                    break;

                case 3:
                    gardenShop.displayAll();

                    break;


            }

        } while (option != 0) ;
        scanner.close();
    }
}