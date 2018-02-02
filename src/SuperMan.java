public class SuperMan extends SuperHero{

    public SuperMan(String name){
        super(name);
    }
    String[] specialPowers(){
        String[] array = new String[]{"Flight", "x-ray vision", "super-speed", "enhanced hearing"};
        return array;
    }



    public String flightSpeed() {
        return  getClass().getName() + "flies at a speed of 120,000 miles";
    }
}