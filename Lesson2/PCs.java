package Lesson2;

public class PCs {
    private short numberWindows;
    private int storage;
    private int power;
    private int price;
    private String config;
    private boolean isWorking;

    public short getNumberWindows() {
        return numberWindows;
    }
    public void setNumberWindows(short numberWindows) {
        this.numberWindows = numberWindows;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
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
    public String getConfig() {
        return config;
    }
    public void setConfig(String config) {
        this.config = config;
    }
    public boolean isWorking() {
        return isWorking;
    }
    public void setWorking(boolean working) {
        isWorking = working;
    }
    public void setNumberWindows() {
        numberWindows = 10;}
    public void loading() {
        System.out.println("so long");
    }
    public void runSkype(){
        System.out.println("welcome");
    }
    public String signal(String beep){
        return beep;
    }

    public PCs(){}


    public PCs(int storage, int power, int price){
        this.storage = storage;
        this.power = power;
        this.price = price;}


    public static void main(String[] args) {
        PCs ibmPCs = new PCs();
        ibmPCs.setPrice(100);

        PCs macPCs = new PCs(200,24, 2000);



        System.out.println(macPCs.getPower());
        System.out.println(ibmPCs.getStorage());}
}

