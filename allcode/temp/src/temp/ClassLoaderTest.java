package temp;

public class ClassLoaderTest {

	public static void main(String[] args) {
		System.out.println(new ClassLoaderTest().getClass().getClassLoader().getResource("").toString());
	}
}
