public class ToString {

    public static void main (String [] args) {

        Hola miHola = new Hola("Hola Juan, este es el contenido de mi objeto. Patata");

        System.out.println(miHola);

    }

    public static class Hola {

        private String hola;

        public Hola(String hola) {
            this.hola = hola;
        }

        public String getHola() {
            return hola;
        }

        public void setHola(String hola) {
            this.hola = hola;
        }

        int x = 0;

        @Override
        public String toString() {

            x++;

            return "Hola, soy el objeto" + x + " y mi contenido es " + hola;

        }
    }

}
