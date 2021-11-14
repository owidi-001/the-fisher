public class TestFish{
    
    public static void main(String args[]){
        FishType fishType1;
        FishType fishType2;
        
        //Make some FishTypes:
        fishType1 = new FishType("Ayu, Sweetfish", "Common", 5, 1);
        fishType2 = new FishType("Bicolor Goatfish,", "Uncommon", 10, 2);
        
        Fish fish1 = new Fish(fishType1, 2.1, 3);
        Fish fish2 = new Fish(fishType1, 2.11, 1);
        Fish fish3 = new Fish(fishType1, 1.1, 0);
        Fish fish4 = new Fish(fishType2, 4.7, 2);
        Fish fish5 = new Fish(fishType2, 1.51, 1);
        
        
        
        //Print the Fish:
        System.out.println("Created five Fish instances, let's see how they look:");
        System.out.println("Fish1: " + fish1);
        System.out.println("Fish2: " + fish2);
        System.out.println("Fish3: " + fish3);
        System.out.println("Fish4: " + fish4);
        System.out.println("Fish5: " + fish5);
        System.out.println();
        
        
        // Try out the equals method
        System.out.println("Let's take the Equals method for a test drive:");
        System.out.println("Are Fish1 and Fish2 equal? They should be: " + fish1.equals(fish2) );
        System.out.println("Are Fish1 and Fish3 equal? They should NOT be: " + fish1.equals(fish3));
        System.out.println("Are Fish4 and Fish5 equal? They should NOT be: " + fish4.equals(fish5));
        System.out.println();
        
        // Try out some setters and getters
        System.out.println("Time for some getters and setters:");
        System.out.printf("Fish1 is %.2f pounds. \n", fish1.getWeight() );
        System.out.println("What type is Fish4? " + fish4.getType() );
        System.out.printf("Fish3 is %d years old. \n", fish3.getAge() );
        System.out.printf("We could sell Fish2 for $%.2f. \n", fish2.getValue() );
        fishType1.changePrice(5.25);
        System.out.printf("With the new price change, we could now sell Fish2 for $%.2f. \n", fish2.getValue() );
        System.out.println("Was Fish5 a valid catch? " + fish5.isValid() );
        System.out.println();
 
        
    }
    
    
}