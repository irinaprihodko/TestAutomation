package Lesson2;

public class MobilePhones {
    private String color;
    private String model;
    private int weight;
    private int price;
    private boolean isOutOfServise;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isOutOfServise() {
        return isOutOfServise;
    }
    public void setOutOfServise(boolean outOfServise) {
        isOutOfServise = outOfServise;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void decreasePrice(){
        price -= 20;
    }
    public void buy() {
        System.out.println("Novelty");
    }
    public void takeToService(){
        System.out.println("Broken");
    }
    public String voiceEmail(String words){
        return words;
    }

    public MobilePhones(){}

    public MobilePhones(String model, String color){
        this.color = color;
        this.model = model;}

    public MobilePhones(String model, int price){
        this.model = model;
        this.price = price;}

    public static void main(String[] args) {
        MobilePhones newMobilePhones = new MobilePhones();
        newMobilePhones.setPrice(300);

        MobilePhones oldMobilePhones = new MobilePhones("Nokia",30);

        System.out.println(newMobilePhones.getPrice());
        System.out.println(oldMobilePhones.getModel());}
}


