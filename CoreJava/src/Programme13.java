
public class Programme13 {
 
	public static int FindIndex(int[] array,int element) {
		for (int i = 0; i < array.length; i++) {
	         if (array[i] == element) {
	            return i;
	         }
	      }
	      return -1; 
	   }

	   public static void main(String[] args) {
	      int[] array = {1, 2, 3, 4, 5};
	      int element = 5;
	      int index = FindIndex(array, element);
	      System.out.println("Index of element " + element + ": " + index);
	   }
	
	}
 

