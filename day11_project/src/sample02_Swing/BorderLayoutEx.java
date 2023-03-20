package sample02_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {

	BorderLayoutEx() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		/// GUI 하는 동안엔 계속 쓰게될거임. 컨텐츠창을 종료시킬때 백그라운드에도 안남고 다 종료시키게 해준다.
	
		Container c = getContentPane();		// contentPane = c ...
									// c.setBackground(Color.PINK);  == getContentPane.setBackground(Color.PINK);
											// 이렇게 줄여쓰려고 변수 선언을 한것임
		c.setBackground(Color.PINK);
		c.setLayout(new BorderLayout(30, 20)); 
		
		c.add(new JButton("add"), BorderLayout.SOUTH);		
		c.add(new JButton("sub"), BorderLayout.WEST);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.NORTH);
		c.add(new JButton("Calculator"), BorderLayout.CENTER);
		
		
		setSize(350,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new BorderLayoutEx();
		
	}

}
