package Lesson2;

public class Fluotubes {
    private float length;
    private int power;
    private int price;
    private String colorGlowing;
    private boolean isWhole;

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColorGlowing() {
        return colorGlowing;
    }
    public void setColorGlowing(String colorGlowing) {
        this.colorGlowing = colorGlowing;
    }
    public boolean isWhole() {
        return isWhole;
    }
    public void setWhole(boolean whole) {
        isWhole = whole;
    }
    public void decreaseLendth(){
        length -= 1;
    }
    public void startGlowing() {
        System.out.println("oooo");
    }
    public void changeColorGlowing(){
        System.out.println("Yellow");
    }
    public String explode(String sounds){
        return sounds;
    }

    public Fluotubes(){}

    public Fluotubes(float length, String colorGlowing){
        this.length = length;
        this.colorGlowing = colorGlowing;}


    public static void main(String[] args) {
        Fluotubes aFluotubes = new Fluotubes();
        aFluotubes.setWhole(false);

        Fluotubes bFluotubes = new Fluotubes(1.5f,"white");

        System.out.println(aFluotubes.isWhole());
        System.out.println(bFluotubes.getLength());}
}

