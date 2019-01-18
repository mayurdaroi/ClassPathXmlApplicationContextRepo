package com;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Sample
{
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
       JButton button1 = new JButton("Button 1");
       JButton button2 = new JButton("Button 2");
       frame.getContentPane().add(button1);
       frame.getContentPane().add(button2);
       frame.setVisible(true);
	}
}
