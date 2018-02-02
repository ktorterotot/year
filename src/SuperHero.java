import java.util.Arrays;

public abstract class SuperHero implements IFly{
    private String name;

    public SuperHero(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    abstract String[] specialPowers();

    @Override
    public String toString(){
        return getClass().getSimpleName() + " whose real name is" + this.name + "and has the following special powers:";
    }
}