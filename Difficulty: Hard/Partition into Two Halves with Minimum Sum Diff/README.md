<h2><a href="https://www.geeksforgeeks.org/problems/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum-set-2/1">Partition into Two Halves with Minimum Sum Diff</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p class="PDq2pG_selectionAnchorContainer" data-start="130" data-end="341"><span style="font-size: 14pt;">Given an array <strong>arr[]</strong> of <strong>n</strong> integers, divide it into two subsets <strong data-start="191" data-end="197">s1</strong> and <strong data-start="202" data-end="208">s2</strong> such that the difference between the sums of the two subsets is minimized. Return the minimum<strong data-start="363" data-end="394"> </strong>possible difference.</span></p>
<p data-start="343" data-end="406"><span style="font-size: 14pt;">The sizes of the subsets must satisfy the following conditions:</span></p>
<ul>
<li><span style="font-size: 14pt;"> If<strong> </strong>n is even, both subsets must contain exactly n/2 elements. </span></li>
<li><span style="font-size: 14pt;"> If n is odd<strong>,</strong> one subset must contain (n-1)/2 elements and the other must contain<strong> </strong>(n+1)/2 elements.</span><span style="font-size: 14pt;"> </span></li>
<li><span style="font-size: 14pt;"> The difference between two subsets is defined as abs(sum(s1) - sum(s2)).</span></li>
</ul>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [3, 4, 5, -3, 100, 1, 89, 54, 23, 20]
<strong>Output: </strong>0
<strong>Explanation: </strong>One optimal partition is s1 = [3, 5, -3, 89, 54] and </span><span style="font-size: 14pt;">s2 = [4, 100, 1, 23, 20]. <br>Both subsets contain 5 elements, preserve the relative ordering of elements from the original array, and each has a sum of 148.<br>Hence, the minimum possible difference between their sums is 0.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [2, 5, 8]
<strong>Output: </strong>1
<strong>Explanation:</strong> One optimal partition is s1 = [2, 5] and s2 = [8]. <br>The subsets contain 2 and 1 elements respectively, satisfying the required sizes for an odd-length array. <br>Their sums are 7 and 8, so the minimum possible difference is 1.</span></pre></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;