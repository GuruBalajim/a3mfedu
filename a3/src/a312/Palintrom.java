package a312;

public class Palintrom {
	public static void main(String[] args) {
        String[] words = {"abc","bcd","aba","cfg","madam"};
        String palindrome = findFirstPalindrome(words);
        System.out.println("First palindrome word: " + palindrome);
    }

    public static String findFirstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left <= right) {
            if (word.charAt(left) == word.charAt(right)) {
            	left++;
	            right--;
            }
            else {
            	return false;
	            }	            
        }
        return true;
    }
}

