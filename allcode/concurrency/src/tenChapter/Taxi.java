package tenChapter;

import java.awt.Image;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Taxi {

	private Point location ,destination;
	private final Dispatcher dispatcher;
	public Taxi(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}
	public synchronized Point getLocation()
	{
		return location;
	}
	public synchronized void setLocation(Point location)
	{
		this.location = location;
		if(location.equals(destination))
		{
			dispatcher.notifyAvailable(this);
		}
	}
}
class Dispatcher{
	private final Set<Taxi> taxis;
	private final Set<Taxi> availablesTaxis;
	
	public Dispatcher() {
		taxis = new HashSet<Taxi>();
		availablesTaxis = new HashSet<Taxi>();
	}
	public synchronized void notifyAvailable(Taxi taxi)
	{
		availablesTaxis.add(taxi);
	}
	LinkedBlockingQueue
	public synchronized Image getImage()
	{
		Image image = new Image();
		for(Taxi t : taxis)
			image.drawMarker(t.getLocation());
		return image;
		ThreadPoolExecutor
		
	}
}