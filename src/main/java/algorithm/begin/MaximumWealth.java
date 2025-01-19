package algorithm.begin;

/**
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 */
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        MaximumWealth maximumWealth = new MaximumWealth();
        int result = maximumWealth.maximumWealth(accounts);
        System.out.println(result);
    }

    public int maximumWealth(int[][] accounts) {
        int property = 0;
        int max_property = 0;
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                property += accounts[i][j];
                //System.out.println(property);
            }
            if(property > max_property) {
                max_property = property;
                System.out.println("Max property: " + max_property);
            }
            property = 0;
        }
        return max_property;
    }
}
