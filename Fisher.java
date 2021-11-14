import java.util.Objects;

abstract class Fisher {
    //    instance variable
    private String name;
    private int limit;
    private FishingTrip latest;

    //    Constructor
    public Fisher(String name,int limit,FishingTrip latest){
        this.name = name;
        this.limit=limit;
        this.latest=latest;
    }

    //    Accessors
    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public FishingTrip getTrip() {
        return latest;
    }


    //    Mutator
    public void setTrip(FishingTrip latest) {
        this.latest = latest;
    }

    abstract public void fishCaught(Fish fish);

    // to string
    @Override
    public String toString() {
        return name +",  limited to "+ limit +" fish. \n" +
                "Latest trip: "+latest;
    }

    abstract String describeLatestTrip();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fisher fisher = (Fisher) o;
        return limit == fisher.limit && Objects.equals(name, fisher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, limit);
    }
}
