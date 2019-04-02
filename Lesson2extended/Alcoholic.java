
    public class Alcoholic extends Human{
        private String health;
        private Alcohol vodka;


        public Alcoholic(String n, String s, String h){
            String name = n;
            String surname = s;
            String health = h;}
        public String getHealth() {
            return health;
        }
        public void setHealth (String badHealth) {
            badHealth = health;
        }

        public Alcohol getVodka() {
            return vodka;
        }

        public void setVodka(Alcohol vodka) {
            this.vodka = vodka;
        }

        public void drinkVodka (String vodka){}
    }


