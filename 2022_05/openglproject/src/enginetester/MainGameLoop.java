package enginetester;

import org.lwjgl.opengl.Display;
import project.DisplayManager;

public class MainGameLoop {
    public static void main(String[] args) {
        
        DisplayManager.createDisplay();

        while (!Display.isCloseRequested()) {
            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();
/*         System.out.println(System.getProperty("java.library.path")); */

    }
}
