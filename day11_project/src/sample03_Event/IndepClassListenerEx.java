package sample03_Event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListenerEx extends JFrame {

	public IndepClassListenerEx() {

		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {		// addActionListener 같은 이벤트가 굉장히많다 ex ) addMouse.....
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action")) {
					b.setText("액션");
				} else {
					b.setText("Action");
				}
				setTitle(b.getText());
			}
		});

		setSize(350, 150);
		setVisible(true);

		JButton btn2 = new JButton("Action2");

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action2")) {
					b.setText("액션2");
					c.setBackground(Color.BLUE);

				} else {
					b.setText("Action2");
					c.setBackground(Color.RED);

				}

			}
		});

		c.add(btn);
		c.add(btn2);

	}

	public static void main(String[] args) {

		new IndepClassListenerEx();

	}

}
