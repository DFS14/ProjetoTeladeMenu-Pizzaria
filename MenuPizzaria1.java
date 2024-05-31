package MenuPizzaria1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MenuPizzaria1 {
	 JMenu menu, submenu;
	    JMenuItem i1, i2, i3, i4, i5;
private JFrame frame;
private JTextField logo;
private JButton btnNewButton_1;
private JButton btnNewButton_2;

	public static void main(String[] args) {
		 // SwingUtilities.invokeLater(() -> new MenuPizzaria());
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					MenuPizzaria1 window = new MenuPizzaria1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MenuPizzaria1() {
	
		
	        JFrame f = new JFrame("Pizzaria DFS - Menu Principal");
	        f.setBackground(new Color(255, 255, 128));
	        JMenuBar mb = new JMenuBar();
	        mb.setBackground(new Color(255, 255, 0));

	        menu = new JMenu("Cadastro");
	        i1 = new JMenuItem("Nome Completo");
	        i2 = new JMenuItem("Endereço");
	        i3 = new JMenuItem("Telefone");

	        submenu = new JMenu("Pedido");
	        i4 = new JMenuItem("Pizza");
	        i5 = new JMenuItem("Bebida");

	        menu.add(i1);
	        menu.add(i2);
	        menu.add(i3);
	        submenu.add(i4);
	        submenu.add(i5);
	        menu.add(submenu);

	        mb.add(menu);
	        f.setJMenuBar(mb);
	        f.setSize(400, 400);
	        f.getContentPane().setLayout(null);
	        
	        JButton btnNewButton = new JButton("Confirma Pedido");
	        btnNewButton.setBounds(115, 265, 148, 23);
	        btnNewButton.setBackground(new Color(255, 255, 0));
	        f.getContentPane().add(btnNewButton);
	        
	        logo = new JTextField();
	        logo.setBounds(23, 82, 329, 133);
	        logo.setHorizontalAlignment(SwingConstants.CENTER);
	        logo.setFont(new Font("Stencil", Font.PLAIN, 40));
	        logo.setForeground(new Color(255, 255, 128));
	        logo.setBackground(new Color(0, 0, 128));
	        logo.setText("Pizzaria DFS");
	        f.getContentPane().add(logo);
	        logo.setColumns(40);
	        
	        btnNewButton_1 = new JButton("");
	        btnNewButton_1.setBounds(0, 0, 384, 23);
	        btnNewButton_1.setForeground(new Color(255, 255, 0));
	        btnNewButton_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        f.getContentPane().add(btnNewButton_1);
	        
	        btnNewButton_2 = new JButton("");
	        btnNewButton_2.setForeground(Color.YELLOW);
	        btnNewButton_2.setBounds(0, 316, 384, 23);
	        f.getContentPane().add(btnNewButton_2);
	        f.setVisible(true);
	}



}



