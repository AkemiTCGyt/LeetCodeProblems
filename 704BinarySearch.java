/*

public class BinarySearch {
    public int search(int[] nums, int target) {
        int indice = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                indice = i;
                break;
            }
        }
        return indice;
    }
}

*/

/* Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
*/

/* The most intuitive way to solve this problem is to:
1. Create a variable to hold the indice of the array. Defaulted to -1.
2. Search the array in order (L -> R) for the target
3. If the target is contained in the array, capture the indice.
4. Break the loop if this occurs.
5. Return the indice outside of the loop.
*/

/* However, this can be done via a binary search where you search both the left and the right side of the array for the target simultaneously.
1. Create a variable to hold the indice of the array. Defaulted to -1.
2. Search the array beginning from the middle. To search both sides simultaneously we can still use a while loop.
3. Make an int that tracks the beginning and the end point of the array which are start and end respectively.
4. Within the while loop, nums[end - midpoint] tracks if the target was hit on the LEFT side of the array.
5. Within the while loop, nums[start + midpoint] tracks if the target was hit on the RIGHT side of the array.
6. Increment the start and decrement the end with each run of the while loop respectively while end >= start.
7. If the loop breaks out without a match, return -1.
*/

public class BinarySearch {
    public int search(int[] nums, int target) {
        int midpoint = nums.length / 2;
        int start = 0; //tracks the starting point of the ptr
        int end = nums.length -1; //tracks the ending point of the ptr
        while (end >= start) {
            //check if the target is hit
            if (nums[end - midpoint] == target){
                return end - midpoint;
            } else if (nums[start + midpoint] == target) {
                return start + midpoint;
            }
            start++;
            end--;
        }
        return -1;
    }
}

