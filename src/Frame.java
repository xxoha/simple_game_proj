import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;



class Frame extends JFrame {
	JButton b1, b2, b3, b4, b5, blast;
	
	public Frame() {
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,550);
		JPanel p = new JPanel();
		p.setLayout(null);
		

	    Image img1 = null;
	    Image img2 = null;
	    
	    try {
	       
	        File image1 = new File("play.png");
	        img1 = ImageIO.read(image1);
	        File image2 = new File("enemy.png");
	        img2 = ImageIO.read(image2);
	       
	    } catch (IOException e) {
	    }
	    
	    TitledBorder tb = new TitledBorder(new LineBorder(Color.black));
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		
		p2.setBorder(tb);
	    p2.setBounds(5,5,325,210);
	    p.add(p2);
		
	    
	    JLabel label1 = new JLabel(new ImageIcon(img1));
	    p.add(label1);
	    label1.setBounds(27,35,100,100);
	    
	    JLabel label3 = new JLabel("���");
	    label3.setBounds(53, 125, 100, 50);
	    p.add(label3);
	    
	    JLabel label4 = new JLabel("�λ�");
	    label4.setBounds(235, 125, 100, 50);
	    p.add(label4);
	    
	    
	
	    JLabel label2 = new JLabel(new ImageIcon(img2));
	    p2.setOpaque(false);
	    p.add(label2);
	    label2.setBounds(205,43,90,90);
	 
	    JProgressBar hp, hp2;
	    	hp = new JProgressBar(0,10);
	    	hp.setValue(10);
	    	hp.setStringPainted(false);
	    	hp.setBounds(53,160,50,11);
	    	hp.setBackground(Color.red);
	    	hp.setForeground(Color.red);
	  
	    	add(hp);
	  
	          hp2 = new JProgressBar(0,10);
	    	  hp2.setValue(10);
	    	  hp2.setStringPainted(false);
	          hp2.setBounds(235,160,50,12);
	          hp2.setBackground(Color.red);
	          hp2.setForeground(Color.red);
	     
	          add(hp2);

	    
		b1 = new JButton("���� ��ư #1");
		p.add(b1);
		
		b2 = new JButton("��� ��ư #2");
		p.add(b2);
		
		b3 = new JButton("�޽� ��ư #3");
		p.add(b3);
		
		b4 = new JButton("���� ��ư #4");
		p.add(b4);
		
		b5 = new JButton("���� ��ư #5");
		p.add(b5);
		
		blast = new JButton("������ �ڽ�");
		p.add(blast);
		
		
		
		b1.setBounds(8, 230, 64, 60);
		b2.setBounds(72, 230, 64, 60);
		b3.setBounds(136, 230, 64, 60);
		b4.setBounds(200, 230, 64, 60);
		b5.setBounds(264, 230, 64, 60);
		blast.setBounds(8, 330, 320, 160);

		
		add (p);
		setVisible(true);
		
	}

}
