import java.util.Objects;

public class FishType {
    private String name,rarity;
    private double price;
    private int restriction;

    // Constructor
    public FishType(String name,String rarity,double price,int restriction){
        this.name=name;
        this.rarity=rarity;
        this.price=price;
        this.restriction=restriction;
    }

//    Accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public double getPrice() {
        return price;
    }

    public int getRestriction() {
        return restriction;
    }

    public void changePrice(double price) {
        this.price = price;
    }

    public void setRestriction(int restriction) {
        this.restriction = restriction;
    }

    // class methods
    public String getDescription() {
        return  name + "("+ rarity + ")";
    }

    @Override
    public String toString() {
        return  name + ',' +'(' + rarity + ')' + " $" + price +
                " (" + restriction + ')';
    }


    public boolean equals(FishType fishType) {
        if (fishType.getName() == getName() && fishType.getRarity() == getRarity() && fishType.getRestriction()==getRestriction() && Math.abs(fishType.getPrice()-getPrice()) <= 0.005 ){
            return true;
        }
        return false;
    }

}
