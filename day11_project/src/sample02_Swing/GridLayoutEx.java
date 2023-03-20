package sample02_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	GridLayoutEx() {
		setTitle("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		/// GUI 하는 동안엔 계속 쓰게될거임. 컨텐츠창을 종료시킬때 백그라운드에도 안남고 다 종료시키게 해준다.
	
		Container c = getContentPane();		
		c.setBackground(Color.PINK);
		
		GridLayout grid = new GridLayout(2, 2);			
		c.setLayout(grid); 				//  c.setLayout(grid);  ==  c.setLayout(new GridLayout(2, 2));		
											// 이렇게 줄여 쓸수있음
		
		c.add(new JLabel("이름"));		
		c.add(new JTextField(""));		
		c.add(new JLabel("학번"));		
		c.add(new JTextField(""));		

		setSize(350,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new GridLayoutEx();
		
	}

}
