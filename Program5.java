class Program5{
    public static void main(String[] args){
        int royaleMiles = 286;
        int royaleGallons = 9;
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;
        int badWagonMiles = 161;
        int badWagonGallons = 11;
        
        double royaleMileage = (double) royaleMiles / royaleGallons;
        double koopaKingMileage = (double) koopaKingMiles / koopaKingGallons;
        double pipeFrameMileage = (double) pipeFrameMiles / pipeFrameGallons;
        double badWagonMileage = (double) badWagonMiles / badWagonGallons;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: ");
        System.out.println("\nRoyale: " + (int) (royaleMileage * 100) / 100.0);
        System.out.println("\nKoopa King: " +  (int) (koopaKingMileage * 100) / 100.0);
        System.out.println("\nPipe Frame: " + (int) (pipeFrameMileage * 100) / 100.0);
        System.out.println("\nBadwagon: " + (int) (badWagonMileage * 100) / 100.0);
        
        /*
         Output: 
         
            Mushroom Cup Prix Racer Average Miles/Per Gallon: 

            Royale: 31.77
            
            Koopa King: 10.3
            
            Pipe Frame: 20.05
            
            Badwagon: 14.63
         
         
         */
        
        
    }
}
