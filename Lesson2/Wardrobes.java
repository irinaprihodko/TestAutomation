package Lesson2;

public class Wardrobes {
    private int doorsAmount;
    private int height;
    private double depth;
    private String colorCase;
    private boolean isDelivered;


    public int getDoorsAmount() {
        return doorsAmount;
    }
    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getDepth() {
        return depth;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public String getColorCase() {
        return colorCase;
    }
    public void setColorCase(String colorCase) {
        this.colorCase = colorCase;
    }
    public boolean isDelivered() {
        return isDelivered;
    }
    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }
    public void axDepth(){
        depth /= 2;
    }
    public void takeClothes() {
        System.out.println("clean");
    }
    public void open(){
        System.out.println("Нeчего надеть");
    }
    public String leaveFeedback(String phrase){
        return phrase;
    }

    public Wardrobes(){}

        public Wardrobes (double depth, int height){
        this.depth = depth;
        this.height = height;}

    public static void main(String[] args) {
        Wardrobes ecoWardrobes = new Wardrobes();
        ecoWardrobes.setColorCase("venge");

        Wardrobes badWardrobes = new Wardrobes(6.5d,100);

        System.out.println(ecoWardrobes.getColorCase());
        System.out.println(badWardrobes.getDepth());}
}

