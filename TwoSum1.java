public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer diff = (Integer)(target - nums[i]);
            if (hash.containsKey(diff)){
                int finalArray[] = {hash.get(diff), i};
                return finalArray;
            }
            hash.put(nums[i], i);
        }
        return null;
    }

    /*
    Problem: Given int[]nums and target, write a method that returns an array
    with the two indices in nums which add up to the target. There is only one solution
    for the array input.

    This can be done with brute force with a double for loop adding up to the target.

    I chose to make a hashmap which holds the current value of the loop, nums[i] as the key
    and its associated i as the value. I used a singular for loop for this.
    An Integer, diff, is used to track the current difference between
    target and the current nums[i] in the for loop. Then, the code checks whether or not
    any part of the hashmap contains the key, diff. If yes, a new array is created called finalArray
    which will contain the value of the hash at that key and the current indice, i. This is then
    returned for the solution.
     */
}
