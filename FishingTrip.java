
public class FishingTrip {
    // Instance variables
    private int total, amount;
    //  Partially filled array brought_back
    Fish[] brought_back;
    int size = 0;

    //    Additional
    Fisher fisher;


    //    Constructors
    public FishingTrip(int maxAmount) {
        this.amount = 0;
        this.total = 0;
        this.brought_back = new Fish[maxAmount];
    }

    public FishingTrip(Fisher fisher1) {
        this.fisher = fisher1;
        FishingTrip trip = new FishingTrip(fisher.getLimit());
        fisher.setTrip(trip);
    }

    //    Accessors
    public int getTotal() {
        return total;
    }

    public int getAmount() {
        return amount;
    }

    // Class methods
    public double getTotalValue() {
        double total = 0;

        for (int i = 0; i < size; i++) {
            total += brought_back[i].getValue();
        }
        return total;
    }

    public double getTotalWeight() {
        double total = 0;

        for (int i = 0; i < size; i++) {
            total += brought_back[i].getWeight();
        }
        return total;
    }


    public boolean catchFish(Fish newFish) {
        if (fisher != null) {
            fisher.fishCaught(newFish);
        }
        try {
//            // Adding new fish to the brought back array
//            if (size == brought_back.length) {
//                //array too small - double its size
//                Fish[] temp = new Fish[2 * brought_back.length];
//                for (int i = 0; i < brought_back.length; i++) {
//                    temp[i] = brought_back[i];
//                }
//                brought_back = temp;
//            }
            brought_back[size] = newFish;
            size++;

            amount++;
            total++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//    public Fish releaseFish(int index){
//        Fish[] newFishArray;
//        if (index <= size){
//            Fish fish=brought_back[index];
//            for (int i = index; i < size; i++) {
//                brought_back[i]=brought_back[i+1];
//            }
//            amount--;
//            return fish;
//        }
//        return null;
//    }

    public Fish releaseFish(int index) {
        if (index <= size) {
            Fish fish = brought_back[index];
            //Trim the array to remove null
            Fish[] temp = new Fish[size];
            for (int i = 0; i < size; i++) {
                temp[i] = brought_back[i];
            }
            brought_back = temp;
            amount--;
            return fish;
        }
        return null;
    }

    @Override
    public String toString() {
        //        Loop array
        String brought_back_ = "";
        if (size <= 0) {
            brought_back_ = "Sadly, the boat is empty";
        } else {
            for (int i = 0; i < size; i++) {
                brought_back_ += ">" + brought_back[i] + "\n";
            }
        }
        return "During this FishingTrip, " + total + " total Fish were caught. \n" +
                brought_back_;
    }

    public boolean equals(FishingTrip fishingTrip) {
        return (total == fishingTrip.total && amount == fishingTrip.amount && Math.abs(getTotalValue() - fishingTrip.getTotalValue()) <= 0.1 && Math.abs(getTotalWeight() - fishingTrip.getTotalWeight()) <= 0.1);
    }

}
