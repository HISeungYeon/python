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

public class MySwing06 extends JFrame {

	private JPanel contentPane;
	private JTextField tfDan;
	private JTextArea ta;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing06 frame = new MySwing06();
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
	public MySwing06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("출력단수 : ");
		lbl.setBounds(48, 13, 72, 15);
		contentPane.add(lbl);
		
		tfDan = new JTextField();
		tfDan.setBounds(145, 10, 103, 21);
		contentPane.add(tfDan);
		tfDan.setColumns(10);
		
		JButton btn = new JButton("구구단나와랏");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
				
			}
		});
		btn.setBounds(61, 41, 155, 38);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(30, 89, 227, 193);
		contentPane.add(ta);
	}
	
	public void myclick() {
//		int dan = Integer.parseInt(tfDan.getText());
//		int result = 0;
//		String hi = "";
//		
//		for (int i = 1; i < 10; i++) {
//			result = dan * i;
//			hi += dan + " x " + i + " = " + result + "\n";
//		}
//		ta.setText(hi+"");
		
//--------------------------------------------------

//		ta.setText("2*1=2\n2*2=4\n");
		String dan = tfDan.getText();
		int idan = Integer.parseInt(dan);
		String txt = "";
		txt += idan + " x " + 1 + " = " + (idan*1) + "\n";
		txt += idan + " x " + 2 + " = " + (idan*2) + "\n";
		txt += idan + " x " + 3 + " = " + (idan*3) + "\n";
		txt += idan + " x " + 4 + " = " + (idan*4) + "\n";
		txt += idan + " x " + 5 + " = " + (idan*5) + "\n";
		txt += idan + " x " + 6 + " = " + (idan*6) + "\n";
		txt += idan + " x " + 7 + " = " + (idan*7) + "\n";
		txt += idan + " x " + 8 + " = " + (idan*8) + "\n";
		txt += idan + " x " + 9 + " = " + (idan*9) + "\n";
		
		ta.setText(txt);
	}

}
