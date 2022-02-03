package lecturetwo;

public class Pencil {
   private String color;
   private int length;
   private int diameter;

    public Pencil(String color, int length, int diameter) {
        this.color = color;
        this.length = length;
        this.diameter = diameter;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return this.color + ", " + this.length + ", " + this.diameter;
    }

}
