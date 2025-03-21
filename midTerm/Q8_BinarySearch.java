package midTerm;

/*
Q:-8 MEDIUM Binary Search.
Given an array of integers nums which is sorted in ascending order, and
an integer target, write a function to search target in nums. If target
exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
Constraints:
1 <= nums.length <= 104 -104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.
 */
public class Q8_BinarySearch {
    public static int search(int arr[],int target){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[]={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(arr1,target));
    }
}
