package controller;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

import model.Generators;

public class GeneratorWorker extends SwingWorker<Void, Void>{

	private String source;
	private String destiny;
	private String res;
	private JTextArea tArea;
	private JProgressBar progressBar;
	
	public GeneratorWorker(String source, String destiny, JTextArea tArea, JProgressBar progressBar) {
		this.setProgress(0);
		this.source = source;
		this.destiny = destiny;
		this.tArea = tArea;
		this.progressBar = progressBar;
	}
	
	public String getRes() {
		return res;
	}

	@Override
	protected Void doInBackground() throws Exception {
		progressBar.setIndeterminate(true);
		progressBar.setString("Convirtiendo...");
		res = Generators.chooseGeneratorBySourceFile(source, destiny);
		return null;
	}
	
	@Override
	protected void done() {
		progressBar.setIndeterminate(false);
		progressBar.setString("");
		System.out.println("hola" + res);
		tArea.setText(res);
	}

}
