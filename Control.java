import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Control extends Game implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		clickedX = e.getX() + x;
		
		clickedY = e.getY() + y;
		
		newClick = true;
		
		north = false;
		south = false;
		west = false;
		east = false;
	
		slopeX = Math.abs(Math.round((double)(clickedX - centerX)/(clickedY - centerY)));
		slopeY = Math.abs(Math.round((double)(clickedY - centerY)/(clickedX - centerX)));
		
		//System.out.println(slopeX +" " +slopeY);
		//getDirection();
		directionCheck = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}