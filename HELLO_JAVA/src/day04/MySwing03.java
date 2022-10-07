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

public class MySwing03 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	private JTextField tf02;
	private JTextField tf03;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing03 frame = new MySwing03();
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
	public MySwing03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("+");
		lbl.setBounds(112, 58, 30, 15);
		contentPane.add(lbl);
		
		tf01 = new JTextField();
		tf01.setBounds(12, 55, 69, 21);
		contentPane.add(tf01);
		tf01.setColumns(10);
		
		tf02 = new JTextField();
		tf02.setColumns(10);
		tf02.setBounds(154, 55, 69, 21);
		contentPane.add(tf02);
		
		tf03 = new JTextField();
		tf03.setColumns(10);
		tf03.setBounds(342, 55, 69, 21);
		contentPane.add(tf03);
		
		btn = new JButton("=");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				int num1 = Integer.parseInt(tf01.getText());
//				int num2 = Integer.parseInt(tf02.getText());
//				int result = num1 + num2;
//				tf03.setText(String.valueOf(result));
				myclick();
				
			}
		});
		btn.setBounds(245, 54, 69, 23);
		contentPane.add(btn);
	}
	
	public void myclick() {
		String a = tf01.getText();
		String b = tf02.getText();
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int sum = aa + bb;
		
		tf03.setText(sum + "");
				
	}
}
