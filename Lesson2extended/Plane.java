public class Plane {
    private int weight;
    private int speed;
    private int height;

    public Plane(int weight, int speed, int height) {
        this.weight = weight;
        this.speed = speed;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
