class GFG {
    public static void main(String[] args) {
        //declare an Array of integers
        int[] arr;
        // allocating memory for 5 integers
        arr = new int[5];

        //initializw the first elements of the array.
        arr[0] = 10;
        //initialize the second elements of the array
        arr[1] = 20;

        //accessing the elements of the specific array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at indes " + i + " : " + arr[i]);
        }
    }
}