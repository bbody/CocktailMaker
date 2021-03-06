package gui;

import java.awt.Image;
import java.awt.Toolkit;

public class Const {
	public static int width = 640;
	public static int height = 480;
	public static String space = " ";
	public static String dash = " - ";
	public static int maxDrinksInList = 5;
	public static String left = "<";
	public static String doubleLeft = "<<";
	public static String right = ">";
	// Close Dialog
	public static int closeWidth = 300;
	public static int closeHeight = 100;
	
	// View
	public static int viewWidth = 600;
	public static int viewHeight = 480;
	
	// Editor Pane
	public static String epMode = "text/html";
	public static String epColour = "Label.background";

	public static String version = "v1.0.0";
	public static String iconFilename = "icon.ico";
	
	public static Image iconImage = Toolkit.getDefaultToolkit().getImage(iconFilename);

}
