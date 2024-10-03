package cars;

public class Car{

//Members of the class
private String make;
private String owner;
private String colour;
private int fuel = 100;

//Constructor
public Car(){
    this.colour = "Silver";
    this.make = "Toyota";
}

public Car(String m, String colour){

    this.make = m;
    this.colour= colour;
}

// Getters and Setters

public void setMake(String m) { 
    this.make = m;
}

public String getMake() { 
    return this.make; 
}

public void setOwner(String o) { 
    this.owner = o; 
}

public String getOwner() { 
    return this.owner; 
}

public String getColour() {
    return colour;
}

public void setColour(String colour) {
    this.colour = colour;
}

// Overloading methods
public void go(){
   // this.fuel--;

    go(1,false);
}

public void go(int distance){
    //this.fuel -= distance;

    go(distance, false);
}

public void go(int distance, boolean turbo){
    if (turbo){
        this.fuel -= 2;
    }

    else {
        this.fuel -= distance;
    }
    
}

// Methods
public void fuelGauge(){

    System.out.printf("Current fuel level: %d'%'.\n",this.fuel);
}


public void info(){

    System.out.printf("Make: %s, Owner: %s, Colour: %s\n", this.make, this.owner, this.colour);



}

    

}