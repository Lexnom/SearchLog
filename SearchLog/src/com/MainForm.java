package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTree;
import javax.swing.filechooser.*;
import javax.swing.plaf.FileChooserUI;

import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.ScrollPane;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MainForm {

	private JFrame frame;
	private JTextField tfsv;
	private JTextField textAdresDirect;
	private JFileChooser fileChooser = new JFileChooser();
	private JTextField txtlog;
	private int CarPos = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
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
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter(".log","log");
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Поиск");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		GridBagConstraints gbc_verticalGlue_1 = new GridBagConstraints();
		gbc_verticalGlue_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalGlue_1.gridx = 28;
		gbc_verticalGlue_1.gridy = 1;
		frame.getContentPane().add(verticalGlue_1, gbc_verticalGlue_1);
		
		JLabel label = new JLabel("\u0421\u043B\u043E\u0432\u043E:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.SOUTHEAST;
		gbc_label.gridx = 20;
		gbc_label.gridy = 2;
		frame.getContentPane().add(label, gbc_label);
		
		tfsv = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.SOUTH;
		gbc_textField.gridwidth = 11;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 21;
		gbc_textField.gridy = 2;
		frame.getContentPane().add(tfsv, gbc_textField);
		tfsv.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0412\u044B\u0431\u043E\u0440 \u0434\u0438\u0440\u0435\u043A\u0442\u043E\u0440\u0438\u0438:");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 20;
		gbc_label_1.gridy = 3;
		frame.getContentPane().add(label_1, gbc_label_1);
		
		textAdresDirect = new JTextField();
		GridBagConstraints gbc_textAdresDirect = new GridBagConstraints();
		gbc_textAdresDirect.anchor = GridBagConstraints.NORTH;
		gbc_textAdresDirect.gridwidth = 11;
		gbc_textAdresDirect.insets = new Insets(0, 0, 5, 5);
		gbc_textAdresDirect.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAdresDirect.gridx = 21;
		gbc_textAdresDirect.gridy = 3;
		frame.getContentPane().add(textAdresDirect, gbc_textAdresDirect);
		textAdresDirect.setColumns(10);
		
		JButton btnOpenDircect = new JButton("\u041E\u0442\u043A\u0434\u0443\u0430 \u0438\u0441\u043A\u0430\u0442\u044C?");
		btnOpenDircect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {									
					
					fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					int result = fileChooser.showDialog(null, "Выбор директории");
					if(result == JFileChooser.APPROVE_OPTION)
					{
						textAdresDirect.setText(fileChooser.getSelectedFile()+"");
					}				
			}
		});
		GridBagConstraints gbc_btnOpenDircect = new GridBagConstraints();
		gbc_btnOpenDircect.anchor = GridBagConstraints.NORTH;
		gbc_btnOpenDircect.insets = new Insets(0, 0, 5, 5);
		gbc_btnOpenDircect.gridx = 32;
		gbc_btnOpenDircect.gridy = 3;
		frame.getContentPane().add(btnOpenDircect, gbc_btnOpenDircect);
		
		TextArea txtArea = new TextArea();
		GridBagConstraints gbc_txtArea = new GridBagConstraints();
		gbc_txtArea.gridwidth = 6;
		gbc_txtArea.fill = GridBagConstraints.BOTH;
		gbc_txtArea.gridheight = 26;
		gbc_txtArea.insets = new Insets(0, 0, 5, 5);
		gbc_txtArea.gridx = 33;
		gbc_txtArea.gridy = 2;
		frame.getContentPane().add(txtArea, gbc_txtArea);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue = new GridBagConstraints();
		gbc_horizontalGlue.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue.gridx = 39;
		gbc_horizontalGlue.gridy = 3;
		frame.getContentPane().add(horizontalGlue, gbc_horizontalGlue);
		
		JLabel lblendtext = new JLabel("\u0420\u0430\u0441\u0448\u0438\u0440\u0435\u043D\u0438\u0435 \u0444\u0430\u0439\u043B\u0430");
		GridBagConstraints gbc_lblendtext = new GridBagConstraints();
		gbc_lblendtext.anchor = GridBagConstraints.NORTH;
		gbc_lblendtext.insets = new Insets(0, 0, 5, 5);
		gbc_lblendtext.gridx = 20;
		gbc_lblendtext.gridy = 4;
		frame.getContentPane().add(lblendtext, gbc_lblendtext);
		
		txtlog = new JTextField();
		txtlog.setText("log");
		GridBagConstraints gbc_txtlog = new GridBagConstraints();
		gbc_txtlog.gridwidth = 11;
		gbc_txtlog.insets = new Insets(0, 0, 5, 5);
		gbc_txtlog.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtlog.gridx = 21;
		gbc_txtlog.gridy = 4;
		frame.getContentPane().add(txtlog, gbc_txtlog);
		txtlog.setColumns(10);
		
		
		JComboBox ListFile = new JComboBox();
		GridBagConstraints gbc_ListFile = new GridBagConstraints();
		gbc_ListFile.gridwidth = 13;
		gbc_ListFile.insets = new Insets(0, 0, 5, 5);
		gbc_ListFile.fill = GridBagConstraints.HORIZONTAL;
		gbc_ListFile.gridx = 20;
		gbc_ListFile.gridy = 7;
		frame.getContentPane().add(ListFile, gbc_ListFile);	
		ListFile.hide();
		 
		MyThreadPoolExecutor executor = new MyThreadPoolExecutor();
		
		JLabel lblinfo = new JLabel("\u0418\u0434\u0435\u0442 \u043F\u043E\u0438\u0441\u043A \u0444\u0430\u0439\u043B\u0430......");
		GridBagConstraints gbc_lblinfo = new GridBagConstraints();
		gbc_lblinfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblinfo.gridx = 20;
		gbc_lblinfo.gridy = 8;
		frame.getContentPane().add(lblinfo, gbc_lblinfo);
		lblinfo.hide();
		
		JButton SearchBtn = new JButton("\u041D\u0430\u0439\u0442\u0438");
		SearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				lblinfo.show();
				ListFile.hide();
				try {
					
					MyRun mr;			
					mr = new MyRun(textAdresDirect.getText(), txtlog.getText(), tfsv.getText(), txtArea, ListFile, lblinfo);
					executor.submit(mr);
				}catch (Exception e) {
					// TODO: handle exception
				}						
			}
		});
		GridBagConstraints gbc_SearchBtn = new GridBagConstraints();
		gbc_SearchBtn.gridwidth = 2;
		gbc_SearchBtn.insets = new Insets(0, 0, 5, 5);
		gbc_SearchBtn.gridx = 29;
		gbc_SearchBtn.gridy = 5;
		frame.getContentPane().add(SearchBtn, gbc_SearchBtn);		
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 6;
		gbc_horizontalStrut.gridy = 10;
		frame.getContentPane().add(horizontalStrut, gbc_horizontalStrut);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_3 = new GridBagConstraints();
		gbc_horizontalGlue_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue_3.gridx = 13;
		gbc_horizontalGlue_3.gridy = 10;
		frame.getContentPane().add(horizontalGlue_3, gbc_horizontalGlue_3);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_2 = new GridBagConstraints();
		gbc_horizontalGlue_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue_2.gridx = 16;
		gbc_horizontalGlue_2.gridy = 10;
		frame.getContentPane().add(horizontalGlue_2, gbc_horizontalGlue_2);		
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 27;
		gbc_verticalStrut.gridy = 19;
		frame.getContentPane().add(verticalStrut, gbc_verticalStrut);
		
		Component verticalGlue = Box.createVerticalGlue();
		GridBagConstraints gbc_verticalGlue = new GridBagConstraints();
		gbc_verticalGlue.insets = new Insets(0, 0, 5, 5);
		gbc_verticalGlue.gridx = 31;
		gbc_verticalGlue.gridy = 20;
		frame.getContentPane().add(verticalGlue, gbc_verticalGlue);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 26;
		gbc_verticalStrut_1.gridy = 21;
		frame.getContentPane().add(verticalStrut_1, gbc_verticalStrut_1);
		
		JButton btnNext = new JButton("\u0412\u043F\u0435\u0440\u0435\u0434");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtArea.requestFocus();
				txtArea.setCaretPosition(CarPos++);
				System.out.println(CarPos);
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.insets = new Insets(0, 0, 5, 5);
		gbc_btnNext.gridx = 35;
		gbc_btnNext.gridy = 28;
		frame.getContentPane().add(btnNext, gbc_btnNext);
		
		JButton btnBack = new JButton("\u041D\u0430\u0437\u0430\u0434");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtArea.requestFocus();
				if(CarPos >= 0)
				{
					txtArea.setCaretPosition(CarPos--);
				}								
			}
		});
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 36;
		gbc_btnBack.gridy = 28;
		frame.getContentPane().add(btnBack, gbc_btnBack);
		
		
	}
}
