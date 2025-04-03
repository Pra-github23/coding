class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        Map<String, Integer> map = new HashMap<>();
        long area = 0;
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        
        for(int i =0; i<rectangles.length; i++){

            int a = rectangles[i][0];
            int b = rectangles[i][1];
            int c = rectangles[i][2];
            int d = rectangles[i][3];

            x1 = Math.min(x1, a);
            y1 = Math.min(y1, b);
            x2 = Math.max(x2, c);
            y2 = Math.max(y2, d);

            area += (c-a)*(d-b);
            
            if(map.get(""+a+b) == null)map.put(""+a+b, 1);
            else map.remove(""+a+b);

            if(map.get(""+c+b) == null)map.put(""+c+b, 1);
            else map.remove(""+c+b);

            if(map.get(""+c+d) == null)map.put(""+c+d, 1);
            else map.remove(""+c+d);

            if(map.get(""+a+d) == null)map.put(""+a+d, 1);
            else map.remove(""+a+d);
           

        }
        if(map.size() != 4 || map.get(""+x1+y1) == null || map.get(""+x2+y1) == null || map.get(""+x2+y2) == null || map.get(""+x1+y2) == null) return false;

        if(area != (x2-x1) * (y2-y1))return false;

        return true; 
    }
}   
