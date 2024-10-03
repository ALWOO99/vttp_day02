package cars;

public class Toyota extends Car {

    private boolean gps = false;

    public Toyota(){

        setMake("Toyota");
    }

    public boolean isGps(){ return gps; }
    public void setGps(boolean gps){ this.gps = gps; }

    @Override
    public void setMake(String m){}
    
}
