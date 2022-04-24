public class Elephant extends Animal implements Herbivore {
    
private String sound;
private String colour;

public Elephant(String name, int numOfLegs, String sound, String colour){
    super(name, numOfLegs);
    this.sound = sound;
    this.colour = colour;
} 

@Override
public String display(){
    return "\n--------------------------ELEPHANT--------------------------\nName: "+name+ "\nNumber of Legs: "+numOfLegs+"\nSound: "+sound+"\nColor: "+colour;
}

@Override
public String eat(){
    return name+ " is a Herbivore and eats "+typeH+".\nElephant likes to eat "+foodH;
}
}

