import java.util.Objects;

public class Fish {
    //    instance variables
    private FishType type;
    private double weight;
    private int age;

    //    constructor
    public Fish(FishType type,double weight,int age){
        this.type = type;
        this.weight=weight;
        this.age=age;
    }

    //    Accessors
    public FishType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    //    Class methods
    public double getValue(){
        return type.getPrice()*getWeight();
    }

    public boolean isValid(){
        if(age>= type.getRestriction()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String legal;
        if(isValid()){
            legal="This is a legal catch";
        }
        else{
            legal="We should release this fish";
        }
        return type.getDescription()+ weight +" pounds"+ "($"+ getValue()+ "), " + legal ;
    }

    public boolean equals(Fish fish) {
        if (fish.getType()==type && Math.abs(fish.getWeight()-weight) < 0.01 && fish.isValid()==isValid()){
            return true;
        }
        return false;
    }

}
