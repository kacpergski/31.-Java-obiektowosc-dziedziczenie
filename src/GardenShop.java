public class GardenShop {
    private Flower [] flowers = new Flower[10];
    private int flowerIndex = 0 ;
    private  Fetilizer [] fetilizers = new Fetilizer[10];
    private int fetilizerIndex = 0 ;

    public  void addFlower (Flower flower){
        flowers [flowerIndex++] = flower;

    };

    public  void addFetilizer (Fetilizer fetilizer){
       fetilizers [fetilizerIndex++] = fetilizer;

    };

    public void displayAll() {
        for (int i = 0; i < flowerIndex; i++) {
            Flower flower = flowers[i];
            System.out.println("Name: " + flower.getName());
            System.out.println("Price: " + flower.getPrice());
            System.out.println("Type: " + flower.getType());
        }
        for (int i = 0; i < fetilizerIndex; i++) {
          Fetilizer fetilizer = fetilizers[i];
            System.out.println("Name: " + fetilizer.getName());
            System.out.println("Price: " + fetilizer.getPrice());
            System.out.println("Purpose: " + fetilizer.getPurpose());
        }
    }


}
