public class Hangar {

    public static void main(String[] args){

        Car audi = new Car("Audi");
        Boat escudor = new Boat("Escudor");
        System.out.println(audi.doStuff());
        System.out.println(escudor.doStuff());
    }
}