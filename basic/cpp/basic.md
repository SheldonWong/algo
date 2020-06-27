## C++基本类型
- bool,char,int,float,double,

## C++容器
### 顺序容器
- vector
- list 双向链表
- deque
- queue
- priority_queue
- stack
### 关联容器
- set
- multiset
- map
- multimap

## vector
### 定义

```cpp
//定义int数组
vector<int> a;
vector<int> b(a);
vector<int> a(100); //a有100个值为0的元素
vector<int> a(100,6); //a有100个值为6的元素
//定义string数组
vector<string> a(100,"null");
vector<string> b(a.begin(),a.end());
//定义结构体数组
struct point{int x,y};
vector<point> a;
```
### 常用操作

```cpp
a.push_back(100); //尾部添加元素
a.size(); //元素个数
a.isEmpty(); //判断是否为空
a.insert(a.begin()+i,k); //在第i个元素前面插入k
a.insert(a.end,10,5); //尾部插入10个5
a.erase(a.begin()+i, a.begin+j); //删除区间[i,j-1]的元素
a.erase(a.begin()+2); //删除第三个元素
a.resize(n); 
a.clear();
reverse(a.begin(),a.end()); //翻转数组
sort(a.begin(),a.end()); //排序，从小到大
```

## stack
```cpp
stack<Type> s; //定义栈
s.push(item);
s.top();
s.pop();
s.size();
s.empty();
```

## queue
```cpp
queue<Type> q; //定义队列
q.push(item);
q.pop();  //删除队首元素
q.front(); //返回队首元素，但不删除
q.back();  // 返回队尾元素
q.size(); //返回元素个数
q.empty();  //检查队列是否为空
```

## set
```cpp
set<Type> A;
A.insert(item); //插入item
A.erase(item); //删除item
A.clear();
A.find(k);
A.lower_bound();
A.upper_bound();
A.size();
A.empty();
```

## map
```cpp
map<string,int> student; //存储学生的name和id
student["Tom"] = 15; //赋值
id = student["Tome"]; //查找
```

## sort
- sort可以用自定义的比较函数进行排序，也可以用系统自带的4种函数进行排序，即less(),grater(),less_equal(),great_equal()，默认使用less().
- example1:
```cpp
#include <bits/stdc++.h>
using namespace std;
bool my_less(int i,int j) { return i < j;}  //自定义小于
bool my_greater(int i,int j){ return i > j;} //自定义大于
int main(){
    vector<int> a = {3,7,2,5,6,8,5,4};
    sort(a.begin(), a.begin()+4); //对前四个排序， 输出 2，3，5，7，6，8，5，4
    sort(a.beign(), a.end());
    sort(a.begin(), a.end(), my_less);
    sort(a.begin(), a.end(), my_greater);
    for(int i=0; i < a.size(); a++){
        cout << a[i] << " ";
    }
    return 0;
}
```
- example2:
```cpp
struct Student {
    char name[256];
    int score;
}

bool compare(struct Student* a, struct Student* b){
    return a->score > b->score;
}

vector<struct Student*> list;

sort(list.begin(),list.end(), compare)
```

## next_permutation()

## 拓展，所占字节
- 所占字节
type:         ************size**************
bool:         所占字节数：1    最大值：1        最小值：0
char:         所占字节数：1    最大值：        最小值：?
signed char:     所占字节数：1    最大值：        最小值：?
unsigned char:     所占字节数：1    最大值：?        最小值：
wchar_t:     所占字节数：4    最大值：2147483647        最小值：-2147483648
short:         所占字节数：2    最大值：32767        最小值：-32768
int:         所占字节数：4    最大值：2147483647    最小值：-2147483648
unsigned:     所占字节数：4    最大值：4294967295    最小值：0
long:         所占字节数：8    最大值：9223372036854775807    最小值：-9223372036854775808
unsigned long:     所占字节数：8    最大值：18446744073709551615    最小值：0
double:     所占字节数：8    最大值：1.79769e+308    最小值：2.22507e-308
long double:     所占字节数：16    最大值：1.18973e+4932    最小值：3.3621e-4932
float:         所占字节数：4    最大值：3.40282e+38    最小值：1.17549e-38
size_t:     所占字节数：8    最大值：18446744073709551615    最小值：0
string:     所占字节数：24
type:         ************size**************
- typedef 别名
typedef int feet;
feet distance;