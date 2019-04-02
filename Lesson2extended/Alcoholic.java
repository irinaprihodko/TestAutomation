
    public class Alcoholic extends Human{

        private Alcohol alcohol;


        public Alcoholic(String n, String s, Alcohol a){
            this.name = n;
            this.surname = s;
            this.alcohol = a;
          //   super (n,s);
        }
        public void toDrink (Alcohol alcohol) {
            System.out.println(name + " drinks " + alcohol.getName());
        }

        public Alcohol getAlcohol() {
            return alcohol;
        }

        public void setAlcohol(Alcohol alcohol) {
            this.alcohol = alcohol;
        }
    }


