package demo;

import java.util.Date;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Current Time: " + new Date());
		System.out.println("--------------ENV");
		int i = 0;
		Map<String, String> map = System.getenv();
		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.println("env[" + (++i) + "]: " + e.getKey() + " = "
					+ e.getValue());
		}
		System.out.println("--------------TEST3");
	}

}
