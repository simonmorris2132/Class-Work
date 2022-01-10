package lecturetwo;

public class Pencil {
    public String color = "red";
    public int length;
    public float diameter;

    public static long nextID = 0;

    public void setColor(String newColor) {
        color = newColor;
    }
}
