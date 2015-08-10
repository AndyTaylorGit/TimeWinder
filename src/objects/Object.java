package objects;

import java.awt.Color;
import java.awt.Graphics;

public class Object {
	private int x, y;
	
	public Object(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void render(Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 10, 10);
	}
	
	public int getX(){
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}
