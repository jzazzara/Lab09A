import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
	public void paint(Graphics g)
	{
		XmasTree myTree = new XmasTree();
		myTree.drawTrunk(g);
		myTree.drawLeaves(g);
		myTree.drawOrnaments(g);
		myTree.drawStar(g);
		myTree.drawPresents(g);
	}
}

class Tree
{
	// Do NOT alter this Tree class in any way!
	
	public void drawTrunk(Graphics g)
	{
		Expo.setColor(g,Expo.brown);
		Expo.fillRectangle(g,475,395,525,600);
	}

	public void drawLeaves(Graphics g)
	{
		Expo.setColor(g,Expo.green);
		Expo.fillCircle(g,500,300,100);
	}
}

class XmasTree extends Tree
{
     public void drawLeaves(Graphics g)
     {
         Expo.setColor(g,Expo.green);
         Expo.fillPolygon(g,500,200,650,450,350,450); //Top
         Expo.fillPolygon(g,500,150,600,325,400,325); //Middle
         Expo.fillPolygon(g,500,150,575,250,425,250); //Bottom
     }
     
     public void drawOrnaments(Graphics g)
     {
         Expo.setColor(g,Expo.red);
         Expo.fillCircle(g,460,275,15);
         Expo.fillCircle(g,500,220,15);
         Expo.fillCircle(g,470,315,15);
         Expo.fillCircle(g,525,325,15);
         Expo.fillCircle(g,460,370,15);
         Expo.fillCircle(g,540,360,15);
         Expo.fillCircle(g,515,275,15);
         Expo.fillCircle(g,500,400,15);
         Expo.fillCircle(g,425,410,15);
         Expo.fillCircle(g,575,410,15);
     }
     
     public void drawStar(Graphics g)
     {
         Expo.setColor(g,Expo.yellow);
         Expo.fillStar(g,500,140,35,5);
     }
     
     public void drawPresents(Graphics g)
     {
         //Left
         Expo.setColor(g,Expo.red);
         Expo.fillRectangle(g,300,525,400,600);
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,340,525,360,600);
         Expo.fillRectangle(g,300,555,400,570);
         
         //Right
         Expo.setColor(g,Expo.blue);
         Expo.fillRectangle(g,600,525,700,600);
         Expo.setColor(g,Expo.yellow);
         Expo.fillRectangle(g,640,525,660,600);
         Expo.fillRectangle(g,600,555,700,570);
         
     }
}
