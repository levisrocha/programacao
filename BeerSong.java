public class BeerSong{
    public static void main(String[] args){
	int beerNum = 99;
        String word = "bottles";
        
	While (beerNum > 0) {
	  if (beerNum == 1) {
		word = "bottle"; //No singular, como em Uma garrafa.
	    }//fim do if
	  System.out.println(beerNum + " " + word + "of beer on the wall");
          System.out.println(beerNum + " " + word + "of beer.");
          System.out.println("Take one down");
	  System.out.println("Pass it around.");
	  beerNum = beerNum - 1;
	  
          if (beerNum == 0){
              System.out.println(beerNum + " " + word + " of beer on the wall");
      
           }else {
                System.out.println("No more bottle of beer on the wall");
             }//fim do else
           }//Fim do While
	
     }//Fim do Método Main

}//Fim  da Classe BeerSong
