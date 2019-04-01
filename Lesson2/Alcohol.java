package Lesson2;

public class Alcohol {

        private int degree;
        private float weight;
        private int mark;
        private String name;
        private boolean isSold;

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
    public void increaseName(){
        name+= "light";
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

    public Alcohol(){}

    public Alcohol(String name, int degree){
        this.name = name;
        this.degree = degree;}

    public Alcohol (int mark, boolean isSold){
        this.mark = mark;
        this.isSold = isSold;}

    public static void main(String[] args) {
        Alcohol cheapAlcohol = new Alcohol();
        cheapAlcohol.setMark(5);

        Alcohol expensiveAlcohol = new Alcohol("vine",20);

        System.out.println(cheapAlcohol.getMark());
        System.out.println(expensiveAlcohol.getName());

    }
}

