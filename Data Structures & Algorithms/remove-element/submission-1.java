class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> temp = new ArrayList<>();

        for (int num : nums) {
            if (num != val) {
                temp.add(num);
            }
        }

        int i = 0;
        for (int num : temp) {
            nums[i] = temp.get(i);
            i++;
        }

        return temp.size();
    }
}