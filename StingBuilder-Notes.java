StringBuilder class
--------------------

In Java, the StringBuilder class is used to efficiently 
manipulate strings. 
StringBuilder class objects are mutable.

Creating Sting Builder Object
----------------------------
StringBuilder()
StringBuilder(int capacity)
StringBuilder(String)
------------------------------------
1. capacity() : This method returns the current capacity of string builder
object. Capactiy = length + buffer Size(16)
StringBuilder sb = new StringBuilder("Hello World");
int capacity = sb.capacity();      // capacity >= 11

2. ensureCapacity(int maxCapacity) - This method ensure that string
has `maxCapacity` otherwise then string capacity will be increase with 
maxCapacity

3. StringBuilder append(XXX) - This method append the given parameter
at the end of the string builder object.

StringBuilder sb = new StringBuilder();
sb.append("Hello");               // Appending a string
sb.append(' ');                   // Appending a character
sb.append(123);                   // Appending an integer
sb.append(3.14);                  // Appending a double
sb.append(true);                  // Appending a boolean

// Method chaining example
sb.append(" World").append("!");  // Chaining multiple append() calls


4. insert(int index, XXX) - insert the given param at the given index.

StringBuilder sb = new StringBuilder("Hello World");
sb.insert(5, "beautiful ");        // Inserting a string at index 5
sb.insert(0, 42);                  // Inserting an integer at the beginning
sb.insert(12, 3.14);               // Inserting a double at index 12

// Method chaining example
sb.insert(0, "Greetings, ").insert(sb.length(), "!");  
// Chaining multiple insert() calls

5. delete(int startIndex, int endIndex) - It deletes a portion of string.

StringBuilder sb = new StringBuilder("Hello World");
sb.delete(0, 5);                   // Removing "Hello "
sb.deleteCharAt(5);                // Removing the character at index 5


6. replace()

StringBuilder sb = new StringBuilder("Hello World");
sb.replace(6, 11, "Universe");     // Replacing "World" with "Universe"

5. reverse()

StringBuilder sb = new StringBuilder("Hello World");
sb.reverse();                      // Reversing the content


7. setCharAt(int index, char replacement)
StringBuilder sb = new StringBuilder("Hello World");
sb.setCharAt(6, 'J');              // Replacing 'W' with 'J'
------------------------------------------------

8. setLenght(int length) -> Used to shorten the length

	StringBuilder sb = new StringBuilder("Hello World");
	sb.setLength(5);
	System.out.println(sb); // Hello

StringBuilder V/S StringBuffer
--------------------------------
StringBuffer -> Thread Safe - All the methods are syncronized
StringBuilder -> Not Thread Safe - No methods are syncronized

java.util.StringTokenizer class
------------------------------------
Creating StringTokenizer Object
--------------------------------
StringTokenizer(String str)
StringTokenizer(String str, String delim)
StringTokenizer(String str, String delim, boolean returnDelim)

boolean hasMoreTokens()
String nextToken()
int countToken()

Emnumertaion Methos
------------------
boolean hasMoreElements()
Object nextElement()


java.util.Scanner class
---------------------------
