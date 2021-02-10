public class GardenShop {
    private Flower [] flowers = new Flower[10];
    private int flowerIndex = 0 ;
    private  Fetilizer [] fetilizers = new Fetilizer[10];
    private int fetilizerIndex = 0 ;
    private Cloth [] clothes = new Cloth[10];
    private  int clothesIndex = 0;

    public  void addFlower (Flower flower){
        if (flowerIndex < flowers.length) {
        flowers [flowerIndex++] = flower;
        }
        else System.out.println("brak miejsca na kwiat");
    }

    public  void addFetilizer (Fetilizer fetilizer){
        if (fetilizerIndex < fetilizers.length) {
            fetilizers[fetilizerIndex++] = fetilizer;}

          else  System.out.println("brak miejsca na nawóz");


    }

    public  void addCloth (Cloth cloth){
        if (clothesIndex < clothes.length) {
            clothes[clothesIndex++] = cloth;}

        else  System.out.println("brak miejsca na ubranie");


    }


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

        for (int i = 0; i < clothesIndex; i++) {
            Cloth cloth = clothes[i];
            System.out.println("Name: " + cloth.getName());
            System.out.println("Price: " + cloth.getPrice());
            System.out.println("Size: " + cloth.getSize());
        }
    }


}
