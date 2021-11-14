public class RecreationalFisher extends Fisher{
    private int grand_total;

    public RecreationalFisher(String name){
        super(name,0,null);
        this.grand_total=0;
    }
    public RecreationalFisher(String name,int limit){
        super(name,limit,null);
    }

    @Override
    public void fishCaught(Fish fish) {
        grand_total+=1;
    }

    @Override
    String describeLatestTrip() {
        return null;
    }

    //    Accessor
    public int getGrandTotal() {
        return grand_total;
    }

    @Override
    public String toString() {
        return super.toString() +" \nIn total, this fisher has caught: "+ grand_total + " fish.";
    }
}
