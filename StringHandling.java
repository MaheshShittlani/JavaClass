String Handling
-------------------
1. java.lang.String
2. java.lang.StringBuilder
3. java.lang.StringBuffer
4. java.util.StringTokenizer

--------------------------
1. What is string: Sequence of character

String class
--------------------
1. String class is public, final.
2. String class object are immutable.

Immutable : String class objects content can't be change once 
objects are created.
Whenever you attempt to change the string content, each time a new
object is created.
-----------------

	Example: String s1 = "Hello";
	
	s1 = s1 + " world";
	
String Creation
--------------------
	1. String Literals -> "Hello World"
	2. String s1 = "Hello World";
	3. String s1 = new String("Hello Worlds");
	4. char[] arr = {'J','A','C','K'};
		String s1 = new String (arr);
	5. char[] arr = {'J','A','C','K','&','J','I','L','L'};
		String s1 = new String (arr,1,4); // ACK
---------------------------------------------------------
String class methods
-------------------------

Basic Operations
-------------------
	1. length(): Return the length of string object
	2. isEmpty():
	3. char charAt(int index): returns the character from a index value
	4. int codePointAt(int index): returns unicode from a index value
----------------------
String concat
-----------------
	String s1 = "Hello";
	String s2 = "world";
	System.out.println(s1+s2); // Helloworld
	System.out.println(s1.concat(s2)); // Helloworld
---------------------------------------------

String comparasion
-------------------
1. boolean equals(Object):
	String s1 = "Jhon";
	String s2 = "John";
	System.out.println(s1.equals(s2)); // false
	
2. int compareTo(String):
		This method match strigs character by character 
			(By subtracting their unicode)
		if all characters are matched it return 0.
		if first string is greater than the second return +ve
		otherwise returns -ve
		
		if(s1.compareTo(s2) > 0) {
			System.out.println(s1+" is greater");
		} else if(s1.compareTo(s2) < 0) {
			System.out.println(s2+" is greater");
		} else {
			System.out.println("Both are equal");
		}
		
3. boolean equalsIgnoreCase(String)
4. int compareToIgnoreCase(String)

------------------------
String mainpulation
------------------
	String toUpperCase();
	String toLowerCase();
	
	String s1 = "Oracle";
	System.out.println(s1.toUpperCase()); // ORACLE
	System.out.println(s1.toLowerCase()); // oracle

Extract Substring
--------------
	1. String substring(int index)
		String s1 = "Humpty Dumpty";
			System.out.println(s1.substring(7)); //Dumpty
	
	2. String substring(int startIndex, int endIndex)
		String s1 = "Humpty Dumpty";
		
		s1.substring(2,9); // mpty D
		
Spliting and replacing
-----------------------------
	1. String[] split(String delimiter)
		String s1 = "Humpty Dumpty, Sit on a wall, They had a, great fall";
		String[] arr = s1.split(",");

	2. String replace(char match, char replace)
		String s1 = "JAVA";
		String s2 = s1.replace('A','#');
		System.out.println(s2); //J#V#
	3. String replaceFirst(String match, String replaceFirst);
	4. String replaceAll(String match, String replacement);
	
	Example:
		String s1 = "a+b$#XD";
		String pattern = '[+$#]';
		String s2 = s1.replaceAll(pattern,"---");
		System.out.println(s2); // a---b------XD
Pattern Matching
-------------------
	bolean match(String regex/pattern)
	------------------------------------
	
	String s1 = "Java";
	System.out.println(s1.match("Java")); // true
	System.out.println(s1.equals("Java")); // true
	
	String s1 = "JAVA is Fun";
	String s2 = "JAVA is cool";
	String s3 = "JAVA is serious Job";
	String s4 = "Humpty Dumpty is learning JAVA";
	
	System.out.println(s1.match("JAVA.*")); // true
	System.out.println(s2.match("JAVA.*")); // true
	System.out.println(s3.match("JAVA.*")); // true
	System.out.println(s4.match("JAVA.*")); // false
	
	
	String phone = "444-333-3454";
	String pattern = "\\d{3}-\\d{3}-\\d{4}";
	System.out.println(phone.match(pattern));
	
Searching in a string
-------------------------
	1. boolean startsWith(String):
		name.startsWith("Ashish");
		
	2. boolean endsWith(String);
		filename.endswith(".txt")
		
	3. int indexOf(String str): This method search for `str` and if
		found then returns the starting index of `str` otherwise
		returns -1.
		
		name.indexOf("kumar") != -1
		
	4. int indexOf(String str, int startIndex): Start searcing after
	`startIndex`
	5. int lastIndexOf(String str)
	6. int lastIndexOf(String str, int startIndex)

Trimming
-------------------
	String trim(): Remove the leading and trailing space.
	----------------
	
	String s1 = "  JAVA  ";
	s1.trim();
	
Conversion
------------
	String to primitive: XXX parseXXX(String)
	-----------------------
	String num = "42";
		int x = Integer.parseInt(num);// 42
		
	Others to String
	------------------
	int x = 42;
	
	1. String s1 = " + 24";
	System.out.println(42 + s1); // 24 + 42
	System.out.println(42 + " + 24");
	
	2. String.valueOf(x); // "42"
	
	Array to String
	----------------
	String Arrays.toString(int[] x);
	
---------------------------------------------
String to array conversion
----------------------------
	char[] toCharArray();
	void getChars(int startIndex, int endIndex, char[] target, int targeStartIndex)
	
	String s = "Humpty Dumpty";
	char[] arr = new char[10];
	
	s.getChars(0,6,arr,0); // arr-> Humpty----
	s.getChars(0,6,arr,3); // arr-> ---Humpty-
	s.getChars(3,6,arr,4); // arr-> ----pty---
Array to string conversion
-----------------------------
	static String copyValueOf(char[]);
	static String copyValueOf(char[], int startIndex, int length)
	
	Example:
		char[] arr = {'J','A','C','K','&','J','I','L','L'};
		String s = String.copyValueOf(arr);
		String s1 = String.copyValueOf(arr,5,3); // JIL


	