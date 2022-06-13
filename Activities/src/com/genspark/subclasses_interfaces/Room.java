
//Write a class called Room, which has three private instance variables:
//- a double width, representing the width of the room in feet,
//- a double length, representing the length of the room in feet, and
//- an int floor, representing the building floor that the room is on.
public class Room{
 private double width;
 private double length;
 private int floor;
 //Non-parametrised constructor to set the values for thae variables
 //Write a default constructor for the class Room that sets the width to 10, the length to
 //12.5, and the floor to 1.
 public Room(){
     this.width = 10;
     this.length = 12.5;
     this.floor = 1;
 }
// Write get and set methods (“getters” and “setters”) for the three instance variables. For the set
//methods for the width and length, only positive values should be set. If the input is 0 or a
//negative number, the variables should not be changed.
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0){
        this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length >0) {
            this.length = length;
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public  toString() {
        return this.getLength()+"x"+ this.getWidth()+", floor"+ this.getFloor();
    }
}