# algo

## 1. 数据结构与算法
数组，链表，（串和序列）
堆，栈，队列
树，图
排序，搜索
贪心，回溯，动态规划

堆：一种完全二叉树，任意节点大于左右孩子（大顶堆）
树：二叉树，DFS，BFS


## 1 排序与查找
### 1 排序
平均，最坏，最好，空间复杂度，是否稳定
* 插入排序 O(n^2)   O(n^2)   O(n)     O(1)    稳定
* 快速排序 O(nlogn) O(n^2)   O(nlogn) O(logn) 不稳定
* 堆排序     O(nlogn) O(nlogn) O(nlogn) O(1)    不稳定
* 归并排序 O(nlogn) O(nlogn) O(nlogn) O(n)    稳定

### 1 查找
* 二分查找

## 2 Leetcode
### 3.数组
* 283 [Move Zeros](https://github.com/SheldonWong/algo/blob/master/src/com/gege/3-array/Leetcode283v3.java)
* 27 [Remove Element](https://github.com/SheldonWong/algo/blob/master/src/com/gege/3-array/Leetcode27.java)
* 26 Remove Duplicates from Sorted Array
* 80 Remove Duplicates from Sorted Array II
* 75 Sort Colors 计数排序
* 88 Merge Sorted Array
* 215 Kth Largest Element in an Array
* 167 Two Sum II - Input array is sorted
* 125 Valid Palindrome 回文字符串(虽然思想简单，但是坑很多，注意题干，考虑字符数字，忽略大小写)
* 344 Reverse String 翻转字符串(先将字符串转成字符数组，再进行操作，最后转回字符串String.valueOf())
* 345 Reverse Vowels of a String 元音字母翻转
* 11 Container With Most Water(注意搜索的时候往area可能变大的方向搜索)
* 209 Minimum Size Subarray Sum(双索引-滑动窗口)
* 3 Longest Substring Without Repeating Characters(双索引-滑动窗口)
* 438 Find All Anagrams in a String(双索引-滑动窗口)
* 76 Minimum Window Substring(双索引-滑动窗口)


### 4.哈希表
* 349 Intersection of Two Arrays
* 350 Intersection of Two Arrays
* 242 Valid Anagram
* 202 Happy Number
* 290 Word Pattern
* 205 Isomorphic Strings
* 451 Sort Characters By Frequency
* 447 Number of Boomerangs
* 454 4Sum II
* 217 Contains Duplicate
* 219 Contains Duplicate II

### 5.链表
* 206 Reverse Linked List

### 6.栈和队列
#### 栈部分 
* 20 括号匹配
* 150 逆波兰表达式
* 71 简化路径
* 144 二叉树前序遍历
* 94 二叉树中序遍历
* 145 二叉树后续遍历
* 341 展平嵌套列表

#### 队列部分
* 102 二叉树层次遍历
* 107 二叉树层次遍历II
* 103 二叉树之字形遍历
* 199 二叉树右侧视图
* 279 完美平方数
* 127 单词最短变化路径
* 126 单词所有变换路径（未完成）
* 347 TopK
* 23 将k个有序数组归并为一个有序数组（未完成）

### 7.二叉树和递归
* 104 求一棵二叉树的最大深度
* 111 求一棵二叉树的最低深度，从根到叶子的最短路径长度
* 226 翻转二叉树
* 100 SameTree
* 101 对称树
* 222 完全二叉树的节点个数
* 110 判断平衡二叉树
* 112 PathSum
* 404 所有左叶子的和
* 437 Path III
* 235 Lowest Common Ancestor of a Binary Search Tree  
* 257 Binary Tree Paths

### 8. 递归与回溯
* 17 返回数字能表示的字母组合
* 46 全排列
* 77 给出n和k，从n个数字中取出k个数字的组合列表
* 79 word search(未完成)
* 200 Number of islands(未完成)
* 51 n后问题(未完成)

### 9. 动态规划
* 70 爬台阶
* 343 将整数划分成若干个数的和，使得这些数乘积最大
* 198 House Robber,只能偷取不相邻的房子，问最大能偷取多少价值
* 213 House Robber II,环(未完成)
* 337 House Robber III,二叉树(未完成)
* 309 Best Time to Buy and Sell Stock with Cooldown(未完成)
* 经典问题-01背包问题，优化(未完成)
* 416 Partition Equal Subset Sum(转化成背包问题)
* 300 Longest Increasing Subsequence
* 经典问题，单源最短路径Dijkstra


