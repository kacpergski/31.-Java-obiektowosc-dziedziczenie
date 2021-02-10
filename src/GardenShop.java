public class GardenShop {
    private Flower [] flowers = new Flower[10];
    private int flowerIndex = 0 ;
    public  void addFlower (Flower flower){
        flowers [flowerIndex++] = flower;

    };

    public void displayAll() {
        for (int i = 0; i < flowerIndex; i++) {
            flowers[i].display();
            
        }
    }

}
