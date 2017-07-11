package eightChapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("javasoft");
		log.setLevel(Level.INFO);
		Logger log1 = Logger.getLogger("javasoft");
		System.out.println(log == log1);
		Logger log2 = Logger.getLogger("java");
		log2.setLevel(Level.SEVERE);
		
		log.info("aaa");
		log2.severe("ccc");
		log2.info("bbb");
		log2.info("fine");
	}
}
