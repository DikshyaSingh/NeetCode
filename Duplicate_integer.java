import java.util.HashSet;
import java.util.Scanner;

class Duplicate_integer {
    public boolean duplicateInteger (int[] nums){
        HashSet<Integer> numb =new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numb.contains(nums[i]))
                return true;
            numb.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicate_integer di = new Duplicate_integer();
        int[] nums = {1,2,3,4};
        if (di.duplicateInteger(nums))
        {
            System.out.println("Duplicate integer found!");
        } else {
            System.out.println("No duplicate integers.");
        }
    }
}
