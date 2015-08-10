package objects;

import java.awt.Color;
import java.awt.Graphics;

import window.Game;

public class Object {
	private int x, y;
	private Color colour;
	
	public Object(int x, int y){
		this.x = x;
		this.y = y;
		this.colour = Color.orange;
	}
	
	public void render(Graphics g){
		g.setColor(Game.c);
		g.fillRect(x, y, 50, 1200);
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
