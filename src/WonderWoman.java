public class WonderWoman extends SuperHero{
    public WonderWoman(String name){
        super(name);
    }

    public String[] specialPowers(){
        String[] newArray = new String[]{ "Lasso of truth", "indestructible brcelets", "a tiara which serves as a projectile"};
        return newArray;
    }



    @Override
    public String flightSpeed(){
        return "She does not fly";
    }
}