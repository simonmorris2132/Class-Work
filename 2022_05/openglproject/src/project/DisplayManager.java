package project;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
    
    private static final int width = 1280;
    private static final int height = 720;

    public static void createDisplay() throws LWJGLException {

        ContextAttribs attribs = new ContextAttribs(3,2);

       try {
        Display.setDisplayMode(new DisplayMode(width, height));
        Display.create(new PixelFormat(), attribs);
       } catch (LWJGLException e) {
           e.printStackTrace();
       }
       
  

    }

    public static void updateDisplay() {

    }

    public static void closeDisplay() {

    }

}
