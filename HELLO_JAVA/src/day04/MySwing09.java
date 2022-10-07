package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MySwing09 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnCall;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing09 frame = new MySwing09();
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
	public MySwing09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(56, 10, 242, 44);
		contentPane.add(tf);
		tf.setColumns(10);
		
		btn1 = new JButton("1");
//		btn1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
////				JButton b = (JButton) e.getSource();
////				System.out.print(b.getText()); //??? 예?
//				myclick(e);
//			}
//		});
		btn1.setBounds(45, 72, 74, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(131, 72, 74, 23);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(224, 72, 74, 23);
		contentPane.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(45, 105, 74, 23);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(131, 105, 74, 23);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(224, 105, 74, 23);
		contentPane.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(45, 140, 74, 23);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(131, 140, 74, 23);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(224, 140, 74, 23);
		contentPane.add(btn9);
		
		btn0 = new JButton("0");
		btn0.setBounds(45, 177, 74, 23);
		contentPane.add(btn0);
		
		btnCall = new JButton("call");
		btnCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mycall();
			}
		});
		btnCall.setBounds(131, 177, 168, 23);
		contentPane.add(btnCall);
		
		btn1.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn2.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn3.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn4.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn5.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		
		btn6.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn7.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn8.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn9.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
		btn0.addMouseListener(new MouseAdapter() { public void mouseClicked(MouseEvent e) {myclick(e);}});
	}
	
	public void myclick(MouseEvent e) {
//		System.out.print(e);
		JButton b = (JButton) e.getSource();
		String str_new = b.getText();
		String str_old = tf.getText();
		tf.setText(str_old + str_new);
	}

	public void mycall() {
		String str_tel = tf.getText();
		JOptionPane.showMessageDialog(this, "calling\n" + str_tel); //this든 null이든,,
	}
	
	//자바 Swing 알럿창 ㅇㅁㅇ 검색 => calling '전화번호'
}
