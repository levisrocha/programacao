class DogMatr{
String name;
public void bark(){
  System.out.println(name + "diz Ruff!");
}

public void eat(){};
public void chaseCat(){};



public static void main(String[] args){
  //cria um objeto dog e o acessa
  Dog dog1 = new Dog();
  dog1.bark();
  dog1.name = "Bart";

  //agora cria uma matriz Dog
  Dog[] myDogs = new Dog[3];
  // e colocamos alguns Dogs nela
  myDogs[0] = new Dog();
  myDogs[1] = new Dog();
  myDogs[2] = dog1;
  //agora acessa os objetos Dog
  //usando as referencias da matriz
  myDogs[0].name = "Fred";
  myDogs[1].name = "Marge";
  //hmm... qual é o nome do de myDogs[2]?
  System.out.print("O nome do outro cão é ");
  System.out.println(myDogs[2].name);
  //agora executa um loop peça matriz
  // e pede a todos os cães para latirem
  int x = 0;
  while (x < myDogs.length){
    myDogs[x].bark();
    x = x +1;
  }
}
}
