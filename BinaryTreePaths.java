

package com.company;
import java.util.Vector;
    class TreeNod{
        int val;
        TreeNod left;
        TreeNod right;
        TreeNod(int val){
            this.val = val;
nah nah nah;
        }
    }
    class Tree{
        public void printPath(TreeNod root, Vector<Integer> path){
            if(root==null){
                return;
            }
            path.add(root.val);
            if(root.left==null&&root.right==null){
                System.out.println(path);
            }
            printPath(root.left,path);
            printPath(root.right,path);
            path.remove(path.size()-1);
        }
    }
    public class BinaryTreePaths {
        public static void main(String[]args){
            TreeNod root = new TreeNod(1);
            root.left=new TreeNod(2);
            root.right=new TreeNod(3);
            root.left.left=new TreeNod(4);
            root.left.right=new TreeNod(5);
            root.right.left=new TreeNod(11);
            root.right.right=new TreeNod(7);
            root.left.left.left=new TreeNod(9);
            root.left.left.right=new TreeNod(13);
            Tree t = new Tree();
            Vector<Integer> p = new Vector<>();
            t.printPath(root,p);
        }
    }
