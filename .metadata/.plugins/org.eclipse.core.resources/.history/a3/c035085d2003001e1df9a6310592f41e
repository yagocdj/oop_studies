package oop_classes;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

public class Browser {
	public static void main(String[] args) {
		try {
			URI uri = new URL("https://classroom.google.com/w/NTYyOTAyMzUyMDM3/t/all").toURI();
			Desktop.getDesktop().browse(uri);
		}
		catch (Exception e) {
			System.out.println("There was a problem with this URL.");
		}
	}
}
