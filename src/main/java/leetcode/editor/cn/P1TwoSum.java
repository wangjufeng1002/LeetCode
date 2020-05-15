//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//Java：两数之和
public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        int[] nums = {-1, -2, -3, -4, -5};
        int[] ints = solution.twoSum(nums, -8);
        System.out.println(ints[0] + "," + ints[1]);
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //1----------第一次 解答 -----------------
            /*int[] result = new int[2];
            Map<Integer, ArrayList<Integer>> map = new HashMap<>(nums.length);
            Map<String, Integer> map2 = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.get(nums[i]) == null || map.get(nums[i]).size() <= 0) {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(i);
                    map.put(nums[i], integers);
                } else {
                    ArrayList<Integer> indexs = map.get(nums[i]);
                    indexs.add(i);
                    map.put(nums[i], indexs);
                }
                map2.put(nums[i] + "&" + i, target - nums[i]);
            }
            ArrayList<Integer> indexs = null;
            Set<Map.Entry<String, Integer>> entries = map2.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                indexs = map.get(entry.getValue());
                if (indexs != null && indexs.size() !=0) {
                    for(Integer index: indexs){
                        String s = entry.getKey().split("&")[1];
                        if(Integer.parseInt(s) != index){
                            result[0]=index;
                            result[1]=Integer.parseInt(s);
                            return  result;
                        }
                    }
                }
            }
            return result;*/
            //1----------第一次 解答 END-----------------

            //2------------第二次解答--------------------------
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    if (i != map.get(target - nums[i])) {
                        result[0] = map.get(target - nums[i]);
                        result[1] = i;
                        return result;
                    }
                }
                map.put(nums[i], i);
            }
            return result;

            //2---------------第二次次 解答 END-----------------------
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}