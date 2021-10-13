

class Node {
	int data;
	Node next;
	
	Node (int data) {
		this.data = data;
	}
	
}



public class Test {
    static int countNodes(Node head) {
    	
    	int count = 1;
    	do {
    		
    		head = head.next;
    		count++;
    	} while ( head.next != null);
    	
    	return count;
    	
    }
    
    static void removeDups(Node head) {
    	
    	while (head != null) {
    		
    		Node current = head;
    		Node next = head.next;
    		while (c  != null) {
    			Node next = current.next;
    			if (current.data == next.data) {
    				
    				//trim the pointer in next and have current point to next.next
    			}
    			
    			current = current.next;
    			
    		}
    		
    		
    	}
    	
    	
    	
    }
	public static void main(String[] args) {
		
		int[][] matrix = { {1,0,3},
				           {4,5,6},
		                   {7,8,9} 
				                 };
		Methods.setRowsColumnsZero(matrix);
		
		
		System.out.println(matrix[0][2]);
		
		Node head = new Node(1);
		Node nodeA = new Node(2);
		Node nodeB = new Node(3);
		Node nodeC = new Node(40);
		
		
		head.next = nodeA;
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		
		System.out.println(countNodes(head));
		
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
        System.out.println(Methods.isUnique("good"));
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime);
        
        startTime = System.nanoTime();
        System.out.println(Methods.isUnique("good", ""));
        elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime);
        
        System.out.println(Methods.isPermutation("good", "dogo"));
        
        int[] arr1 = {1, 5, 9, 11, 12};
        int[] arr2 = {3, 7, 10, 15, 18};
        
        int[] bestPair = Methods.computeBestPair(arr1, arr2, 12);
        System.out.println(bestPair[0] + ", " + bestPair[1]);
        char[] testArr = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        Methods.URLify(testArr, 13);
        
        int x = 'b' - 'a';
        
        //System.out.println(Methods.isPalindromePermutation("Tact Coa"));
        
        System.out.println(Methods.isOneAway("pale", "ple"));
        System.out.println(Methods.isOneAway("pales", "pale"));
        System.out.println(Methods.isOneAway("pale", "bale"));
        System.out.println(Methods.isOneAway("pale", "bae"));
        
        System.out.println(Methods.isUniqueUsingBitWise("ilovecoding"));
        System.out.println(Methods.compressString("aaabccaa"));
	}

}
