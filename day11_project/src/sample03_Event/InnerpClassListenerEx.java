package sample03_Event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerpClassListenerEx extends JFrame{

	public InnerpClassListenerEx() {

		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());		// addActionListener() 메소드로 btn에 이벤트 부착시킴
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
		
	}
	
private class MyActionListener implements ActionListener{		// MyActionListener 는 ActionListener 인터페이스로 상속받는다
	public void actionPerformed(ActionEvent e) {		// actionPerformed() 추상 메소드라서 Override 시켜줘야함
														// ActionEvent e == 이벤트 객체
		JButton b = (JButton)e.getSource();		// 객체레퍼런스 공유 관계기때문에 btn 과 n 의 주소값은 같다 // getSource() 로 객체를 가져온다
		if(b.getText().equals("Action")) {
			b.setText("액션");
		} else {
			b.setText("Action");
		}
		InnerpClassListenerEx.this.setTitle(b.getText());
	}
}
	
	
	public static void main(String[] args) {

		new InnerpClassListenerEx();
		
		
	}

}
