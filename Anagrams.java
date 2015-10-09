import java.util.Arrays;
import java.lang.Character;

public class Anagrams {

	private static boolean isAnagram(String strOne, String strTwo) {
		char [] first = strOne.toCharArray();
		char [] second = strTwo.toCharArray();

		Arrays.sort(first);
		Arrays.sort(second);

		return Arrays.equals(first, second);
	}

	private static void checkAnagram(String strOne, String strTwo) {
		System.out.println("Check whether two strings are anagram of each other?");
		System.out.println("Strings: '" + strOne +"' and '" + strTwo + "'");
		if(isAnagram(strOne, strTwo)) {
			System.out.println("The two strings are anagram of each other");
		} else {
			System.out.println("The two stirngs are not anagram of each other");
		}
	}	

	public static void main(String... args) {
		String strOne = "baa";
		String strTwo = "bee";
		checkAnagram(strOne, strTwo);
	}
}
