class DogMat {
  String name;

    public static void main (String [] args){
      
      //cria um objeto Dog e o acessa
      Dog dog1 = new Dog();
      dog1.bark();
      dog1.name = "Bart";
      
      //agora cria uma matriz Dog
      Dog[] myDogs = new Dog[3];
      
      //colocando alguns dogs nela
      myDogs[0] = new Dog();
      myDogs[1] = new Dog();
      myDogs[2] = new Dog();
      
      //agora acessa os objetos Dog
      //usando as referências da matriz
      myDogs[0].name = "Fred";
      myDogs[1].name = "Marge";
      

      //hmmm... qual é o nemo de myDog[2]?
      System.out.print("o nome do ultimo cão é ");
      System.out.println(myDogs[2].name);

      //agora executa o loop pela Matriz
      // e pede para todos os cães latirem  
      int x = 0;
      while(x < myDogs.length){
         System.out.println(myDogs[x].name);
         myDogs[x].bark();
         x = x + 1;
      } 
      // as matrizes tem uma variável length que lhe fornecerá a quantidade de elementos

    }

    public void bark(){
      System.out.println(name + " diz Ruff!");
    }

    public void eat(){}
    public void chaseCat(){}
}
