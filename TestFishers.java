public class TestFishers{

    public static void main(String args[]){
        FishType fishType1;
        FishType fishType2;

        //Make some FishTypes:
        fishType1 = new FishType("Ayu, Sweetfish", "Common", 0.25, 1);
        fishType2 = new FishType("Bicolor Goatfish,", "Uncommon", 10, 2);

        Fish fish1 = new Fish(fishType1, 2.1, 3);
        Fish fish2 = new Fish(fishType1, 2.11, 1);
        Fish fish3 = new Fish(fishType1, 1.1, 0);
        Fish fish4 = new Fish(fishType2, 4.7, 2);
        Fish fish5 = new Fish(fishType2, 1.51, 1);
        Fish fish6 = new Fish(fishType2, 3.25, 5);

        Fisher fisher1 = new RecreationalFisher("Gabriel");
        Fisher fisher2 = new SportFisher("Jon", 2);
        Fisher fisher3 = new CommercialFisher("Fr�d�ric", 5);

        FishingTrip trip1 = new FishingTrip(fisher1);
        FishingTrip trip2 = new FishingTrip(fisher2);
        FishingTrip trip3 = new FishingTrip(fisher3);

        //Print the Fishers:
        System.out.println("Created three Fisher instances, let's see how they look:");
        System.out.println("Fisher1: " + fisher1 + "\n");
        System.out.println("Fisher2: " + fisher2 + "\n");
        System.out.println("Fisher3: " + fisher3 + "\n");
        System.out.println();


        //RecreationalFisher
        //Catch some Fish for trip1, attached to a RecreationalFisher
        System.out.println("Catch a Fish for trip1, attached to a Recreational Fisher, they should all be false:");
        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish2));
        System.out.println();
        System.out.println("Fisher1 should now have two fish caught in total: \n" + fisher1 + "\n");

        System.out.println("Fisher1 grand total: " + ((RecreationalFisher)fisher1).getGrandTotal() + "\n");


        //SportFisher
        //Catch some Fish for trip3, attached to a SportFisher
        System.out.println("Catch a Fish for trip1, attached to a Recreational Fisher, the first 2 should be true:");
        System.out.println("Trip2 is trying to catch a fish, can it be brought back? " + trip2.catchFish(fish1));
        System.out.println("Trip2 is trying to catch a fish, can it be brought back? " + trip2.catchFish(fish4));
        System.out.println("Trip2 is trying to catch a fish, can it be brought back? " + trip2.catchFish(fish5));
        System.out.println();
        System.out.println("Fisher2 should now have three fish caught in total, and two brought back: \n" + fisher2 + "\n");

        System.out.println("Fisher2 describes their latest trip: \n" + fisher2.describeLatestTrip() + "\n");
        System.out.println("Fisher2 grand total: " + ((SportFisher)fisher2).getGrandTotal());
        System.out.printf("Fisher2 total weight: %.2f pounds\n\n", ((SportFisher)fisher2).getTotalWeight());



        //CommercialFisher
        //Catch some Fish for trip3, attached to a CommercialFisher
        System.out.println("Catch a Fish for trip1, attached to a Recreational Fisher, the first 5 should be true:");
        System.out.println("Trip3 is trying to catch a fish, can it be brought back? " + trip3.catchFish(fish1));
        System.out.println("Trip3 is trying to catch a fish, can it be brought back? " + trip3.catchFish(fish2));
        System.out.println("Trip3 is trying to catch a fish, can it be brought back? " + trip3.catchFish(fish3));
        System.out.println("Trip3 is trying to catch a fish, can it be brought back? " + trip3.catchFish(fish4));
        System.out.println("Trip3 is trying to catch a fish, can it be brought back? " + trip3.catchFish(fish5));
        System.out.println("Trip3 is trying to catch a fish, can it be brought back? " + trip3.catchFish(fish6));
        System.out.println();
        System.out.println("Fisher2 should now have six fish caught in total, and five brought back: \n" + fisher3 + "\n");

        System.out.printf("Fisher2 total value: $%.2f\n\n", ((CommercialFisher)fisher3).getTotalValue());

        System.out.println("Fisher1 describes their latest trip: \n" + fisher1.describeLatestTrip() + "\n");
        System.out.println("Fisher2 describes their latest trip: \n" + fisher2.describeLatestTrip() + "\n");
        System.out.println("Fisher3 describes their latest trip: \n" + fisher3.describeLatestTrip() + "\n");


        //Making a new round of FishingTrips
        trip1 = new FishingTrip(fisher1);
        trip2 = new FishingTrip(fisher2);
        trip3 = new FishingTrip(fisher3);

        System.out.println("Gave each Fisher a new FishingTrip:");
        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish6));
        System.out.println("Trip2 is trying to catch a fish, can it be brought back? " + trip2.catchFish(fish5));
        System.out.println("Trip3 is trying to catch a fish, can it be brought back? " + trip3.catchFish(fish4));

        System.out.println();

        System.out.println("Last look at the Fisher instances:");
        System.out.println("Fisher1: " + fisher1 + "\n");
        System.out.println("Fisher2: " + fisher2 + "\n");
        System.out.println("Fisher3: " + fisher3 + "\n");

    }


}