package sample02_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		/// GUI 하는 동안엔 계속 쓰게될거임. 컨텐츠창을 종료시킬때 백그라운드에도 안남고 다 종료시키게 해준다.
	
		Container c = getContentPane();		// contentPane = c ...
		
		c.setBackground(Color.PINK);
		c.setLayout(new FlowLayout());		// 배치를 어떻게 할것인가. 배치관리자. 
											// 얘가 없으면 배치를 못함
		
		c.add(new JButton("OK"));		// JButton btn = new JButton("OK")
										// c.add(btn)			 를 줄여서 쓴것이다.
													
		c.add(new JButton("Cancel"));
		c.add(new JButton("ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new ContentPaneEx();
		
	}

}
