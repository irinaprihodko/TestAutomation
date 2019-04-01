public class Human {
    {
        protected String name;
        protected String surname;
        public void setName(String name) {
    }){

        }
        public String getName()
        return name;
        public void setSurname(String surname){

        }
        public String getSurname(){
            return surname;
        }
    }

    public class Alcoholic extends Human{
        private String drink;

        public Alcoholic(String n, String s, String p){
            String name = n;
            String surname = s;
           String drink = p;
        }



        public String getDrink() {
            return drink;
        }

        public void setDrink(String drink) {
            this.drink = drink;
        }
    }
}
