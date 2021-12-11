package brickbreaker;

import javax.swing.*;

public class Main {
	public static void main(String args[]){
		JFrame obj= new JFrame();
		obj.setBounds(10,10,700,600);
		Gameplay gameplay=new Gameplay();
		obj.setTitle("Brick breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	}

}
