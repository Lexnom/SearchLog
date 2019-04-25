package com;

import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyRun implements Runnable {
	
	private String Direct;
	private String nameFile;
	private String searchstr;
	private TextArea textArea;
	private JComboBox<String> ComboBoxDirectFile;
	private JLabel lblInfo;	
	private Set<String> adresList = new HashSet<String>();
	
	public MyRun(String Direct, String nameFile, String searchstr, TextArea textArea, JComboBox ComboBoxDirectFile, JLabel lblInfo ) throws Exception  {
		
		this.Direct = Direct;
		this.nameFile = nameFile;
		this.searchstr = searchstr;
		this.textArea = textArea;
		this.ComboBoxDirectFile = ComboBoxDirectFile;
		this.lblInfo = lblInfo;
	}	
	
	//поиск файла и слова
	private void SearchFiles(File Dir) throws Exception   {		
		
		File[] listfolder = Dir.listFiles();
		
		if(listfolder !=null)
		for (File file : listfolder) {
			
			if(file.isDirectory())
			{
				SearchFiles(file);
				continue;
			}
			else {			
					
					Files.walk(Paths.get(Dir+File.separator+file.getName()))
					.filter(p -> p.toString().endsWith("."+nameFile))
					.forEach(p -> {			
						
							String content;
							try {
								content = new String(Files.readAllBytes(p));
								if(content.contains(searchstr))
								{								
									adresList.add(p.toString());
									System.out.println(adresList);
								}	
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}					
					});							
			}			
		}
	}	
	
	//вывод результата
	@Override
	public void run()  {		
			
		File Dirc = new File(Direct);
		
		try {
			SearchFiles(Dirc);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Vector<String> comboboxItems = new Vector<String>();
		for (String str : adresList) {
			
			comboboxItems.add(str);			
		}	
		
		if(comboboxItems.size() == 0)
		{
			JOptionPane.showMessageDialog(null, "Не найдено файла с заданным словом");
		}else
		{	
			System.out.println(comboboxItems+"  asjdkjas");
			
			DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(comboboxItems);
			ComboBoxDirectFile.setModel(model);
			
			ComboBoxDirectFile.show();
			lblInfo.hide();
			
			SetTextArea((ComboBoxDirectFile.getSelectedItem()).toString(), textArea);
			
			ComboBoxDirectFile.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {				 
					
					SetTextArea((ComboBoxDirectFile.getSelectedItem()).toString(), textArea);				
				}
			});	
		}			
	}	
	
	private void SetTextArea(String file, TextArea textArea)
	{
		try {
			
			BufferedReader bufread = new BufferedReader(new FileReader(file));
			
			String line = null;
			StringBuilder builder = new StringBuilder();				
			
			 while((line = bufread.readLine())!= null)
			 {
			 	builder.append(line+" \n ");								
			 }
			 
			 textArea.setText(builder.toString());
			 bufread.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
				
			}	
	}
}






