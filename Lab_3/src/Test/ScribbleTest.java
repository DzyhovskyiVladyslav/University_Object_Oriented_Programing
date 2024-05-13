package Test;
import java.awt.*;
import java.awt.event.*;

public class ScribbleTest extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ScribbleTest (String s){
	  super(s);
	  
	  ScrollPane pane = new ScrollPane();
	  pane.setSize(300, 300);
	  add(pane, BorderLayout.CENTER);
	  Scribble scr = new Scribble(this,500,500);
	  pane.add(scr);
	  
	  Panel p = new Panel();
	  add(p, BorderLayout.SOUTH);
	  
	  Button b1 = new Button("Красный"); p.add(b1);
	  b1.addActionListener(scr);
	  Button b2 = new Button("Зеленый"); p.add(b2);
	  b2.addActionListener(scr);
	  Button b3 = new Button("Синий"); p.add(b3);
	  b3.addActionListener(scr);
	  Button b4 = new Button("Черный"); p.add(b4);
	  b4.addActionListener(scr);
	  Button b5 = new Button("Очистить"); p.add(b5);
	  b5.addActionListener(scr);
	  
	  addWindowListener(new WindowAdapter() {
		  public void windowClosing (WindowEvent e){
			  System.exit(0);
		  }
	  });
	  pack();
	  setVisible(true);
	}
	
	public static void main(String[] args) {
		new ScribbleTest(" \"Рисовалка\"");
	}
}
class Scribble extends Component implements ActionListener, MouseListener, MouseMotionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int lastX, lastY, w, h;
	protected Color currColor = Color.black;
	protected Frame f;
	
	public Scribble(Frame frame, int width, int height) {
		f = frame; w = width; h = height;
		enableEvents (AWTEvent.MOUSE_EVENT_MASK |
				      AWTEvent.MOUSE_MOTION_EVENT_MASK);
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public Dimension getPreferredSize(){
		return new Dimension(w, h);
	}
	public void actionPerformed(ActionEvent event){
		String s = event.getActionCommand();
		if (s.equals("Очистить")) repaint();
		else if (s.equals("Красный")) currColor = Color.red;
		else if (s.equals("Зеленый")) currColor = Color.green;
		else if (s.equals("Синий")) currColor = Color.blue;
		else if (s.equals("Черный")) currColor = Color.black;
			}
	public  void mousePressed (MouseEvent e){
	 		lastX = e.getX(); lastY = e.getY();
		}
	public void mouseDragged (MouseEvent e){
				Graphics g = getGraphics();
		g.setColor(currColor);
		g.drawLine(lastX, lastY, e.getX(), e.getY());
		lastX = e.getX(); lastY = e.getY();
	      }
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
}