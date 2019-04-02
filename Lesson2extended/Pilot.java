public class Pilot extends Human {
    private int age;
    private int weight;
    private Plane plane;

    public Pilot(String name, String surname, int age, int weight) {
        super(name, surname);
        this.setAge(age);
        this.setWeight(weight);
        this.plane = new Plane(3,600,1000);

    }

    public void toFly (){
        System.out.println( name + " is a pilot and he flies with speed" + plane.getSpeed());

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

