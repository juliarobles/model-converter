package main.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConvertController implements MouseListener{

	private JTextField source;
	private JTextField destiny;
	private JProgressBar progressBar;
	
	
	public ConvertController(JTextField source, JTextField destiny, JProgressBar progressBar) {
		this.source = source;
		this.destiny = destiny;
		this.progressBar = progressBar;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		GeneratorWorker worker = new GeneratorWorker(source.getText(), destiny.getText(), progressBar);
		worker.execute();
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
