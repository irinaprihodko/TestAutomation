package Lesson2;

public class Snowcars {
    private int power;
    private char weight;
    private long modelNumber;
    private String usability;
    private boolean isEasyToUse;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public char getWeight() {
        return weight;
    }
    public void setWeight(char weight) {
        this.weight = weight;
    }
    public long getModelNumber() {
        return modelNumber;
    }
    public void setModelNumber(long modelNumber) {
        this.modelNumber = modelNumber;
    }
    public String getUsability() {
        return usability;
    }
    public void setUsability(String usability) {
        this.usability = usability;
    }
    public boolean isEasyToUse() {
        return isEasyToUse;
    }
    public void setEasyToUse(boolean easyToUse) {
        isEasyToUse = easyToUse;
    }

    public void increasePower() {
        power += 100;
    } public void stuck() {
        System.out.println("damn");
    }
    public void launch(){
        System.out.println("rrrrrrrrrrr");
    }
    public String noise(String sounds){
        return sounds;
    }

    public Snowcars(){}

    public Snowcars(boolean isEasyToUse, String usability){
        this.isEasyToUse = isEasyToUse;
        this.usability = usability;}

    public Snowcars(long modelNumber, char weight){
        this.modelNumber = modelNumber;
        this.weight = weight;}

    public static void main(String[] args) {
        Snowcars greenSnowcars = new Snowcars();
        greenSnowcars.setModelNumber(123456789);

        Snowcars redSnowcars = new Snowcars(true,"Perfect");

        System.out.println(greenSnowcars.getModelNumber());
        System.out.println(redSnowcars.getUsability());}
}




