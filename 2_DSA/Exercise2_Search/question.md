
question -- Exercise 2: E-commerce Platform Search Function
Scenario: 
You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.
Steps:
1.	Understand Asymptotic Notation:
o	Explain Big O notation and how it helps in analyzing algorithms.
o	Describe the best, average, and worst-case scenarios for search operations.
2.	Setup:
o	Create a class Product with attributes for searching, such as productId, productName, and category.
3.	Implementation:
o	Implement linear search and binary search algorithms.
o	Store products in an array for linear search and a sorted array for binary search.
4.	Analysis:
o	Compare the time complexity of linear and binary search algorithms.
o	Discuss which algorithm is more suitable for your platform and why.
---------------------------------------------------------------------

The Linear Search algorithm checks each element one by one until the target is found or the array ends. It is simple to implement and works on both sorted and unsorted data, but its time complexity is O(n) in the average and worst cases.

The Binary Search algorithm works only on sorted arrays. It repeatedly compares the target with the middle element and eliminates half of the remaining search space, making it much faster with a time complexity of O(log n). For large datasets, such as products in an e-commerce platform, Binary Search is generally preferred because it significantly reduces the number of comparisons.

Key Idea: Linear Search checks every element; Binary Search divides the search space in half.