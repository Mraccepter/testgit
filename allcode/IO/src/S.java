import java.util.ArrayList;
import java.util.List;
//Java¶ÑÒç³ö
public class S {
static class OOMObject{}
public static void main(String[] args) {
	List<OOMObject> list = new ArrayList<OOMObject>();
	while(true)
	{
		list.add(new OOMObject());
	}
}
}