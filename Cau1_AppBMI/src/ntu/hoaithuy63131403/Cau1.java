package ntu.hoaithuy63131403;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Cau1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField edtHeigh;
	private JTextField edtWeigh;
	private JTextField edtKq;
	private Button btnXoa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cau1 frame = new Cau1();
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
	public Cau1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 617);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 232, 255));
		contentPane.setForeground(new Color(208, 232, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập chiều cao");
		lblNewLabel.setBounds(88, 57, 107, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập cân nặng");
		lblNewLabel_1.setBounds(88, 111, 107, 22);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		edtHeigh = new JTextField();
		edtHeigh.setBounds(221, 56, 127, 29);
		contentPane.add(edtHeigh);
		edtHeigh.setColumns(10);
		
		edtWeigh = new JTextField();
		edtWeigh.setBounds(221, 110, 127, 29);
		contentPane.add(edtWeigh);
		edtWeigh.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BMI của bạn: ");
		lblNewLabel_2.setBounds(126, 293, 98, 29);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);
		
		edtKq = new JTextField();
		edtKq.setBounds(234, 295, 127, 29);
		contentPane.add(edtKq);
		edtKq.setColumns(10);
		
		Button btnKq = new Button("Kết quả");
		btnKq.setBounds(135, 212, 118, 42);
		btnKq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strHeigh = edtHeigh.getText().toString();
				String strWeigh = edtWeigh.getText().toString();
				

		        //chuyển DL
		        int chieucao = Integer.parseInt(strHeigh);
		        int cannang = Integer.parseInt(strWeigh);

		       
			}
		});
		btnKq.setForeground(new Color(0, 0, 0));
		btnKq.setBackground(new Color(79, 100, 251));
		contentPane.add(btnKq);
		
		btnXoa = new Button("Xóa");
		btnXoa.setBounds(322, 212, 107, 42);
		btnXoa.setForeground(new Color(0, 0, 0));
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setBackground(new Color(79, 100, 251));
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnXoa);
	}
}
