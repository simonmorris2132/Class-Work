package lecturetwo;

public class Pencil {
    private String color;
    private int length;
    private float diameter;
    private static long nextID = 0;

    public Pencil(String color, int length, float diameter) {
        this.color = color;
        this.length = length;
        this.diameter = diameter;
    }

}
