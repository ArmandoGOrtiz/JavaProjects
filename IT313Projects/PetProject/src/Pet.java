public class Pet {
    private String name;
    private String owner;
    private String animalType;
    private boolean vaccinate;



    public Pet(String name, String owner, String animalType) {
        this.name = name;
        this.owner = owner;
        this.animalType = animalType;
        this.vaccinate = false;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isVaccinate() {
        return vaccinate;
    }

    public void setVaccinate(boolean vaccinate) {
        this.vaccinate = vaccinate;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s" , name , owner , animalType , vaccinate);}

}
