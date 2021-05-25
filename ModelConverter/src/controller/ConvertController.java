package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConvertController implements MouseListener{

	private JTextField source;
	private JTextField destiny;
	private JTextArea tArea;
	private JProgressBar progressBar;
	
	
	public ConvertController(JTextField source, JTextField destiny, JTextArea tArea, JProgressBar progressBar) {
		this.source = source;
		this.destiny = destiny;
		this.tArea = tArea;
		this.progressBar = progressBar;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		tArea.setText("");
		GeneratorWorker worker = new GeneratorWorker(source.getText(), destiny.getText(), tArea, progressBar);
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
