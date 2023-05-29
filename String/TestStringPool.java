class TestStringPool {
	public static void main(String args[]) {
		String s1 = "Hello World";
		
		String s2 = "Hello World";
		
		System.out.println(s1 == s2);
		
		String s3 = new String("Hello World");
		
		System.out.println(s1 == s3);
	}
}