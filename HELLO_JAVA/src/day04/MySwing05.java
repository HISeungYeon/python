package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing05 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_mine;
	private JTextField tf_com;
	private JTextField tf_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing05 frame = new MySwing05();
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
	public MySwing05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_main = new JLabel("나");
		lbl_main.setBounds(36, 44, 57, 15);
		contentPane.add(lbl_main);
		
		JLabel lbl_com = new JLabel("컴");
		lbl_com.setBounds(36, 112, 57, 15);
		contentPane.add(lbl_com);
		
		JLabel lbl_result = new JLabel("결과");
		lbl_result.setBounds(36, 187, 57, 15);
		contentPane.add(lbl_result);
		
		tf_mine = new JTextField();
		tf_mine.setBounds(105, 41, 116, 21);
		contentPane.add(tf_mine);
		tf_mine.setColumns(10);
		
		tf_com = new JTextField();
		tf_com.setColumns(10);
		tf_com.setBounds(105, 109, 116, 21);
		contentPane.add(tf_com);
		
		tf_result = new JTextField();
		tf_result.setColumns(10);
		tf_result.setBounds(105, 184, 116, 21);
		contentPane.add(tf_result);
		
		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
				
			}
		});
		btn.setBounds(281, 100, 108, 39);
		contentPane.add(btn);
	}
	
	public void myclick() {
		
//		String tf_m = tf_mine.getText();
//		System.out.println(tf_m);
//		
//		double com = Math.random();
//		System.out.println(com);
//		
//		String ccom = "";
//		if(com > 0.5) {
//			ccom = "홀";
//			tf_com.setText(ccom);
//		}else {
//			ccom = "짝";
//			tf_com.setText(ccom);
//		}
//		
//		System.out.println(ccom);
//		
//		if (ccom == tf_m) {
//			tf_result.setText("승리");
//		}else {
//			tf_result.setText("패배");
//		}
		
//----------------------------------------------
		String mine = tf_mine.getText();
		String com = "";
		String result = "";
		
		double rnd = Math.random();
		if(rnd>0.5) {
			com = "홀";
		}else {
			com = "짝";
		}
		
		if(com.equals(mine)) {
			result = "승리";
		}else {
			result = "패배";
		}
		
		tf_com.setText(com);
		tf_result.setText(result);
		
	}
}
