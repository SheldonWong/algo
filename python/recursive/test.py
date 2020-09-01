a = [1,2,3]


def perm(arr,index,nums):
    if index == nums - 1:
        print('index=',str(index),'return:')
        print(arr)
    else:
        for i in range(index,nums):
            print('swap before',index,i,arr)
            arr[index],arr[i] = arr[i],arr[index]
            perm(arr, index+1, nums)           
            arr[i],arr[index] = arr[index],arr[i]
            print('swap q',index,i,arr)
perm(a,0,len(a))