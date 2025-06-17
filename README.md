## 🟢 Easy Challenges

- [ ] Reverse a String  
  *Given a string, return its reverse.*  
  _Hint: Consider using StringBuilder or converting to a character array._

- [ ] Check for Palindrome  
  *Given a string, determine if it's a challenges.palindrome (reads the same forwards and backward). Ignore spaces and case.*  
  _Hint: Two-pointer approach from both ends._

- [ ] Find the Maximum Element in an Array  
  *Given an array of integers, find the largest element.*  
  _Hint: Simple iteration._

- [ ] Implement a Stack using an Array  
  *Create a Stack class with push, pop, peek, and isEmpty methods, backed by a fixed-size array. Handle overflow/underflow.*

- [ ] Implement a Queue using an Array  
  *Create a Queue class with enqueue, dequeue, peek, and isEmpty methods, backed by a fixed-size array. Consider circular arrays for efficiency.*

- [ ] Linear Search  
  *Given an array and a target value, find the index of the target using linear search.*

- [ ] Binary Search  
  *Given a sorted array and a target value, find the index of the target using binary search.*  
  _Important: Understand the preconditions for binary search._

- [ ] Count Occurrences of a Character  
  *Given a string and a character, count how many times that character appears in the string.*

Here’s your **Medium** and **Hard** DSA challenges formatted as Obsidian checkboxes, with rewritten and clearer guidance:

---

## 🟠 Medium Challenges

* [ ] **Implement a Singly Linked List**
  Create a `SinglyLinkedList` class with the following methods:

  * `addNode(value)`: Add a node to the end
  * `deleteNode(value/index)`: Remove a node by value or index
  * `search(value)`: Check if a value exists
  * `traverse()`: Print or return all nodes
  * `reverse()`: Reverse the entire list
    *Practice building the structure and understanding pointer manipulation.*

* [ ] **Find the Middle of a Linked List**
  Given the head of a singly linked list, return the middle node.
  If there are two middles, return the second.
  *Hint: Use two pointers—one moves one step at a time, the other two steps.*

* [ ] **Detect a Cycle in a Linked List**
  Check if a cycle (loop) exists in a singly linked list.
  *Hint: Floyd’s Cycle Detection Algorithm (Fast and Slow pointers).*

* [ ] **Merge Two Sorted Arrays**
  Given two sorted arrays, merge them into a single sorted array **without using built-in sort**.
  *Hint: Use two pointers to compare and merge.*

* [ ] **Implement QuickSort or MergeSort**
  Choose one efficient sorting algorithm and implement it from scratch.
  *Understand how divide-and-conquer works and the difference in performance.*

* [ ] **Balanced Parentheses Validator**
  Given a string of parentheses `()[]{}`, check if they are properly balanced and nested.
  *Hint: Use a Stack to push opening brackets and pop them when closing ones appear.*

* [ ] **Implement a Binary Search Tree (BST)**
  Create a `BST` class with methods:

  * `insert(value)`
  * `delete(value)`
  * `search(value)`
  * Traversals: `inorder`, `preorder`, `postorder`
    *Get used to recursion and tree-based operations.*

* [ ] **Level Order Traversal of a Binary Tree**
  Print the tree level by level (also known as BFS for trees).
  *Hint: Use a Queue to traverse each level.*

* [ ] **Check for Anagrams**
  Given two strings, determine if they are anagrams (same characters with same counts).
  *Hint: Count characters using arrays or hashmaps, or sort both strings and compare.*

* [ ] **Find the Kth Smallest Element in an Array**
  Given an array and a number `k`, return the kth smallest element.
  *Hint: Use QuickSelect for optimal performance. Alternatively, use a Min-Heap or sort the array (less efficient).*

---

## 🔴 Hard Challenges

* [ ] **Implement Dijkstra’s Algorithm**
  Given a graph, find the shortest distance from a source node to all other nodes.
  *Hint: Use a Priority Queue (Min-Heap) to efficiently get the next closest node.*

* [ ] **Graph Traversal (BFS and DFS)**
  Implement both traversal techniques:

  * BFS: Use a Queue
  * DFS: Use a Stack or Recursion
    *Practice on both connected and disconnected graphs.*

* [ ] **Implement an LRU Cache**
  Design a cache that removes the least recently used item when full.
  *Hint: Use a HashMap for O(1) access and a Doubly Linked List to maintain usage order.*

* [ ] **Longest Common Subsequence (LCS)**
  Find the length of the longest sequence common to both strings (not necessarily contiguous).
  *Hint: Use Dynamic Programming with a 2D array.*

* [ ] **0/1 Knapsack Problem**
  Given weights and values, find the best combination to get max value without exceeding weight limit.
  *Hint: Use a DP table where rows are items and columns are weights.*

* [ ] **N-Queens Problem**
  Place N queens on an N×N board so that no two attack each other.
  *Hint: Backtracking with column and diagonal checks.*

* [ ] **Sudoku Solver**
  Fill an incomplete Sudoku board so it becomes valid.
  *Hint: Backtracking with pruning invalid choices early.*

* [ ] **Find Median from Data Stream**
  Continuously add numbers and efficiently return the current median.
  *Hint: Use two heaps — a max-heap for the left side and a min-heap for the right.*

---


