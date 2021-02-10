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
            flowers[i].display();

        }
    }

}
