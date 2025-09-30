package org.test.AALearnjava;

/*
Explanation:
1. String str1 = new String("Hello");

This creates a new String object in the heap with value "Hello", even though "Hello" already exists in the String pool.

So str1 points to a new object.

2. String str2 = new String("Hello");

This does the same as above: creates another new String object in the heap.

So str2 is a different object from str1, even though they contain the same characters.

3. String str3 = "Hello";

This uses a string literal, which goes into the String pool.

If "Hello" already exists in the pool (which it does), it reuses it.

4. String str4 = "Hello";

Same as str3. It points to the same object in the String pool.

Output Analysis:
System.out.println(str1 == str2);

Compares references.

str1 and str2 are two different objects in the heap → false

System.out.println(str3 == str4);

Compares references.

Both point to the same object in the String pool → true

System.out.println(str3 == str1);

Compares references.

str3 is from the pool, str1 is a new object → false

System.out.println(str1.equals(str2));

Compares contents of the strings.

Both contain "Hello" → true

Final Output:
false
true
false
true

 */
public class AllearnStringConcept {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str3 == str1);
        System.out.println(str1.equals(str2));


    }
}
