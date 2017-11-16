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
import javax.swing.JTextPane;

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
		frame.setBounds(100, 100, 888, 870);
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
		
		JLabel lblNewLabel = new JLabel("\u8BAD\u7EC3\u6570\u636E\u60C5\u51B5");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(21, 10, 94, 30);
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
		
		JButton button = new JButton("\u8BFB\u53D6\u8BAD\u7EC3\u6570\u636E");
		button.setBounds(694, 24, 141, 30);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 194, 845, 157);
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
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 373, 845, 196);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JLabel label_11 = new JLabel("New label");
		label_11.setBounds(-16, 10, 3, 2);
		panel_4.add(label_11);
		
		JLabel label_12 = new JLabel("\u8BFB\u53D6\u9891\u7387\u60C5\u51B5");
		label_12.setFont(new Font("宋体", Font.PLAIN, 14));
		label_12.setBounds(22, 10, 89, 30);
		panel_4.add(label_12);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(254, 41, 141, 103);
		panel_4.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(445, 41, 141, 103);
		panel_4.add(scrollPane_1);
		
		JLabel label_13 = new JLabel("\u6B63\u5E38\u9891\u7387");
		label_13.setFont(new Font("宋体", Font.PLAIN, 14));
		label_13.setBounds(297, 10, 56, 30);
		panel_4.add(label_13);
		
		JLabel label_14 = new JLabel("\u975E\u6B63\u5E38\u9891\u7387");
		label_14.setFont(new Font("宋体", Font.PLAIN, 14));
		label_14.setBounds(481, 10, 70, 30);
		panel_4.add(label_14);
		
		JLabel label_15 = new JLabel("\u5148\u9A8C\u6982\u7387");
		label_15.setFont(new Font("宋体", Font.PLAIN, 14));
		label_15.setBounds(254, 152, 63, 22);
		panel_4.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setFont(new Font("宋体", Font.PLAIN, 14));
		label_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_16.setBounds(332, 152, 63, 22);
		panel_4.add(label_16);
		
		JLabel label_17 = new JLabel("\u5148\u9A8C\u6982\u7387");
		label_17.setFont(new Font("宋体", Font.PLAIN, 14));
		label_17.setBounds(445, 154, 63, 22);
		panel_4.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setFont(new Font("宋体", Font.PLAIN, 14));
		label_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_18.setBounds(523, 154, 63, 22);
		panel_4.add(label_18);
		
		JButton button_1 = new JButton("\u663E\u793A\u56FE\u50CF\u4E0E\u7ED3\u679C");
		button_1.setBounds(651, 148, 135, 30);
		panel_4.add(button_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_5.setBounds(10, 612, 845, 157);
		frame.getContentPane().add(panel_5);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setBounds(-16, 10, 3, 2);
		panel_5.add(label_19);
		
		JLabel label_20 = new JLabel("\u6A21\u7CCA\u8D1D\u53F6\u65AF");
		label_20.setFont(new Font("宋体", Font.PLAIN, 14));
		label_20.setBounds(22, 10, 70, 30);
		panel_5.add(label_20);
		
		JLabel lblLambda = new JLabel("lambda=");
		lblLambda.setFont(new Font("宋体", Font.PLAIN, 14));
		lblLambda.setBounds(21, 69, 57, 30);
		panel_5.add(lblLambda);
		
		JLabel label_21 = new JLabel("");
		label_21.setFont(new Font("宋体", Font.PLAIN, 14));
		label_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		label_21.setBounds(85, 77, 63, 22);
		panel_5.add(label_21);
	}
}
