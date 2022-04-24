public class Cat extends Animal implements Pet, Carnivore {
    
private String sound;
private String colour;

public Cat(String name, int numOfLegs, String sound, String colour){
    super(name, numOfLegs);
    this.sound = sound;
    this.colour = colour;
} 

@Override
public String display(){
    return "\n------------------------------CAT-------------------------------\nName: "+name+ "\nNumber of Legs: "+numOfLegs+"\nSound: "+sound+"\nColor: "+colour;
}

@Override
public String play(){
    return name+" likes to play with string.";
}

@Override
public String eat(){
    return name+" is a Carnivore and " +typeC+ "\nCat likes to eat birds, mice, "+foodC+" etc."; 
}
    
}
