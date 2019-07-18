/**
 * @startDate: 07/16/2019
 * @moduleName: Reference Search and Add Reference Module
 * @moduleDescription: Defines an array that contains
 * the available references. Displays the array
 * contents. Allows the user to search for a specific
 * reference based on title match. Also includes a 
 * module for adding a new reference.
 * @author arjon.villamin
 */
package javaMiniProj;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class SearchBooks {
	// initializes the reference Array
	private static ArrayList<References> referenceArray = new ArrayList<References>();
	
	public SearchBooks() {
		createReferenceGUI();
	}

	static void createReferenceGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Search Books");
		frame.setSize(1000, 500);
		setBorder(new EmptyBorder(200, 200, 200, 200));
		setLayout(new GridBagLayout());

		

//		static adding of elements to the reference array (for testing purposes)
//		referenceArray.add(new ACTIONReference("Minna no Nihongo", 1, "Chie Imoto", 1, 1, "AWS Publication",
//				"ACTIONReference", true, 0, null, null));
//		referenceArray
//				.add(new FlashCards("Hiragana Flash Cards", "AWS Publication", "FlashCards", true, 0, null, null));
//		referenceArray
//				.add(new Magazine("Programmer's Digest", "AWS Publication", 1, 1, "Magazine", true, 0, null, null));
//		referenceArray.add(new VideoCD("Minna no Nihongo Listening Exercises", 1250, "AWS Publication", "VideoCD", true,
//				0, null, null));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;

		// declares the output variables
		JButton search = new JButton("Search");
		JButton add = new JButton("Add Reference...");
		JButton submit = new JButton("Submit");
		JButton button = new JButton("Exit");
		ButtonGroup group = new ButtonGroup();
		JRadioButton book;
		JLabel label1 = new JLabel("Search Book: ");
		
		//creates module UI
		JTextArea area = new JTextArea();
		area.setEditable(true);
		area.setWrapStyleWord(true);
		area.addMouseListener(null);
		area.setPreferredSize(new Dimension(150, 30));

		// on click of submit button
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog d = new JDialog(frame, "Message", true);
				d.setSize(300, 250);
				d.setLocationRelativeTo(frame);
				d.setVisible(true);
			}
		});

		// arranges the search bar and search button
		Box searchBar = Box.createHorizontalBox();
		searchBar.add(label1, gbc);
		searchBar.add(area, gbc);
		searchBar.add(search, gbc);
		searchBar.add(add, gbc);

		// formats the references into a list-like display
		Box referenceList = Box.createVerticalBox();
		for (int i = 0; i < referenceArray.size(); i++) {
			book = new JRadioButton(referenceArray.get(i).getTitle());
			group.add(book);
			referenceList.add(book);
		}

		// group the submit and exit button
		Box action = Box.createHorizontalBox();
		action.add(submit);
		action.add(button);

		// displays the window elements
		frame.add(searchBar, BorderLayout.NORTH);
		frame.add(referenceList);
		frame.add(action, BorderLayout.SOUTH);
		frame.setSize(1000, 500);
		// frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		// on click of search button
		search.addActionListener(new ActionListener() {
			private JRadioButton bookResult;
			private ButtonGroup groupResult = new ButtonGroup();
			private Box referenceResultList = Box.createVerticalBox();

			public void actionPerformed(ActionEvent e) {
				frame.add(referenceResultList);
				referenceResultList.setVisible(false);
				String titleQuery = area.getText();
				int flag = 0;
				referenceResultList.removeAll();
				if (titleQuery.equals(null)) {
					referenceList.setVisible(true);
					referenceResultList.setVisible(false);
				} else {
					for (int i = 0; i < referenceArray.size(); i++) {
						if (referenceArray.get(i).getTitle().equals(titleQuery)) {
							bookResult = new JRadioButton(referenceArray.get(i).getTitle());
							groupResult.add(bookResult);
							referenceResultList.add(bookResult);
							flag = 1;
						}
					}
					// if a match is not found
					if (flag == 0) {
						// show full list
						referenceList.setVisible(true);
						frame.revalidate();
						frame.repaint();
						// pop up display message
						JOptionPane.showMessageDialog(frame, "Item doesn't exist.", "Error", JOptionPane.ERROR_MESSAGE);
					} else {
						//shows the result of the search
						referenceList.setVisible(false);
						referenceResultList.setVisible(true);
						frame.revalidate();
						frame.repaint();
					}
				}
			}
		});

		// on click of add button
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Box fields = Box.createVerticalBox();
				
				// title variables
				Box forTitle = Box.createHorizontalBox();
				JLabel lblTitle = new JLabel("Title: ");
				JTextField refTitle = new JTextField("");

				// item type variables
				Box forType = Box.createHorizontalBox();
				JLabel lblType = new JLabel("Item Type: ");
				JComboBox<String> comboTypes = new JComboBox<String>();
				comboTypes.addItem("ACTION Reference");
				comboTypes.addItem("Video CD");
				comboTypes.addItem("Flash Cards");
				comboTypes.addItem("Magazine");
				comboTypes.addItem("Other Materials");

				// action variables
				Box forAction = Box.createHorizontalBox();
				JButton add = new JButton("Add");

				// main dialog box creation
				JDialog d = new JDialog(frame, "Message");
				d.pack();
				d.setSize(300, 250);
				d.setLocationRelativeTo(frame);
				d.setVisible(true);

				// fields for title
				forTitle.add(lblTitle);
				forTitle.add(refTitle);

				// fields for type
				forType.add(lblType);
				forType.add(comboTypes);

				// action field
				forAction.add(add);

				// arrange fields
				fields.add(forTitle);
				fields.add(forType);
				fields.add(forAction);

				// put fields in the dialog box
				d.add(fields);
				d.revalidate();
				
				//on click of Add button
				add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String type = comboTypes.getSelectedItem().toString();
						
						//determines selected item type
						switch (type) {
						case "ACTION Reference":
							//adds new material to the array
							referenceArray.add(new ACTIONReference(refTitle.getText(), 1, "Chie Imoto", 1, 1, "AWS Publication", "ACTIONReference", true, 0, null, null));
							JOptionPane.showMessageDialog(d, "New Action Reference Added.");
							break;
						case "Video CD":
							//adds new material to the array
							referenceArray.add(new VideoCD(refTitle.getText(), 1250, "AWS Publication", "VideoCD", true, 0, null, null));
							JOptionPane.showMessageDialog(d, "New Video CD Added.");
							break;
						case "Flash Cards":
							//adds new material to the array
							referenceArray.add(new FlashCards(refTitle.getText(), "AWS Publication", "FlashCards", true, 0, null, null));
							JOptionPane.showMessageDialog(d, "New Flash Card Added.");
							break;
						case "Magazine":
							//adds new material to the array
							referenceArray.add(new Magazine(refTitle.getText(), "AWS Publication", 1, 1, "Magazine", true, 0, null, null));
							JOptionPane.showMessageDialog(d, "New Magazine Added.");
							break;
						case "Other Materials":
							//adds new material to the array
							referenceArray.add(new OtherMaterials(refTitle.getText(), "AWS Publication", 1, "OtherMaterials", true, 0, null, null));
							JOptionPane.showMessageDialog(d, "New Material Added.");
							break;
						}
						
						//System.out.println(referenceArray.size());
						
						//adds the new material to the button group
						JRadioButton newBook;
						newBook = new JRadioButton(referenceArray.get(referenceArray.size() - 1).getTitle());
						group.add(newBook);
						referenceList.add(newBook);
						referenceList.revalidate();
						referenceList.repaint();
						frame.add(referenceList);
						frame.revalidate();
						frame.repaint();						
					}
				});
			}
		});
	}

	private void add(JLabel jLabel, GridBagConstraints gbc) {
		// TODO Auto-generated method stub

	}

	private static void setLayout(GridBagLayout gridBagLayout) {
		// TODO Auto-generated method stub

	}

	private static void setBorder(EmptyBorder emptyBorder) {
		// TODO Auto-generated method stub

	}

	protected static void add(JDialog jDialog) {
		// TODO Auto-generated method stub

	}
}