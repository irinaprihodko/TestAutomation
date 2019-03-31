package Lesson2;

public class Food {
    private int termin;
    private float weight;
    private double width;
    private int height;
    private String color;
    private boolean isInPackage;
    private boolean isNeedToFreeze;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getTermin() {
        return termin;
    }
    public void setTermin(int termin) {
        this.termin = termin;
    }
    public float getWeight() {
        float weight = this.weight;
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
    public boolean isInPackage() {
        return isInPackage;
    }
    public void setInPackage(boolean inPackage) {
        isInPackage = inPackage;
    }
    public boolean isNeedToFreeze() {
        return isNeedToFreeze;
    }
    public void setNeedToFreeze(boolean needToFreeze) {
        isNeedToFreeze = needToFreeze;
    }
    public void increaseTermin(){
        termin+=3;
    }
    public void spoil() {
    System.out.println("Фу");
}
    public void tasteFresh(){
        System.out.println("Ням");
    }
    public String leaveFeedback(String phrase){
                 return phrase;
                 }

        public Food(){}

        public Food(String color, int weight){
            this.color = color;
            this.weight = weight;}

        public Food (int termin, int height){
            this.termin = termin;
            this.height = height;}

    public static void main(String[] args) {
        Food italianFood = new Food();
        italianFood.setColor("green");

        Food russianFood = new Food(20,100);

      System.out.println(italianFood.getColor());
      System.out.println(russianFood.getTermin());}
    }