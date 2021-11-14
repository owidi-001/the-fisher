public class TestFishTypes{
    
    public static void main(String args[]){
        FishType fishType1;
        FishType fishType2;
        FishType fishType3;
        FishType fishType4;
        FishType fishType5;


        //Make some FishTypes:
        fishType1 = new FishType("Ayu, Sweetfish", "Common", 5, 1);
        fishType2 = new FishType("Ayu, Sweetfish", "Common", 5.01, 1);
        fishType3 = new FishType("Ayu, Sweetfish", "Common", 5.005, 1);
        fishType4 = new FishType("Bicolor Goatfish,", "Uncommon", 10, 2);
        
        //Print the FishTypes:
        System.out.println("Created four FishType instances, let's see how they look:");
        System.out.println("FishType1 toString: " + fishType1);
        System.out.println("FishType2 toString: " + fishType2);
        System.out.println("FishType3 description: " + fishType3.getDescription());
        System.out.println("FishType4 description: " + fishType4.getDescription());
        System.out.println();
        
        
        // Try out the equals method
        System.out.println("Let's take the Equals method for a test drive:");
        System.out.println("Are FishType1 and FishType2 equal? They should NOT be: " + fishType1.equals(fishType2) );
        System.out.println("Are FishType1 and FishType3 equal? They should be: " + fishType1.equals(fishType3));
        System.out.println("Are FishType2 and FishType3 equal? They should be: " + fishType2.equals(fishType3));
        System.out.println("Are FishType1 and FishType4 equal? They should NOT be: " + fishType1.equals(fishType4));
        System.out.println();

        
        // Try out some setters and getters
        System.out.println("Time for some getters and setters:");
        System.out.println("How rare is FishType1? " + fishType1.getRarity() );
        System.out.println("How rare is FishType4? " + fishType4.getRarity() );
        System.out.printf("What's the price per pound of FishType1? $%.2f \n", fishType1.getPrice() );
        System.out.printf("What's the price per pound of FishType4? $%.2f \n", fishType4.getPrice() );
        fishType3.changePrice(5.25);
        System.out.printf("What's the new price per pound of FishType3? $%.2f \n", fishType3.getPrice() );
        System.out.println("What's the age restriction of FishType1? " + fishType1.getRestriction() );
        System.out.println("What's the age restriction of FishType4? " + fishType4.getRestriction() );
        System.out.println();
        
        
        
    }
    
    
//        fishType1 = new FishType("Ayu, Sweetfish", "Common", 5, 1);
//        fishType2 = new FishType("Bicolor Goatfish,", "Uncommon", 10, 2);
//        fishType3 = new FishType("Chimaera fish", "Rare", 15, 12);
//        fishType4 = new FishType("Dragonet", "Epic", 25, 5);
//        fishType5 = new FishType("Electric knifefish", "Legendary", 50, 120);
    
}