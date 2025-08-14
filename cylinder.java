public class cylinder extends circle {
    private double height = 1.0;

    public cylinder(){

    }
    /*public cylinder(double height){
        this.height = height;
    }*/

    public cylinder(double height ){
        super(12.5 , "white");
        this.height = height;
    }
    public double getheight(){
        return height;
    }

    public double getvolume(){
        return getaria() * getheight();
    }
    
    public String toString(){
        return "radius : " + getRadius() + "  volume :  " + getvolume() + "  colour  : " + getcolour();
    }
}
