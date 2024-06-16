class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer[] numsUno = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        Integer[] numsDos = Arrays.stream(nums2).boxed().toArray(Integer[]::new);
        list.addAll(Arrays.asList(numsUno));
        list.addAll(Arrays.asList(numsDos));
        Collections.sort(list);
        int size = list.size();
        return size % 2 == 1 ? list.get(size/2) : ((list.get(size/2 - 1) + list.get(size/2)) / 2.0);
    }
}
