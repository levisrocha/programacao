class TestArrays{

  public static void main(String [] args){
    
    int[] index = new int[4];
    
    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;
    int y = 0;
    String[] islands = new String[4];
    
    islands[0] = "Bermuda";
    islands[1] = "Piji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";
    
    
    
   
    int x = 0;
    int ref;
    while(x < islands.length){
      ref = index[x];
      System.out.println("Island = " + islands[ref]);
      x = x+ 1;
    }

  }
}
