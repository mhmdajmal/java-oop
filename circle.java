public class circle {
    private double radius ;
    private String colour ;
    
    public circle(){

    }

    
    public circle (double radius , String colour){
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getcolour(){
        return this.colour;
    }

    public double getaria(){
        return 3.14 * radius * radius;
    }
    public String toString(){
        return  "radius : " + getRadius() + " colour :  "+ getcolour() + "aria :  "+getaria() ;
    }
}
