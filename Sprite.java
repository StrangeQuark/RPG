import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.*;
import java.util.List;
public class Sprite {

	 protected int x;
	 protected int y;
	 protected int width;
	 protected int height;
	 protected boolean visible;
	 protected Image image;
	 private static List<Arrow> arrows;//mov to char
	public Sprite(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		visible = true;
	}
	protected void loadImage(String imageName) {

		ImageIcon ii = new ImageIcon(imageName);
		image = ii.getImage();
	}
	    
	protected void getImageDimensions() {
		
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	public Image getImage() {
		return image;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}    
	public static List<Arrow> getArrow() {//move to char make non static
        return arrows;
    }
	public void fire() {
		arrows.add(new Arrow(50, 50, x, y));
		System.out.println("Fire");
	}
	
}