
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None

class Solution:
    # @param {TreeNode} root the root of the binary tree
    # @return {List[str]} all root-to-leaf paths
    def binaryTreePaths(self, root):
        # Write your code here
        path = ''
        res = []
        self.TreePathsHelper(root, path, res)
        return res

    def TreePathsHelper(self, root, path, res):
        if root is None:
            return
        path += str(root.val)
        if root.left is not None:
            self.TreePathsHelper(root.left, path + '->', res)
        if root.right is not None:
            self.TreePathsHelper(root.right, path + '->', res)
        if root.left is None and root.right is None:
            res.append(path)

root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)
root.right.left = TreeNode(6)
root.right.right = TreeNode(7)

s = Solution()
res = s.binaryTreePaths(root)
print(res)