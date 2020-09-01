a = [[2],
     [3,4],
     [6,5,7],
     [4,1,8,3]]

def _dfs(arr, i, j, path):
    if i == len(arr) - 1:
        path = path + str(arr[i][j]) + ' #'
        print(path)
        return 0  

    path = path + str(arr[i][j]) + '->'

    _dfs(arr, i+1, j, path)
    _dfs(arr, i+1, j+1, path)

    return 0

_dfs(a, 0, 0, '')