package javaMiniProj;

	import java.awt.*;


	import java.awt.event.*;
	import javax.swing.*;
	import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

	import javaMiniProj.MainInterface.MenuPane;

	public class SearchTrainee
	{
	static JFrame frame;

	public static void main(String[] args)
	{
	SwingUtilities.invokeLater(new Runnable()
	{
	public void run()
	{
	JFrame.setDefaultLookAndFeelDecorated(true);
	displayJFrame();
	frame.setBounds(500, 200, 300, 300);
	frame.add(null, new SearchTrainee());
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}
	});
	}

	static void displayJFrame()
	{
	frame = new JFrame("Search Employee");


	JButton showDialogButton = new JButton("Submit");
	JButton button = new JButton("Exit");
	JLabel label1 = new JLabel("Employee Name: ");
	JTextArea area = new JTextArea();
	area.setSize(100,100);
	area.setEditable(true);
	area.setWrapStyleWord(true);
	area.addMouseListener(null);
	area.setPreferredSize(new Dimension(150,30));
	showDialogButton.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{
	JDialog d = new JDialog(frame, "Message", true);
	d.setSize(300, 250);
	d.setLocationRelativeTo(frame);
	d.setVisible(true);
	}

	});
	frame.getContentPane().setLayout(new FlowLayout());
	frame.add(label1);
	frame.add(area);
	frame.add(showDialogButton);
	frame.add(button);
	// frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setPreferredSize(new Dimension(300, 200));
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}

	protected static void add(JDialog jDialog) {

	}
	}

