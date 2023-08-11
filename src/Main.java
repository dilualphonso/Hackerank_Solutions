public class Main {
    public static int maxCost(int[] cost, String[] labels, int dailyCount) {
        int ans = 0;
        int cur_cnt = 0;
        int cur_cost = 0;
        for (int i = 0; i < cost.length; i++) {
            cur_cost += cost[i];
            if (labels[i].equals("illegal")) {
                continue;
            }
            cur_cnt++;
            if (cur_cnt == dailyCount) {
                ans = Math.max(ans, cur_cost);
                cur_cnt = 0;
                cur_cost = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] cost = {10, 20, 5, 15, 25};
        String[] labels = {"legal", "illegal", "legal", "legal", "illegal"};
        int dailyCount = 2;
        int result = maxCost(cost, labels, dailyCount);
        System.out.println("Maximum cost: " + result);
    }
}