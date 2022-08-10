class Solution {
    
    
    public int minCostClimbingStairs(int[] cost) {
        int costSize = cost.length;
        int[] pay = new int[costSize];
        pay[0] = cost[0];
        pay[1] = cost[1];
        for (int i = 2; i < costSize; i++) {
            //System.out.println(i+": "+pay[i-1] + " " + pay[i-2] + " " + cost[i]);
            pay[i] = Math.min(pay[i-1], pay[i-2]) + cost[i];
        }
        return Math.min(pay[costSize-1], pay[costSize-2]);
    }
}