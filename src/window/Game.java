package window;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferStrategy;
import objects.Object;

public class Game extends Canvas implements Runnable{
	
	private Thread thread;
	private boolean running;
	private static int WIDTH, HEIGHT;
	
	private Object o;
	
	public void init(){
		WIDTH = getWidth();
		HEIGHT = getHeight();
		o = new Object(10, 10);
	}
	
	public void tick(){
		
	}
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if (bs == null){
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		Graphics2D g2 = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(
	             RenderingHints.KEY_TEXT_ANTIALIASING,
	             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.setRenderingHints(rh);
		
		o.render(g);
		
		g.dispose();
		bs.show();
	}
	
	public void run() { 
		init(); 
		do { 
			tick(); 
			render(); 
			try { 
				thread.sleep(17L); 
			} catch(InterruptedException e) { 
				e.printStackTrace(); 
				} 
		} while(true); 
	}
	
	public synchronized void start() { 
		if(running) { return; } 
		else { running = true; 
			thread = new Thread(this); 
			thread.start(); 
			return; 
		}
	}
	
	public static void main(String args[]) { 
		new Window(800, 680, "TimeWinder", new Game()); 
	}



}
