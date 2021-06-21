package main.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import main.model.Generators;
import main.model.Generators;

public class ConvertController implements MouseListener{

	private JTextField source;
	private JTextField destiny;
	private JProgressBar progressBar;
	private JButton convert;
	
	
	public ConvertController(JTextField source, JTextField destiny, JProgressBar progressBar, JButton convert) {
		this.source = source;
		this.destiny = destiny;
		this.progressBar = progressBar;
		this.convert = convert;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(convert.isEnabled()) {
			GeneratorWorker worker = new GeneratorWorker(source.getText(), destiny.getText(), progressBar, convert);
			worker.execute();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
