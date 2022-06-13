public class Room{
 private double width;
 private double length;
 private int floor;
 //Non-parametrised constructor to set the values for thae variables
 public Room(){
     this.width = 10;
     this.length = 12.5;
     this.floor = 1;
 }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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