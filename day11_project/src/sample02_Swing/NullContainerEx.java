package sample02_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {

	NullContainerEx() {
		setTitle("NullContainer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();		
		
		c.setLayout(null); 
		
		JLabel la = new JLabel("Hello , Press Button");
		la.setLocation(130, 50);		// 필수로 정의해줘야함
		la.setSize(200, 30);		// 필수로 정의해줘야함 (값이 안나옴)
		la.setOpaque(true);		// (컴포넌트에 색입히고싶을때)  얘가 있어야 밑에있는 친구를 실행할수있다.
		la.setFont(new Font("serif" , Font.ITALIC, 30));		// 폰트객체로 폰트를 바꿀수도있다.
		la.setBackground(Color.yellow);
		
		c.add(la);
		
		for(int i = 1; i<= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b);
			
		}
		
		c.setBackground(Color.CYAN);
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new NullContainerEx();
		
	}

}
