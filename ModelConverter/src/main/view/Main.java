package main.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Component;
import javax.swing.border.MatteBorder;

import main.controller.ConvertController;
import main.controller.FileChooserDestinyController;
import main.controller.FileChooserSourceController;
import main.view.utilities.CustomOutputStream;
import main.view.utilities.RoundBorder;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextArea;

public class Main {

	private JFrame frmModelConverter;
	private JTextField sourceTextField;
	private JTextField destinyTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmModelConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModelConverter = new JFrame();
		frmModelConverter.setPreferredSize(new Dimension(385, 482));
		frmModelConverter.setMinimumSize(new Dimension(385, 500));
		frmModelConverter.setTitle("Model Converter - MagicDraw & USE");
		frmModelConverter.getContentPane().setBackground(Color.WHITE);
		frmModelConverter.getContentPane().setLayout(new BoxLayout(frmModelConverter.getContentPane(), BoxLayout.PAGE_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(10, 5, 0, 5));
		panel_1.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frmModelConverter.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Select the .uml or .use file to convert:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblNewLabel);
		
		JPanel source = new JPanel();
		source.setBorder(new EmptyBorder(0, 8, 5, 8));
		source.setMaximumSize(new Dimension(32767, 300));
		source.setBackground(Color.WHITE);
		frmModelConverter.getContentPane().add(source);
		source.setLayout(new BoxLayout(source, BoxLayout.X_AXIS));
		
		sourceTextField = new JTextField();
		sourceTextField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		sourceTextField.setMinimumSize(new Dimension(20, 19));
		sourceTextField.setPreferredSize(new Dimension(20, 19));
		source.add(sourceTextField);
		sourceTextField.setColumns(18);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		source.add(panel);
		
		JButton btnSource = new JButton("Open...");
		btnSource.setForeground(Color.BLACK);
		btnSource.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSource.setBackground(Color.WHITE);
		btnSource.setFocusPainted(false);
		btnSource.addMouseListener(new FileChooserSourceController(sourceTextField));
		source.add(btnSource);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(5, 5, 0, 5));
		panel_2.setBackground(Color.WHITE);
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		frmModelConverter.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Select the destination path:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_1);
		
		JPanel destination = new JPanel();
		destination.setBorder(new EmptyBorder(0, 8, 14, 8));
		destination.setMaximumSize(new Dimension(32767, 300));
		destination.setBackground(Color.WHITE);
		frmModelConverter.getContentPane().add(destination);
		destination.setLayout(new BoxLayout(destination, BoxLayout.X_AXIS));
		
		destinyTextField = new JTextField();
		destinyTextField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		destination.add(destinyTextField);
		destinyTextField.setColumns(18);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		destination.add(panel_3);
		
		JButton btnDestiny = new JButton("Open...");
		btnDestiny.setBackground(Color.WHITE);
		btnDestiny.setForeground(Color.BLACK);
		btnDestiny.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnDestiny.addMouseListener(new FileChooserDestinyController(destinyTextField));
		destination.add(btnDestiny);
		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.setBorder(new RoundBorder(10));
		btnConvert.setPreferredSize(new Dimension(120, 30));
		btnConvert.setMinimumSize(new Dimension(40, 30));
		btnConvert.setMaximumSize(new Dimension(200, 30));
		btnConvert.setBackground(SystemColor.menu);
		btnConvert.setForeground(SystemColor.desktop);
		btnConvert.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(10, 20));
		panel_4.setMinimumSize(new Dimension(10, 20));
		panel_4.setBackground(Color.WHITE);
		frmModelConverter.getContentPane().add(panel_4);
		frmModelConverter.getContentPane().add(btnConvert);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_4_1.setPreferredSize(new Dimension(10, 20));
		panel_4_1.setMinimumSize(new Dimension(10, 20));
		panel_4_1.setBackground(Color.WHITE);
		frmModelConverter.getContentPane().add(panel_4_1);
		
		JTextArea textArea = new JTextArea();
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		System.setOut(printStream);
		System.setErr(printStream);
		textArea.setBackground(SystemColor.menu);
		textArea.setEditable(false);
		JScrollPane sp = new JScrollPane(textArea);
		sp.setBackground(SystemColor.menu);
		sp.setBorder(new EmptyBorder(14, 15, 15, 15));
		sp.setPreferredSize(new Dimension(200, 232));
		sp.setMinimumSize(new Dimension(200, 232));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBorder(null);
		frmModelConverter.getContentPane().add(sp);
		
		
		JProgressBar progressBar = new JProgressBar(0, 100);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		progressBar.setString("");
		frmModelConverter.getContentPane().add(progressBar);
		
		
		btnConvert.addMouseListener(new ConvertController(sourceTextField, destinyTextField, progressBar, btnConvert));

		frmModelConverter.setBounds(100, 100, 460, 482);
		frmModelConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

