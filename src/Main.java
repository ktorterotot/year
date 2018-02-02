public class Main{
    public static void main(String[] args){
        SuperHero[] heros = new SuperHero[2];

        heros[0] = new SuperMan("Clark Kent");
        heros[1] = new WonderWoman( "Diana Prince");

        for(SuperHero x : heros){
            System.out.println("====================");
            System.out.println(x.toString());
        }
    Plane plane = new Plane("Boeing");
        System.out.println("====================");
        System.out.println(plane.flightSpeed());
    }
}