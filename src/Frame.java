import java.awt.event.*;
import javax.swing.*;


class Frame extends JFrame {
	JButton b1, b2, b3, b4, b5, bfirst, blast;
	
	public Frame() {
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,550);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		bfirst = new JButton("ù���� �ڽ�");
		p.add(bfirst);
		
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
		
		
		bfirst.setBounds(8,10,320,210);
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
