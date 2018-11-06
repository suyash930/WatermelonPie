package main;

import java.awt.EventQueue;

import testconnection.TestConnection;
import utilities.Constants;

import welcomepage.WelcomePageView;

public class Driver {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Open the welcome page
					WelcomePageView frame = new WelcomePageView();
					frame.setTitle(Constants.TITLE);
					frame.setVisible(true);
					
					// Test Conection
					
					new TestConnection().connect();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
