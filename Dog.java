class Dog{
  int size;
  String name;
  
  void bark(int numOfBarks){
    while(size > 60 && numOfBarks > 0){
      System.out.println("Wooof! Woof!");
      numOfBarks = numOfBarks -1;
    }if(size > 14){
      System.out.println("Ruff! Ruff!");
    }else {
      System.out.println("Yip! Yip!");
    }
  }
}

