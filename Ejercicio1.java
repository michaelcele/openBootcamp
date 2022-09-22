public class Ejercicio1 {

        public static void main(String[] args) {
                suma(1, 4);
                Coche car1 = new Coche(1);
                System.out.println(car1.puertas);
                car1.aniadirPuerta(2);
                System.out.println(car1.puertas);

        }

        public static int suma(int a, int b) {
                int suma = a + b;
                return suma;
        }
}
