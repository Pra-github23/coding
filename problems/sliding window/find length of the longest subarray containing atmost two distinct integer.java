
class Solution {
    public static int totalElements(Integer[] arr) {
        // code here
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int j =0;
        
        for(int i =0;i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            
            while(map.size() > 2 && j < i){
                map.put(arr[j], map.getOrDefault(arr[j],0)-1);
                if(map.get(arr[j]) == 0)map.remove(arr[j]);
                j++;
            }
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
