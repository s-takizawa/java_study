package cp1;

class Test{
	static String staticValue  = "staticval";
	String instanceValue = "instanceval";
}

public class Main2 {

	public static void main(String[] args) {
		Test obj = null;
		System.out.println(obj.staticValue);
		System.out.println(obj.instanceValue);
	}

}
