public class Plane implements IFly{
    private String name;

    public Plane(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String flightSpeed(){
        return getClass().getName() + "flies at a speed of 460-575 mph";
    }
}