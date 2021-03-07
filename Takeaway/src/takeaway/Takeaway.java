package takeaway;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class Takeaway {

	private JFrame frame;
	private JTextField jtxtChicBurger;
	private JTextField jtxtChicBurgerMeal;
	private JTextField jtxtCBurger;
	private JTextField txtDisplay;
	private JTextField jtxtQty;
	private JTextField jtxtConversion;
	
	double USD = 1.39;
	double CAD = 1.77;
	double EUR = 1.15;
	double TRY = 10.33;

	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Takeaway window = new Takeaway();
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
	public Takeaway() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(21, 76, 579, 309);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(24, 25, 178, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(24, 79, 231, 31);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(24, 131, 178, 31);
		panel.add(lblNewLabel_1_2);
		
		jtxtChicBurger = new JTextField();
		jtxtChicBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChicBurger.setBounds(326, 25, 188, 31);
		panel.add(jtxtChicBurger);
		jtxtChicBurger.setColumns(10);
		
		jtxtChicBurgerMeal = new JTextField();
		jtxtChicBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtChicBurgerMeal.setColumns(10);
		jtxtChicBurgerMeal.setBounds(326, 79, 188, 31);
		panel.add(jtxtChicBurgerMeal);
		
		jtxtCBurger = new JTextField();
		jtxtCBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtCBurger.setColumns(10);
		jtxtCBurger.setBounds(326, 131, 188, 31);
		panel.add(jtxtCBurger);
		
		JLabel lblNewLabel_3 = new JLabel("Drinks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(24, 183, 149, 31);
		panel.add(lblNewLabel_3);
		
		JComboBox <String> jcmbDrink = new JComboBox<>();
		jcmbDrink.setModel(new DefaultComboBoxModel<>(new String[] {"Select a drink", "Apple Juice", "Coke", "Pepsi", "Fanta", "Tea", "Coffee", "Ice Coffee", "Orange"}));
		jcmbDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jcmbDrink.setBounds(24, 224, 178, 27);
		panel.add(jcmbDrink);
		
		JLabel lblNewLabel_4 = new JLabel("Qty");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(326, 183, 51, 31);
		panel.add(lblNewLabel_4);
		
		jtxtQty = new JTextField();
		jtxtQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtQty.setBounds(326, 222, 188, 31);
		panel.add(jtxtQty);
		jtxtQty.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 177, 532, 6);
		panel.add(separator);
		
		JRadioButton jCDelivery = new JRadioButton("Home Delivery");
		jCDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCDelivery.setBounds(24, 257, 205, 34);
		panel.add(jCDelivery);
		
		JRadioButton jCTax = new JRadioButton("Tax");
		jCTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCTax.setBounds(324, 259, 205, 34);
		panel.add(jCTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(637, 74, 473, 311);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox<String> jcmbCurrency = new JComboBox<>();
		jcmbCurrency.setModel(new DefaultComboBoxModel<>(new String[] {"Choose one...", "USA", "Canada", "France", "Germany", "Turkey", "Spain", "Italy"}));
		jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jcmbCurrency.setBounds(84, 141, 286, 31);
		panel_1.add(jcmbCurrency);
		
		jtxtConversion = new JTextField();
		jtxtConversion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtConversion.setColumns(10);
		jtxtConversion.setBounds(84, 62, 286, 56);
		panel_1.add(jtxtConversion);
		
		JLabel jlblConversion = new JLabel("");
		jlblConversion.setHorizontalAlignment(SwingConstants.CENTER);
		jlblConversion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblConversion.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblConversion.setBounds(107, 194, 243, 31);
		panel_1.add(jlblConversion);
		
		JButton jBtnConvert = new JButton("Convert");
		jBtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double British_Pound = Double.parseDouble(jtxtConversion.getText());
				
				if (jcmbCurrency.getSelectedItem().equals("USA"))
				{
					String cConvert1 = String.format("$ %.2f", British_Pound * USD);
					jlblConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Canada"))
				{
					String cConvert1 = String.format("$ %.2f", British_Pound * CAD);
					jlblConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("France"))
				{
					String cConvert1 = String.format("€ %.2f", British_Pound * EUR);
					jlblConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Germany"))
				{
					String cConvert1 = String.format("€ %.2f", British_Pound * EUR);
					jlblConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Turkey"))
				{
					String cConvert1 = String.format("Lira %.2f", British_Pound * TRY);
					jlblConversion.setText(cConvert1);
					
				}
				if (jcmbCurrency.getSelectedItem().equals("Spain"))
				{
					String cConvert1 = String.format("€ %.2f", British_Pound * EUR);
					jlblConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Italy"))
				{
					String cConvert1 = String.format("€ %.2f", British_Pound * EUR);
					jlblConversion.setText(cConvert1);
				}
				
				
				
			}
		});
		jBtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnConvert.setBounds(84, 243, 125, 43);
		panel_1.add(jBtnConvert);
		
		JButton jBtnClear = new JButton("Clear");
		jBtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblConversion.setText(null);
				jtxtConversion.setText(null);
				jcmbCurrency.setSelectedItem("Choose one...");
			}
		});
		jBtnClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnClear.setBounds(245, 243, 125, 43);
		panel_1.add(jBtnClear);
		
		JLabel lblNewLabel_2 = new JLabel("\u00A3 Converter");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(157, 21, 132, 31);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(21, 395, 579, 217);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cost of Drinks");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(24, 26, 178, 31);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(24, 80, 231, 31);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2_1.setBounds(24, 132, 178, 31);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel jlblCostOfDrinks = new JLabel("");
		jlblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrinks.setBounds(336, 26, 178, 31);
		jlblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(jlblCostOfDrinks);
		
		JLabel jlblCostOfMeal = new JLabel("0");
		jlblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal.setBounds(336, 80, 178, 31);
		panel_2.add(jlblCostOfMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(336, 132, 178, 31);
		panel_2.add(jlblCostOfDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(637, 395, 473, 217);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tax");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_3_1.setBounds(20, 36, 178, 31);
		panel_3.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1_1.setBounds(20, 77, 231, 31);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Total");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_2_1_1.setBounds(20, 160, 178, 31);
		panel_3.add(lblNewLabel_1_2_1_1);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(238, 36, 178, 31);
		panel_3.add(jlblTax);
		
		JLabel jlblSubTotal = new JLabel("");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTotal.setBounds(238, 77, 178, 31);
		panel_3.add(jlblSubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(238, 160, 178, 31);
		panel_3.add(jlblTotal);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Discount");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_3_1_1.setBounds(20, 118, 178, 31);
		panel_3.add(lblNewLabel_1_3_1_1);
		
		JLabel jlblDiscount = new JLabel("");
		jlblDiscount.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblDiscount.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblDiscount.setBounds(238, 119, 178, 31);
		panel_3.add(jlblDiscount);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(1147, 74, 358, 538);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 29, 338, 484);
		panel_4.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_5, null);
		panel_5.setLayout(null);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(10, 10, 313, 437);
		panel_5.add(jtxtReceipt);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_6, null);
		panel_6.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(29, 41, 275, 38);
		panel_6.add(txtDisplay);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(98, 89, 68, 50);
		panel_6.add(btnClear);
		
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPerc.setBounds(168, 89, 68, 50);
		panel_6.add(btnPerc);
		
		JButton btnPlus_1 = new JButton("+");
		btnPlus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus_1.setBounds(236, 89, 68, 50);
		panel_6.add(btnPlus_1);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(29, 142, 68, 50);
		panel_6.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(98, 142, 68, 50);
		panel_6.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(168, 142, 68, 50);
		panel_6.add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(236, 142, 68, 50);
		panel_6.add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(29, 198, 68, 50);
		panel_6.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(98, 198, 68, 50);
		panel_6.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(168, 198, 68, 50);
		panel_6.add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(236, 198, 68, 50);
		panel_6.add(btnMult);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(29, 254, 68, 50);
		panel_6.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(98, 254, 68, 50);
		panel_6.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(168, 254, 68, 50);
		panel_6.add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(236, 254, 68, 50);
		panel_6.add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(29, 310, 68, 50);
		panel_6.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! txtDisplay.getText().contains("."))
				{
					txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(98, 310, 68, 50);
		panel_6.add(btnDot);
		
		JButton btnPM = new JButton("+-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops* (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(168, 310, 68, 50);
		panel_6.add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(236, 310, 68, 50);
		panel_6.add(btnEqual);
		
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(29, 89, 68, 50);
		panel_6.add(btnBackSpace);
		
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2_1.setBounds(21, 626, 1484, 128);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		jBtnExit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnExit.setBounds(822, 37, 125, 43);
		panel_2_1.add(jBtnExit);
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblCostOfDelivery.setText(null);
				jlblSubTotal.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jlblConversion.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblCostOfDrinks.setText(null);
				jlblCostOfMeal.setText(null);
				jlblSubTotal.setText(null);
				jlblTax.setText(null);
				jlblTotal.setText(null);
				jtxtChicBurger.setText(null);
				jtxtChicBurgerMeal.setText(null);
				jtxtCBurger.setText(null);
				jtxtQty.setText(null);
				jtxtConversion.setText(null);
				jcmbDrink.setSelectedItem("Select a drink");
				jcmbCurrency.setSelectedItem("Choose one...");
				jtxtReceipt.setText(null);
				
			
			}
		});
		jBtnReset.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnReset.setBounds(639, 37, 125, 43);
		panel_2_1.add(jBtnReset);
		
		JButton jBtnReceipt = new JButton("Receipt");
		jBtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1 = Double.parseDouble(jtxtChicBurger.getText());
				double Qty2 = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double Qty3 = Double.parseDouble(jtxtCBurger.getText());
				double SubTotal = Double.parseDouble(jlblSubTotal.getText());
				double Tax = Double.parseDouble(jlblTax.getText());
				double Total = Double.parseDouble(jlblTotal.getText());
				double Discount = Double.parseDouble(jlblDiscount.getText());
				
				jtxtReceipt.append("\t\nTakeaway Management Sytem:\n\n" + "Chicken Burger:\t\t"
					+Qty1 + "\nChicken Burger Meal:\t\t" +
					Qty2 + "\nBacon and Cheese Burger:\t\t" + 
					 Qty3 + "\nTax:\t\t\t"+
					 Tax + "\nSubtotal of Meal\t\t\t" + 
					 SubTotal +"\nDiscount for Meal\t\t:"+ 
					 Discount + "\nTotal of Meal:\t\t\t" + 
					 Total + "\n\nThanks you ordering");
			}
		});
		jBtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnReceipt.setBounds(459, 37, 125, 43);
		panel_2_1.add(jBtnReceipt);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
				double iChicBurger = 2.39;
				double Burger;
				
				Burger = (ChicBurger * iChicBurger );
				String pMeal = String.format("%.2f", Burger);
				jlblCostOfMeal.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(jtxtChicBurger.getText());
				double iChicBurgerMeal = 4.39;
				double BurgerMeal;
				
				BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal );
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				jlblCostOfMeal.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(jtxtCBurger.getText());
				double CheeseBurgerPrice = 3.39;
				double CheeseBurgerMeal;
				
				CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice );
				String cheese = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger);
				jlblCostOfMeal.setText(cheese);
				//----------------------------------Home Delivery---------------------------------
				double iDelivery = 3.39;
				if (jCDelivery.isSelected())
				{
					String pDelivery = String.format("%.2f", iDelivery);
					 jlblCostOfDelivery.setText(pDelivery);
				}
				
				else
				{
					jlblCostOfDelivery.setText("0");
				}
				
				//------------------------------------Drinks---------------------------------------------------------------
				
				double Drinks = Double.parseDouble(jtxtQty.getText());
				double Apple_Juice = 1.99 * Drinks;
				double Coke = 1.60 * Drinks;
				double Pepsi = 1.60 * Drinks;
				double Fanta = 1.60 * Drinks;
				double Tea = 1.00 * Drinks;
				double Coffee = 2.00 * Drinks;
				double Ice_Coffee = 2.50 * Drinks;
				double Orange = 1.00 * Drinks;
				
				
				if (jcmbDrink.getSelectedItem().equals("Apple Juice"))
				{
					String cApple_Juice = String.format("%.2f", Apple_Juice);
					jlblCostOfDrinks.setText(cApple_Juice);
				}
				if (jcmbDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f", Coke);
					jlblCostOfDrinks.setText(cCoke);
				}
				if (jcmbDrink.getSelectedItem().equals("Pepsi"))
				{
					String cPepsi = String.format("%.2f", Pepsi);
					jlblCostOfDrinks.setText(cPepsi);
				}
				if (jcmbDrink.getSelectedItem().equals("Fanta"))
				{
					String cFanta = String.format("%.2f", Fanta);
					jlblCostOfDrinks.setText(cFanta);
				}
				if (jcmbDrink.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f", Tea);
					jlblCostOfDrinks.setText(cTea);
				}
				if (jcmbDrink.getSelectedItem().equals("Coffee"))
				{
					String cCoffee = String.format("%.2f", Coffee);
					jlblCostOfDrinks.setText(cCoffee);
				}
				if (jcmbDrink.getSelectedItem().equals("Ice Coffee"))
				{
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					jlblCostOfDrinks.setText(cIce_Coffee);
				}
				if (jcmbDrink.getSelectedItem().equals("Orange"))
				{
					String cOrange = String.format("%.2f", Orange);
					jlblCostOfDrinks.setText(cOrange);
				}
				if (jcmbDrink.getSelectedItem().equals("Select a Drink"))
				{
					jlblCostOfDrinks.setText("0");
				}
				
				//----------------------------------------Discount-------------------------------------------
				
				double cost = Double.parseDouble(jlblCostOfMeal.getText());
				double discount = cost * 5 /100;
				
				if (cost > 20)
				{
					String total = String.format("%.2f", discount);
					jlblDiscount.setText(total);
				}
				else
				{
					jlblDiscount.setText("0");
				}
				
				//----------------------------------------Tax Rate--------------------------------------------
				
				double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
				double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
				double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3) / 100;
				
				if (jCTax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					jlblTax.setText(iTotal);
				}
				else
				{
					jlblTax.setText("0");
				}
				
				//----------------------------------------Total--------------------------------------------
				
				double cTotalDiscount = Double.parseDouble(jlblDiscount.getText());
				double cTotal4 = Double.parseDouble(jlblTax.getText());
				
				double subTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String isubTotal = String.format(" %.2f", subTotal);
				jlblSubTotal.setText(isubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				double discountTotal = allTotal - cTotalDiscount;
				String iTotal = String.format(" %.2f", discountTotal);
				jlblTotal.setText(iTotal);
				
				String iTaxTotal = String.format(" %.2f", cTotal4);
				jlblTax.setText(iTaxTotal);
				
			}
		});
		jBtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnTotal.setBounds(289, 37, 125, 43);
		panel_2_1.add(jBtnTotal);
		
		JLabel lblNewLabel = new JLabel("Takeaway Management System\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(392, 0, 808, 61);
		frame.getContentPane().add(lblNewLabel);
	}
}
