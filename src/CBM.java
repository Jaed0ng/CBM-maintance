import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class CBM {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CBM window = new CBM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CBM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 909, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 10, 845, 157);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(-16, 10, 3, 2);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("\u8BFB\u53D6\u6570\u636E\u60C5\u51B5");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 10, 94, 30);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(145, 24, 226, 109);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u6B63\u5E38\u8BAD\u7EC3\u96C6");
		lblNewLabel_1.setBounds(83, 10, 81, 15);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5E73\u5747\u503C");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(22, 39, 63, 22);
		panel_2.add(lblNewLabel_2);
		
		JLabel label_3 = new JLabel("\u6807\u51C6\u5DEE");
		label_3.setFont(new Font("宋体", Font.PLAIN, 14));
		label_3.setBounds(22, 71, 63, 22);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_4.setFont(new Font("宋体", Font.PLAIN, 14));
		label_4.setBounds(122, 35, 63, 22);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_5.setFont(new Font("宋体", Font.PLAIN, 14));
		label_5.setBounds(122, 71, 63, 22);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(444, 24, 226, 109);
		panel.add(panel_3);
		
		JLabel label_6 = new JLabel("\u975E\u6B63\u5E38\u8BAD\u7EC3\u96C6");
		label_6.setBounds(83, 10, 81, 15);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("\u5E73\u5747\u503C");
		label_7.setFont(new Font("宋体", Font.PLAIN, 14));
		label_7.setBounds(22, 39, 63, 22);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("\u6807\u51C6\u5DEE");
		label_8.setFont(new Font("宋体", Font.PLAIN, 14));
		label_8.setBounds(22, 71, 63, 22);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_9.setFont(new Font("宋体", Font.PLAIN, 14));
		label_9.setBounds(122, 35, 63, 22);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_10.setFont(new Font("宋体", Font.PLAIN, 14));
		label_10.setBounds(122, 71, 63, 22);
		panel_3.add(label_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 216, 845, 157);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(-16, 10, 3, 2);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("\u635F\u5931");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(22, 10, 41, 30);
		panel_1.add(label_2);
		
		JButton btnNewButton = new JButton("\u4F7F\u7528\u9ED8\u8BA4\u53C2\u6570");
		btnNewButton.setBounds(30, 87, 115, 30);
		panel_1.add(btnNewButton);
		
		
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(215, 33, 384, 90);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "        \u6B63\u5E38 ", "        \u975E\u6B63\u5E38"},
				      {"        \u7EE7\u7EED", null, null},
				      {"        \u505C\u6B62", null, null},
			},
			new String[] {
				"", "", ""
			}
		));
		table.getColumnModel().getColumn(1).setMinWidth(37);
		table.setRowHeight(30);
		panel_1.add(table);
	}
}
