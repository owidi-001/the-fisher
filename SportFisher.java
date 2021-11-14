public class SportFisher extends RecreationalFisher{
    private double total_weight;

    public SportFisher(String name,int limit){
        super(name,limit);
        this.total_weight=0;
    }

    @Override
    public void fishCaught(Fish fish) {
        total_weight+= fish.getWeight();
    }


    //    Accessors
    public double getTotalWeight() {
        return total_weight;
    }

    @Override
    public String toString() {
        return super.toString() + total_weight ;
    }

    @Override
    String describeLatestTrip() {
        return getTrip().toString() +" \nIn total, this fisher has caught: "+ total_weight + " pounds of fish.";
    }
}
