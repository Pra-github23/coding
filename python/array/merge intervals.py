class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:

        intervals.sort(key = lambda x : x[0])

        res = []
        r = []
        r.append(intervals[0][0])
        r.append(intervals[0][1])
        res.append(r)

        for i in range(1,len(intervals)):

            num = res[len(res)-1][1]

            if num >= intervals[i][0]:
                row = len(res)-1
                res[row][0] = min(res[row][0],intervals[i][0])
                res[row][1] = max(res[row][1],intervals[i][1])
            else:
                t = []
                t.append(intervals[i][0])
                t.append(intervals[i][1])
                res.append(t)
        
        return res
           

        
