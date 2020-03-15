package mergesort;

/* Java program for Merge Sort */
class MergeSort { 
	
    public static void main(String[] args){
        
        int[] arrays = {12, 23, 67, 34, 1, 3, 4, 65, 43, 35,68};
        
        System.out.println("Before: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println("");
        arrays = mergeSort(arrays);
        System.out.println("After: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
    
    public static int[] mergeSort(int[] arrays){
        if(arrays.length <= 1) {
            return arrays;
        } else {
            int mid = arrays.length / 2;
            int[] left = new int[mid];
            int[] right;
            if (arrays.length % 2 == 0) {
                right = new int[mid];
            } else {right = new int[mid + 1];}
            for (int i = 0; i < mid; i++) {
                left[i] = arrays[i];}
            for (int i = 0; i < right.length; i++) {
                right[i] = arrays[mid + i];}  
            int[] result = new int[arrays.length];
            left = mergeSort(left);
            right = mergeSort(right);
            result = merge(left, right);
            return result;
        }
    }
    
    public static int[] merge(int[] left, int[] right){
        
        int[] result = new int[left.length + right.length];
        int leftChecker = 0, rightChecker = 0, resultChecker = 0;
        
        while (leftChecker < left.length || rightChecker < right.length){
            if (leftChecker < left.length && rightChecker < right.length) {
                if (left[leftChecker] < right[rightChecker]) {
                    result[resultChecker++] = left[leftChecker++];
                } else {
                    result[resultChecker++] = right[rightChecker++];
                }
            } else if (leftChecker < left.length ) {
                result[resultChecker++] = left[leftChecker++];
            } else if(rightChecker < right.length) {
                result[resultChecker++] = right[rightChecker++];
            }   
        }
        return result;     
    }
}

