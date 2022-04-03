package org.sys;

public class Desktop extends Computer {
	
	public void desktopSize () {
		System.out.println ("My desktop size is 1920*1080");
	}

	public static void main(String[] args) {
		Desktop myDesktop = new Desktop ();
		myDesktop.desktopSize();
		myDesktop.computerModel();

	}

}
