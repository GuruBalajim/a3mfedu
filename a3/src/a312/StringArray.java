package a312;
	import java.util.ArrayList;
	import java.util.List;

	public class StringArray {

	    public static List<Integer> findIndicesOfCharacter(String[] words, char x) {
	        List<Integer> indices = new ArrayList<>();
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].indexOf(x) != -1) {
	                indices.add(i);
	            }
	        }
	        return indices;
	    }

	    public static void main(String[] args) {
	        String[] words = {"abc", "bcd", "aaaa", "cbc"};
	        char x = 'a';
	        List<Integer> output = findIndicesOfCharacter(words, x);
	        System.out.println(output);  
	}
	}

