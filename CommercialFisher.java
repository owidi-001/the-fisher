public class CommercialFisher extends Fisher{
    private double grand_total_value;

    public CommercialFisher(String name,int limit){
        super(name,limit,null);
        this.grand_total_value=0;
    }

    @Override
    public void fishCaught(Fish fish) {
        grand_total_value+=fish.getValue();
    }

    //    Accessors
    public double getTotalValue() {
        return grand_total_value;
    }

//    public void setGrand_total_value(double grand_total_value) {
//        this.grand_total_value = grand_total_value;
//    }

    @Override
    public String toString() {
        return super.toString() + grand_total_value ;
    }

    @Override
    String describeLatestTrip() {
        return " "+getTotalValue();
    }

}
