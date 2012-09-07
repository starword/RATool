import java.awt.AWTException;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Transparency;
import java.awt.Window;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class RATool
{

	Robot	robot	= null;
	Point	p1	  = null;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		RATool red = new RATool();

		red.start();

	}

	public RATool()
	{
		try
		{
			robot = new Robot();
		}
		catch (AWTException e)
		{
			e.printStackTrace();
		}
		;

		p1 = new Point();

	}

	public void start()
	{

//		while (true)
//		{
			// p1.setLocation(400, 400);
			//
			// move(p1);
			//
			// click();
			// System.out.println("click");
			//
			// press();
			// System.out.println("press");

			draw();

//			robot.delay(5000);

//		}

	}

	public void move(Point p)
	{
		robot.mouseMove(p.x, p.y);
	}

	public void click()
	{

		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(300);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

	}

	public void press()
	{
		robot.keyPress(KeyEvent.VK_A);
		robot.delay(300);
		robot.keyRelease(KeyEvent.VK_A);
	}

	public void collectRes()
	{

	}

	public void closeMsg()
	{

	}

	public void refresh()
	{

	}

	public void draw() 
	{
//		try
//        {
	        int numBuffers = 2;
	        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	        
	        GraphicsDevice gd = ge.getDefaultScreenDevice();
	        GraphicsConfiguration gc = gd.getDefaultConfiguration();
	        
	        

	        // Create our component
	        Window w = new Window(null,gc);

	        // Show our window
	        w.setVisible(true);

	        // Create a general double-buffering strategy
	        w.createBufferStrategy(2);
	        BufferStrategy strategy = w.getBufferStrategy();

	        boolean done = false;
	        // Render loop
	        while (!done) {
	           Graphics g = strategy.getDrawGraphics();
	           // Draw to graphics
	           g.drawLine(0, 0, 400, 400);
//	           done = true;
	           strategy.show();
	        }

	        // Dispose the window
//	        w.setVisible(false);
//	        w.dispose();
	        
	        
	        
//	        BufferedImage bimage = gc.createCompatibleImage(100, 100, Transparency.BITMASK);
//	        
//	        Graphics g = bimage.getGraphics();
//	        
//	        g.setColor(Color.RED);
//	        g.drawLine(0,0,400,400);
//	     
//	        bimage.flush();
	        

	        
//	        Frame  mainFrame = new Frame(gc);
//	        mainFrame.setUndecorated(true);
//	        mainFrame.setIgnoreRepaint(true);
//	        gd.setFullScreenWindow(mainFrame);
////        if (gd.isDisplayChangeSupported()) {
////            chooseBestDisplayMode(gd);
////        }
//	        Rectangle bounds = mainFrame.getBounds();
//	        mainFrame.createBufferStrategy(numBuffers);
//	        BufferStrategy bufferStrategy = mainFrame.getBufferStrategy();
//	        for (float lag = 2000.0f; lag > 0.00000006f; lag = lag / 1.33f) {
//	            for (int i = 0; i < numBuffers; i++) {
//	                Graphics g = bufferStrategy.getDrawGraphics();
//	                if (!bufferStrategy.contentsLost()) {
//	                    g.setColor(Color.RED);
//	                    g.fillRect(0,0,bounds.width, bounds.height);
//	                    bufferStrategy.show();
//	                    g.dispose();
//	                }
//	                try {
//	                    Thread.sleep((int)lag);
//	                } catch (InterruptedException e) {}
//	            }
//	        }
//        }
//        catch (HeadlessException e)
//        {
//	        // TODO Auto-generated catch block
//	        e.printStackTrace();
//        }
		
		
//		GraphicsDevice[] gs = ge.getScreenDevices();
//		for (int j = 0; j < gs.length; j++)
//		{
//			System.out.println("gs.len=" + gs.length);
//			GraphicsDevice gd = gs[j];
//			GraphicsConfiguration[] gc = gd.getConfigurations();
//			for (int i = 0; i < gc.length; i++)
//			{
//				if(i > 0)
//				{
//					break;
//				}
//				robot = new Robot(gd);
//				robot.
//				
//					
//				System.out.println(gd.getIDstring());
//				System.out.println(i);
//				JFrame f = new JFrame(gs[j].getDefaultConfiguration());
//				Canvas c = new Canvas(gc[i])
////				Canvas c = new Canvas(gs[j].getDefaultConfiguration())
//				{
//					public void paint(Graphics g)
//					{
////						super.paint(g);
//						System.out.println("drawString");
//						g.drawString("---------------------", 400, 400);
//					}
//				};
//				
//		
//		
//				
//				Rectangle gcBounds = gc[i].getBounds();
//				int xoffs = gcBounds.x;
//				int yoffs = gcBounds.y;
////				c.setLocation((i * 50) + xoffs, (i * 60) + yoffs);
////				c.setVisible(true);
//				
//				f.getContentPane().add(c);
//				f.setLocation((i * 50) + xoffs, (i * 60) + yoffs);
//				f.setVisible(true);
//			}
//		}
	}
}
