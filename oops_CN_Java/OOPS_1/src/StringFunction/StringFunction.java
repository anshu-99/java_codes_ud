
package StringFunction;
//import java.util.*;
public class StringFunction {
    public static void main(String[] args) {
        String originalString = "   Hello, World!   ";

        // charAt
        char charAtIndex = originalString.charAt(7);
        System.out.println("charAt(7): " + charAtIndex);

        // length
        int length = originalString.length();
        System.out.println("Length: " + length);

        // substring
        String substring1 = originalString.substring(7);
        System.out.println("Substring from index 7: " + substring1);

        String substring2 = originalString.substring(2, 7);
        System.out.println("Substring from index 2 to 7: " + substring2);

        // indexOf
        int indexOfWorld = originalString.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // lastIndexOf
        int lastIndexOfSpace = originalString.lastIndexOf(" ");
        System.out.println("Last index of space: " + lastIndexOfSpace);

        // startsWith
        boolean startsWithHello = originalString.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // endsWith
        boolean endsWithSpace = originalString.endsWith(" ");
        System.out.println("Ends with space: " + endsWithSpace);

        // toLowerCase
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);

        // toUpperCase
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        // trim
        String trimmedString = originalString.trim();
        System.out.println("Before Trimmed: "+"'"+originalString+"'" );
        System.out.println("Trimmed: " + trimmedString+" and length: "+trimmedString.length());

        // replace
        String replacedString = originalString.replace('o', 'x');
        System.out.println("Replace 'o' with 'x': " + replacedString);

        // replaceAll
        String noSpacesString = originalString.replaceAll("\\s", "");
        System.out.println("Remove spaces: " + noSpacesString);

        // startsWith with offset
        boolean startsWithLo = originalString.startsWith("lo", 3);
        System.out.println("Starts with 'lo' from index 3: " + startsWithLo);
    }
}
