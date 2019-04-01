package Lesson2;

public class Haircutters {
    private float sharpness;
    private int speed;
    private int rate;
    private char priceCategory;
    private String company;
    private boolean isUkrainian;




    public float getSharpness() {
        return sharpness;
    }

    public void setSharpness(float sharpness) {
        this.sharpness = sharpness;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int power) {
        this.speed = power;
    }

    public char getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(char priceCategory) {
        this.priceCategory = priceCategory;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        rate = rate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isUkrainian() {
        return isUkrainian;
    }

    public void setUkrainian(boolean ukrainian) {
        isUkrainian = ukrainian;
    }

    public void changeSpeed() {
        speed -= 10;
    } public void injury() {
        System.out.println("ouch");
    }
    public void inCharge(){
        System.out.println("zzz");
    }
    public String comfort(String words){
        return words;
    }

    public Haircutters(){}

    public Haircutters(char priceCategory, int rate){
        this.priceCategory = priceCategory;
        this.rate = rate;}

    public Haircutters(String company, int speed){
        this.company = company;
        this.speed = speed;}

    public static void main(String[] args) {
        Haircutters germanHaircutters = new Haircutters();

        germanHaircutters.setRate(1);

        Haircutters frenchHaircutters = new Haircutters("Panasonic",15);

        System.out.println(frenchHaircutters.getCompany());
        System.out.println(germanHaircutters.getRate());}
}






