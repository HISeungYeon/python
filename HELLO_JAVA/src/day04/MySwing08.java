package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing08 extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirst;
	private JTextField tfLast;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing08 frame = new MySwing08();
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
	public MySwing08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirst = new JLabel("첫별수 : ");
		lblFirst.setBounds(41, 37, 57, 15);
		contentPane.add(lblFirst);
		
		JLabel lblLast = new JLabel("끝별수 :");
		lblLast.setBounds(41, 84, 57, 15);
		contentPane.add(lblLast);
		
		tfFirst = new JTextField();
		tfFirst.setBounds(157, 34, 116, 21);
		contentPane.add(tfFirst);
		tfFirst.setColumns(10);
		
		tfLast = new JTextField();
		tfLast.setColumns(10);
		tfLast.setBounds(157, 81, 116, 21);
		contentPane.add(tfLast);
		
		JButton btn = new JButton("별 출력!");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				myclick();
			}
		});
		btn.setBounds(67, 112, 173, 39);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(56, 174, 206, 187);
		contentPane.add(ta);
	}
	
	public String drawStar(int cnt) {
		
		String ret = "";
		for(int i=0; i<cnt; i++) {
			ret += "*";
		}
		
		ret += "\n";
		return ret;
	}
	
	public void myclick() {
		
//		int first = Integer.parseInt(tfFirst.getText());
//		int last = Integer.parseInt(tfLast.getText());
//		String txt = "*";
//		
//		for (int i = 0; i < last; i++) {
//			for (int j = 0; j < i; j ++) {
//				System.out.println(txt);
//				
//			}
//			
//		}
		
//--------------------------------------------------
		
		String a = tfFirst.getText();
		String b = tfLast.getText();
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		String txt = "";
		for(int i=aa; i<=bb; i++) {
			txt += drawStar(i);
		}
		
//		txt += drawStar(1);
//		txt += drawStar(2);
		ta.setText(txt);
		
	}

}
