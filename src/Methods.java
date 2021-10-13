import java.util.Arrays;
import java.util.HashMap;

public class Methods {

	public static boolean isUnique(String str) {
		
		for (int i = 0; i < str.length()-1; i++) {
			
			for (int j = i; j < str.length()-1; j++) {
				
				if (str.charAt(i) == str.charAt(j+1)) {
					return false;
				}
			}
			
		}
		
		return true;
		
	}
	
	public static boolean isUnique(String str, String approach) {
		
		
		
		 boolean[] arr = new boolean[128];
		 
		 for (boolean value: arr) {
			 value = false;
		 }
		 
		 for (int i = 0; i < str.length(); i++) {
			 int asciChr = str.charAt(i);
			 if (arr[asciChr]) {
				 return false;
			 }
			 arr[asciChr] = true;
		 }
		 
		 return true;
	}
	
	public static boolean isPermutation (String str1, String str2) {
	  
	  return sort(str1).equals(sort(str2));
	  
	}
	
	

	public static String sort(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	public static int[] sort(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	
	public static int[] computeBestPair(int[] arr1, int[] arr2, int target) {
		int[] bestPair = {-1,-1};
	    int pseudoMiddleIndex;
	    int leftIndex;
	    int rightIndex;
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    
	 /*   if (arr1.length % 2 == 0) {
	    	rightIndex = arr1.length/2;
	    	leftIndex = rightIndex -1;
	    }
	    else {*/
	    	pseudoMiddleIndex = arr1.length/2;
	   // }
	    	
	    if (arr1[pseudoMiddleIndex] + arr2[pseudoMiddleIndex] > target) {
	    	
	    	for (int i = 0; i <= pseudoMiddleIndex; i++) {
	    		
	    		for (int j = 0; j <arr2.length; j++) {
	    			if (Math.abs(target-(arr1[i] + arr2[j])) < Math.abs(target -sumArray(bestPair))) {
	    				bestPair[0] = arr1[i];
	    				bestPair[1] = arr2[j];
	    			}
	    			
	    			
	    		}
	    		
	    		
	    	}
	    }
	    
		return bestPair;
	}
	
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
		
	}
	
	public static void  URLify(char[] str, int trueLength) {
		int spaceCount = 0;
		
	    for (int i = 0; i < trueLength; i++) {
	    	if (str[i] == ' ') {
	    		spaceCount++;
	    	}
	    }
	    
	    int index = trueLength + spaceCount*2;
	    
	    
	    for (int i = trueLength-1; i >=0; i--) {
	    	
	    	if (str[i] == ' ') {
	    		str[index - 1] = '0';
	    		str[index - 2] = '2';
	    		str[index - 3] = '%';
	    		index -=3;
	    	} else {
	    		str[index - 1] = str[i];
	    		index--;
	    	}
	    	
	    }
	    
	    System.out.println(str);
	
	  
	
    }
	
	public static boolean isPalindromePermutation(String word) {
		word = word.replace(" ", "");
		char[] wordArray = word.toLowerCase().toCharArray();
		int[] characterCount = new int[128];
		int count = 0;
		
		for (int i = 0; i < wordArray.length; i++) {
			characterCount[wordArray[i]]++;
		}
		
		
		for (int i = 0; i < characterCount.length; i++) {
			count += characterCount[i] % 2; 
		}
		
		return count <= 1;
	}
	
	/*public static boolean isPalindromePermutationByHash(String word) {
		word = word.replace(" ", "");
		char[] wordArray = word.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for (Character chr : hashMap.keySet()) {
			
			Integer charCount =hashMap.get(chr);
			
			
		}
		
	
	
	}*/
	
	public static boolean isOneAway(String str1, String str2) {
		
		if (Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}
		
		boolean[] flipsArray = new boolean[str1.length() >= str2.length() ? str2.length() : str1.length()];
		
		for (int  i = 0; i < flipsArray.length; i++) {
			
			flipsArray[i] = str1.charAt(i) == str2.charAt(i);
			
		}
		
		for (int i = 1; i < flipsArray.length; i++) {
			
			 if (!(flipsArray[0] || flipsArray[i])) {
				 return false;
			 }
			
			
		}
		
		return true;
	}
	
	
	public static boolean isUniqueUsingBitWise(String str) {
		
		int check = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			int charToInt = str.charAt(i) - 'a';
			
			if ((check & (1 << charToInt)) > 0) {
				return false;
			}
			
			check |= (1 << charToInt);
		}
		
		
		return true;
	
	}
	
	public static String compressString (String word) {
       char[] wordArr = word.toCharArray();
	  int[] charCount = new int[128];
	   String newString = "";
	   int countConsec = 0;
	   for (int i = 1; i < wordArr.length; i++) {
			//charCount[wordArr[i-1]]++;
		    countConsec++;
		  if (wordArr[i] != wordArr[i-1]) {
			  
			  newString  += wordArr[i-1] + "" +  countConsec;
			  countConsec = 0;
			 
		  } else if (wordArr[i] == wordArr[i-1] && i == wordArr.length-1) {
		  countConsec++;
		  }
		 
		}
		
	   newString  += wordArr[wordArr.length-1] + "" +  countConsec;
		return newString; 
	
	}
	
	
	public static boolean rotate(int[][] matrix) {
		
		if (matrix.length == 0 || matrix[0].length != matrix.length) return false;
		
		int n = matrix.length;
		
		
		//transpose
		
		for (int i = 0; i < n; i++) {
			
			for (int j = i; j < n; i++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
				
				
			}
			
		}
		
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				 matrix[i][n - 1 - j] = matrix[i][j];
				
				
			}
		}
		
		
		
		
		
		
		
		return true;
	}
	
	
	public static void setRowsColumnsZero (int [][] matrix) {
		int matrixRows = matrix.length;
		int matrixColumns = matrix[0].length;
		//set row to zero
		
		rowLoop: for (int i = 0; i < matrixRows; i++) {
			
			for (int j = 0; j < matrixColumns; j++) {
				if (matrix[i][j] == 0) {
					for (int s = 0; s < matrixColumns; s++) {  
						matrix[i][s] = 0;
					
				    }
					
				continue rowLoop;
				}
				
			}
			
		}
		
		
		
	}
	
}