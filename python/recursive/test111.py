class Printer:
    def arrayPrint(self, arr, n):
        # write code here
        res = []
        row = [[0,n-1-i] for i in range(n)]
        col = [[i,0] for i in range(n)]
        
        for e in row:
            while(e[0] < n and e[1] < n):
                res.append(arr[e[0]][e[1]])
                e[0] = e[0] + 1 
                e[1] = e[1] + 1
        for e in col:
            if e[0] == 0 and e[1] == 0:
                continue
            while(e[0] < n and e[1] < n):
                res.append(arr[e[0]][e[1]])
                e[0] = e[0] + 1 
                e[1] = e[1] + 1
        return res

arr = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
n = 4
p = Printer()
res = p.arrayPrint(arr,n)
print(res)