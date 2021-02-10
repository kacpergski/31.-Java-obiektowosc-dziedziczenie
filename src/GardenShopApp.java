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
            System.out.println("3 -add clothes");
            System.out.println("4 -display all");
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

                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Purpose: ");
                    String purpose = scanner.nextLine();
                    Fetilizer fetilizer = new Fetilizer(name,price,purpose);
                    gardenShop.addFetilizer(fetilizer);
                    break;

                case 3:

                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Size: ");
                    String size = scanner.nextLine();
                    Cloth cloth  = new Cloth(name,price,size);
                    gardenShop.addCloth(cloth);
                    break;

                case 4:
                    gardenShop.displayAll();

                    break;


            }

        } while (option != 0) ;
        scanner.close();
    }
}