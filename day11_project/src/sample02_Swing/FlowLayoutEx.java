package sample02_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {

	FlowLayoutEx() {
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		/// GUI 하는 동안엔 계속 쓰게될거임. 컨텐츠창을 종료시킬때 백그라운드에도 안남고 다 종료시키게 해준다.
	
		Container c = getContentPane();		// contentPane = c ...
		
		c.setBackground(Color.PINK);
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); 
		
		c.add(new JButton("add"));		
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculator"));
		
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new FlowLayoutEx();
		
	}

}
