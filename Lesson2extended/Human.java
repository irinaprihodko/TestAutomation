public class Human {

        protected String name;
        protected String surname;
        public void setName(String newName) {name = newName}
        public String getName(){ return name;}
        public void setSurname(String newSurname){surname = newSurname}
        public String getSurname(){ return surname;}}

    public class Alcoholic extends Human{
        private String health;

        public Alcoholic(String n, String s, String h){
            String name = n;
            String surname = s;
           String health = h;}
           public String getHealth() {
            return health;
        }
            public void setHealth (String badHealth) {
            badHealth = health;
        } }

