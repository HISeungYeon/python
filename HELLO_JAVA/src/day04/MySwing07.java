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

public class MySwing07 extends JFrame {

	private JPanel contentPane;
	private JTextField tfMine;
	private JTextField tfCom;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing07 frame = new MySwing07();
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
	public MySwing07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMine = new JLabel("나");
		lblMine.setBounds(41, 39, 57, 15);
		contentPane.add(lblMine);
		
		JLabel lblCom = new JLabel("컴");
		lblCom.setBounds(41, 87, 57, 15);
		contentPane.add(lblCom);
		
		JLabel lblResult = new JLabel("결과");
		lblResult.setBounds(41, 141, 57, 15);
		contentPane.add(lblResult);
		
		tfMine = new JTextField();
		tfMine.setBounds(147, 36, 116, 21);
		contentPane.add(tfMine);
		tfMine.setColumns(10);
		
		tfCom = new JTextField();
		tfCom.setColumns(10);
		tfCom.setBounds(147, 84, 116, 21);
		contentPane.add(tfCom);
		
		tfResult = new JTextField();
		tfResult.setColumns(10);
		tfResult.setBounds(147, 138, 116, 21);
		contentPane.add(tfResult);
		
		JButton btn = new JButton("게임 시쟉 ㅇㅁㅇ");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
				
			}
		});
		btn.setBounds(63, 191, 182, 48);
		contentPane.add(btn);
	}
	
	public void myclick() {
		String mine = tfMine.getText();
		String com = "";
		String result = "";
		
		double rnd = Math.random();
		
		if(rnd < 0.3) {
			com = "가위";
		}else if(rnd < 0.6) {
			com = "바위";
		}else {
			com = "보";
		}
		
//		if(com.equals(mine)) {
//			result = "비겼당 ㅎㅅㅎ";
//		}else if ((com.equals("가위") && mine.equals("바위")) ||
//				(com.equals("바위") && mine.equals("보")) || 
//				(com.equals("보") && mine.equals("가위"))) {
//			result = "승리! ㅇㅁㅇ";
//		}else {
//			result = "패배 ㅠㅅㅠ";
//		}
		
//------------------------------------------------------------
		if (com.equals("가위") && mine.equals("가위"))		result = "비김";
		if (com.equals("가위") && mine.equals("바위"))		result = "비김";
		if (com.equals("가위") && mine.equals("보"))		result = "비김";
		
		if (com.equals("바위") && mine.equals("가위"))		result = "비김";
		if (com.equals("바위") && mine.equals("바위"))		result = "비김";
		if (com.equals("바위") && mine.equals("보"))		result = "비김";
		
		if (com.equals("가위") && mine.equals("바위"))		result = "비김";
		if (com.equals("가위") && mine.equals("바위"))		result = "비김";
		if (com.equals("가위") && mine.equals("바위"))		result = "비김";
		
		tfCom.setText(com);
		tfResult.setText(result);
		
	}

}
