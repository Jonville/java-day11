package sample02_Swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {			// 객체가 생성될때 3개의 메소드를 바로 실행해준다.
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);		// ( 가로 , 세로 ) 
		setVisible(true);		// 화면에 보여주겠냐 말겠냐라는 의미	// 얘 없으면 화면에 안나타남	// 백그라운드에 계속 남아있어서 출력해주는게 좋다 지금은 ;
		
	}
	
	public static void main(String[] args) {

		MyFrame frame = new MyFrame();
		
	}

}
