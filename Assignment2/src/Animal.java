public abstract class Animal {
   protected String name;
   protected int numOfLegs;
   
public Animal(String name, int numOfLegs){
    this.name = name;
    this.numOfLegs = numOfLegs;
}

public abstract String display();
    
public String getName(){
    return name;
}

public int getNumOfLegs(){
    return numOfLegs;

 }
}
