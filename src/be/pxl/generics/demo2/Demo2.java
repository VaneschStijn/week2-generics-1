package be.pxl.generics.demo2;

public class Demo2 {
    public static void main(String[] args) throws HabitatOvercrowdedException {
        //Habitat<String> stringHouse = new Habitat<>();  //String is geen subklasse van Animal
        Habitat<Snail> cochlea = new Habitat<>();
        //cochlea.addInhabitant(new Cat());     //Incorrect type voor deze variable
        cochlea.addInhabitant(new Snail());
    }
}
