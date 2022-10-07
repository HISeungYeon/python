package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing02 extends JFrame {

	private JPanel contentPane;
	JLabel lbl;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing02 frame = new MySwing02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MySwing02() { //생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("100"); //지역변수..!! ㅇㅁㅇ 전역변수로 올려주쟈
		lbl.setBounds(87, 68, 57, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton("decrease");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				int count = Integer.parseInt(lbl.getText());
//				count -= 1;
//				lbl.setText(String.valueOf(count));	
				myclick();
			}
		});
		btn.setBounds(211, 64, 97, 23);
		contentPane.add(btn);
	}
	
	public void myclick() {
//		System.out.println("myclick");
		String a = lbl.getText();
		int aa = Integer.parseInt(a);
//		System.out.println(aa); //하나찍고 실행해보그,,, ㅇㅁㅇ
		aa--;
		lbl.setText("" + aa); //or Integer.toStirng(aa);
	}

}
