class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
       Set<Integer> set=new HashSet<>();
               Set<Integer> set1=new HashSet<>();
               for(int i: nums1) set.add(i);
                for(int i: nums2) set1.add(i);
               Set<Integer> set2=new HashSet<>(set);
                set.removeAll(set1);
                set1.removeAll(set2);
                list.add(new ArrayList<>(set));
                list.add(new ArrayList<>(set1));
        return list;
    }
}