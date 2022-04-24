public class Bear extends Animal implements Carnivore, Herbivore  {
    
private String sound;
private String colour;

public Bear(String name, int numOfLegs, String sound, String colour){
    super(name, numOfLegs);
    this.sound = sound;
    this.colour = colour;
} 

@Override
public String display(){
    return "\n----------------------------BEAR-------------------------------\nName: "+name+ "\nNumber of Legs: "+numOfLegs+"\nSound: "+sound+"\nColor: "+colour+"\nBear is an Omnivore. \nOmnivore is similar to both Herbivore and Carnivore.";
}

@Override
public String eat(){
    return "Bear eats both " +typeH+ " and also "+typeC+ "\nBear likes to eat berries, roots, fungi, grasses, "+foodC+ ",\ncarrion, small mammals, and insects.";
    
}

}
