package concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class MonitorVehicleTracker {

	private final Map<String , MutablePoint> locations;
	
	public MonitorVehicleTracker(Map<String , MutablePoint> locations) {
	
		this.locations = deepCopy(locations);
	}
	
	public synchronized Map<String,MutablePoint> getLocations()
	{
		return deepCopy(locations);
	}
	
	public synchronized MutablePoint getLocations(String id)
	{
		MutablePoint loc = locations.get(id);
		
		return loc == null ? null : new MutablePoint(loc);
		
	}
	
	public synchronized void setLocations(String id , int x ,int y)
	{
		MutablePoint loc = locations.get(id);
		if(null == loc)
		{
			throw new IllegalArgumentException();
		}
		loc.x = x;
		loc.y = y;
	}
	
	private static Map<String , MutablePoint >deepCopy(Map<String,MutablePoint> m)
	{
		Map<String,MutablePoint> result = new HashMap<String,MutablePoint>();
		
		for(String id : m.keySet())
		{
			result.put(id, new MutablePoint(m.get(id)));
		}
		
		return Collections.unmodifiableMap(result);
	}
	Vector v = new Vector();
	Map m = new HashMap<>();
	Hashtable a = new Hashtable(); 
	
}
