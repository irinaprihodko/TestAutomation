package Lesson2;

public class Airplanes {
    private float length;
    private double weight;
    private int capacity;
    private long number;
    private String company;
    private boolean isForPassengers;


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isForPassengers() {
        return isForPassengers;
    }

    public void setForPassengers(boolean forPassengers) {
        isForPassengers = forPassengers;
    }

    public void doubleCapacity() {
        capacity *= 2;}
        public void landing() {
            System.out.println("applause");
        }
        public void hideWheels(){
            System.out.println("Taking off");
        }
        public String guide(String words){
            return words;
        }

    public Airplanes(){}

    public Airplanes(double weight, float length){
            this.weight = weight;
            this.length = length;}

    public Airplanes(float length, double weight){
            this.length = length;
            this.weight = weight;}

        public static void main(String[] args) {
            Airplanes boingAirplanes = new Airplanes();
            boingAirplanes.setLength(8.5f);

            Airplanes tuAirplanes = new Airplanes(6.5d,7.8f);

            System.out.println(tuAirplanes.getWeight());
            System.out.println(boingAirplanes.getLength());}
    }




