/*

10.  Find Intersection and Union of Two Arrays 
-  Find the intersection and union of two unsorted arrays. 

*/



class Que_10{
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};

        findIntersection(arr1, arr2);
        findUnion(arr1, arr2);
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // Move to the next element in arr1 once a match is found
                }
            }
        }
        System.out.println();
    }

    public static void findUnion(int[] arr1, int[] arr2) {
        System.out.print("Union: ");
        
        // Print all elements of arr1
        for(int num : arr1){
            System.out.print(num + " ");
        }
        
        // Print elements of arr2 only if they are not already in arr1
        for(int i = 0; i < arr2.length; i++){
            boolean found = false;
            for(int j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
    }
}