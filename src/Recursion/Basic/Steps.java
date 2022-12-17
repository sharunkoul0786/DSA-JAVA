package Recursion.Basic;

public class Steps {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int nums){
        return helper(nums,0);
    }
    private int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
