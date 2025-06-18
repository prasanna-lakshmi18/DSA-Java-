class Intersection {
    public int[] intersection(int[] num1, int[] num2) {
        int n=num1.length;
        Set<Integer> arr=new HashSet<>();
        Set<Integer> arr_set=new HashSet<>();
        for(int i=0;i<num2.length;i++){
            arr_set.add(num2[i]);
        }
        for(int i=0;i<n;i++){
            if(arr_set.contains(num1[i])){
                arr.add(num1[i]);
            }
        }
        int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}