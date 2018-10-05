package be.pxl.generics.demo2;

public class Habitat<A extends Animal> {
    private A inhabitant;

    public void addInhabitant(A inhabitant) throws HabitatOvercrowdedException {
        if (this.inhabitant != null) {
            throw new HabitatOvercrowdedException("Habitat full.");
        }
        this.inhabitant = inhabitant;
        System.out.println("The Inhabitant is a " + inhabitant.getClass().getSimpleName());
    }
}
