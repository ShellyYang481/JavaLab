import sun.security.util.Length;

public class TestString {

	public static void main(String[] args) {

		String name = "Shelly";
		String name1 = "Shelly";

		String name2 = new String("Shelly");

		System.out.println(name == name1);
		System.out.println(name2 == name1);// heap(news方式建立) != pool("")
		System.out.println("equals=" + name2.equals(name1));

		System.out.println("Hello World".length());
		System.out.println("中文好難".indexOf("文章"));
		System.out.println("abc".contains("a"));
		System.out.println(("abcdefg".substring(2, 5)));
		System.out.println(String.format("%s", "嗨"));

	}

}
