public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int majorityElement = -1;
        
        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count = 1;
            } else if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        
        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }
        
        if (count > nums.length / 2) {
            return majorityElement;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority element: " + majorityElement);
    }
}
