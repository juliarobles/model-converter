package main.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooserSourceController implements MouseListener{

	private JTextField textField;
	
	public FileChooserSourceController(JTextField textField) {
		this.textField = textField;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JFileChooser fc = new JFileChooser();
		FileNameExtensionFilter filterUSE = new FileNameExtensionFilter("*.USE", "use");
		FileNameExtensionFilter filterUML = new FileNameExtensionFilter("*.UML", "uml");
		//Le indicamos el filtro
		fc.addChoosableFileFilter(filterUML);
		fc.addChoosableFileFilter(filterUSE);
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
