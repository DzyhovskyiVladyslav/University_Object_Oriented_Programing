package Painter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Menu extends JFrame {
	Menu(String s){
		super(s);
		setLayout(null);
		setSize(1027, 570);
		setVisible(true);
		this.setLocation(0, 0);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		g.drawRect(100, 100, 100, 100);
		Button Clear = new Button("Clean");
		Clear.setBounds(263, 507, 40, 20);
		add(Clear);
		Button P_Point = new Button("Paint point");
		P_Point.setBounds(45, 160, 150, 30);
		P_Point.setFont(new Font("TimesRoman", Font.PLAIN, 18));
		add(P_Point);
		Button P_Line = new Button("Paint line");
		P_Line.setBounds(45, 330, 150, 30);
		P_Line.setFont(new Font("TimesRoman", Font.PLAIN, 18));
		add(P_Line);
		Button P_Circle = new Button("Paint line");
		P_Circle.setBounds(45, 490, 150, 30);
		P_Circle.setFont(new Font("TimesRoman", Font.PLAIN, 18));
		add(P_Circle);
		Button Red = new Button("");
		Red.setBounds(257, 90, 50, 50);
		Red.setBackground(Color.RED);
		add(Red);
		Button Orange = new Button("");
		Orange.setBounds(257, 150, 50, 50);
		Orange.setBackground(Color.ORANGE);
		add(Orange);
		Button Yellow = new Button("");
		Yellow.setBounds(257, 210, 50, 50);
		Yellow.setBackground(Color.YELLOW);
		add(Yellow);
		Button Green = new Button("");
		Green.setBounds(257, 270, 50, 50);
		Green.setBackground(Color.GREEN);
		add(Green);
		Button Cyan = new Button("");
		Cyan.setBounds(257, 330, 50, 50);
		Cyan.setBackground(Color.CYAN);
		add(Cyan);
		Button Blue = new Button("");
		Blue.setBounds(257, 390, 50, 50);
		Blue.setBackground(Color.BLUE);
		add(Blue);
		Button Magenta = new Button("");
		Magenta.setBounds(257, 450, 50, 50);
		Magenta.setBackground(Color.MAGENTA);
		add(Magenta);
		TextField XP = new TextField("");
		XP.setBounds(55, 112, 40, 20);
		add(XP);
		TextField YP = new TextField("");
		YP.setBounds(150, 112, 40, 20);
		add(YP);	
		TextField X1L = new TextField("");
		X1L.setBounds(60, 250, 40, 20);
		add(X1L);
		TextField Y1L = new TextField("");
		Y1L.setBounds(155, 250, 40, 20);
		add(Y1L);
		TextField X2L = new TextField("");
		X2L.setBounds(60, 290, 40, 20);
		add(X2L);
		TextField Y2L = new TextField("");
		Y2L.setBounds(155, 290, 40, 20);
		add(Y2L);
		TextField XC = new TextField("");
		XC.setBounds(55, 412, 40, 20);
		add(XC);
		TextField YC = new TextField("");
		YC.setBounds(150, 412, 40, 20);
		add(YC);	
		TextField RC = new TextField("");
		RC.setBounds(55, 452, 40, 20);
		add(RC);
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.BLACK);
				repaint();			
			}
		});
		P_Point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			int x = Integer.parseInt(XP.getText());
			int y = Integer.parseInt(YP.getText());
			if (x >= 0 && x <= 640 && y >= 0 && y <= 480)
				g.drawLine(x+354, y+57, x+354, y+57);
			}
		});
		P_Line.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			int x1 = Integer.parseInt(X1L.getText());
			int y1 = Integer.parseInt(Y1L.getText());
			int x2 = Integer.parseInt(X2L.getText());
			int y2 = Integer.parseInt(Y2L.getText());
			if (x1 >= 0 && x1 <= 640 && y1 >= 0 && y1 <= 480 && x2 >= 0 && x2 <= 640 && y2 >= 0 && y2 <= 480)
				g.drawLine(x1+354, y1+57, x2+354, y2+57);
			}
		});
		P_Circle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			int x = Integer.parseInt(XC.getText());
			int y = Integer.parseInt(YC.getText());
			int r = Integer.parseInt(RC.getText());
			if (x-r >= 0 && x+r <= 640 && y-r >= 0 && y+r <= 480)
				g.drawOval(x-r+354,y-r+57,2*r,2*r);
			}
		});
		Red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.RED);		
			}
		});
		Orange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.ORANGE);		
			}
		});
		Yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.YELLOW);		
			}
		});
		Green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.GREEN);		
			}
		});
		Cyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.CYAN);		
			}
		});
		Blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.BLUE);		
			}
		});
		Magenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				g.setColor(Color.MAGENTA);		
			}
		});
	}
	public void paint (Graphics gr) {
		gr.setColor(Color.lightGray);
		gr.fillRect(0, 0, 1027, 570);
		gr.setColor(Color.BLACK);
		gr.drawLine(8, 31, 1018, 31); 
		gr.drawLine(328, 31, 328, 561);
		gr.drawLine(248, 81, 248, 561);
		gr.drawLine(8, 561, 1018, 561);
		gr.drawLine(8, 31, 8, 561);
		gr.drawLine(1018, 31, 1018, 561);
		gr.drawLine(8, 81, 328, 81);
		gr.drawLine(8, 241, 248, 241);
		gr.drawLine(8, 401, 248, 401);
		gr.drawLine(353, 56, 994, 56);
		gr.drawLine(994, 56, 994, 537);
		gr.drawLine(994, 537, 353, 537);
		gr.drawLine(353, 537, 353, 56);
		gr.setFont(new Font("TimesRoman", Font.PLAIN, 18)); 
		gr.drawString("Painter v1.0", 641, 50);
		gr.drawString("Colors:", 260, 105);
		gr.drawString("x:", 40, 158);
		gr.drawString("y:", 135, 158);
		gr.drawString("x1:", 40, 298);
		gr.drawString("y1:", 135, 298);
		gr.drawString("x2:", 40, 338);
		gr.drawString("y2:", 135, 338);
		gr.drawString("x:", 40, 458);
		gr.drawString("y:", 135, 458);
		gr.drawString("R:", 40, 498);
		gr.setFont(new Font("TimesRoman", Font.PLAIN, 22)); 
		gr.drawString("Point:", 103, 108);
		gr.drawString("Line:", 106, 268);
		gr.drawString("Circle:", 100, 428);
		gr.setFont(new Font("TimesRoman", Font.PLAIN, 14));
		gr.drawString("created by Vladyslav Dzyhovskyi", 785, 554);
		gr.setFont(new Font("TimesRoman", Font.PLAIN, 28)); 
		gr.drawString("MENU PANEL", 80, 67);
		gr.setColor(Color.WHITE);
		gr.fillRect(354, 57, 640, 480);		
	}

	public static void main(String[] args) {
		new Menu("Painter v1.0 (by Vladyslav Dzyhovskyi)");
		
	}
}




