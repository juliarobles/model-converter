package main.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;

public class FileChooserDestinyController implements MouseListener{

	private JTextField textField;
	
	public FileChooserDestinyController(JTextField textField) {
		this.textField = textField;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		int seleccion = fc.showOpenDialog(textField);
		
		if(seleccion==JFileChooser.APPROVE_OPTION){
		    File fichero=fc.getSelectedFile();
		    textField.setText(fichero.getPath());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
