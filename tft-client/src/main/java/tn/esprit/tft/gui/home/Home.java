package tn.esprit.tft.gui.home;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.ScrollPane;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCompetetion = new JMenu("Management Competetion");
		menuBar.add(mnCompetetion);
		
		JMenuItem mntmAddCompetetion = new JMenuItem("Add Competetion");
		mnCompetetion.add(mntmAddCompetetion);
		
		JMenuItem mntmEditComepetion = new JMenuItem("Edit Comepetion");
		mnCompetetion.add(mntmEditComepetion);
		
		JMenuItem mntmDeleteCompetetion = new JMenuItem("Delete Competetion");
		mnCompetetion.add(mntmDeleteCompetetion);
		
		JMenu mnDoctor = new JMenu(" Mnagement Doctor");
		menuBar.add(mnDoctor);
		
		JMenuItem mntmAddDoctor = new JMenuItem("Add Doctor");
		mnDoctor.add(mntmAddDoctor);
		
		JMenuItem mntmEditDoctor = new JMenuItem("Edit Doctor");
		mnDoctor.add(mntmEditDoctor);
		
		JMenuItem mntmDeleteDoctor = new JMenuItem("Delete Doctor");
		mnDoctor.add(mntmDeleteDoctor);
		
		JMenu mnPlayer = new JMenu("Management Player");
		menuBar.add(mnPlayer);
		
		JMenuItem mntmAddPlayer = new JMenuItem("Add Player");
		mnPlayer.add(mntmAddPlayer);
		
		JMenuItem mntmEditPlayer = new JMenuItem("Edit Player");
		mnPlayer.add(mntmEditPlayer);
		
		JMenuItem mntmDeletePlayer = new JMenuItem("Delete Player");
		mnPlayer.add(mntmDeletePlayer);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ScrollPane scrollPane = new ScrollPane();
		contentPane.add(scrollPane, BorderLayout.NORTH);
	}

}
