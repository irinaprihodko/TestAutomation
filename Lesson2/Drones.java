package Lesson2;

public class Drones {
    private float width;
    private int weight;
    private int price;
    private int storage;
    private String color;
    private boolean isFlying;

    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
   public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFlying() {        return isFlying();
    }
    public void setFlying(boolean working) { isFlying = working;
    }
    public void startRecordVideo() {
    }
    public void finishRecordVideo() {
        System.out.println("rec");
    }
    void launch() {
    } public void increasePrice(){
        price += 1000;
    }
    public void startRecord() {
        System.out.println("rec");
    }
    public void land(){
        System.out.println("жж");
    }


    public Drones(){}

    public Drones(String color, int weight){
        this.color = color;
        this.weight = weight;}

    public Drones (int price, int storage){
        this.price = price;
        this.storage = storage;}

    public static void main(String[] args) {
        Drones travelDrones = new Drones();
        travelDrones.setStorage(55);

        Drones homeDrones = new Drones("violet",2);

        System.out.println(travelDrones.getStorage());
        System.out.println(homeDrones.getWeight());
}

}
