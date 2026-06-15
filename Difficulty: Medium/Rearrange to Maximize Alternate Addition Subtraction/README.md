<h2><a href="https://www.geeksforgeeks.org/problems/reaching-the-heights1921/1">Rearrange to Maximize Alternate Addition Subtraction</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an&nbsp;array <strong>arr[]</strong>, rearrange its elements to maximize the the final value obtained with the following operations starting with value 0.</span></p>
<ul>
<li><span style="font-size: 18px;">Values at <strong>event </strong>indexes are added.</span></li>
<li><span style="font-size: 18px;">Values at odd indexes are <strong>subtracted</strong>.</span></li>
</ul>
<p><span style="font-size: 18px;">Return the rearranged array that maximizes the final floor after all elements have been processed.</span></p>
<p data-start="42" data-end="205"><span style="font-size: 14pt;">If multiple rearrangements are possible, prioritize larger values at even indexes and smaller values at odd indexes.</span></p>
<p><span style="font-size: 14pt;"> </span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input :</strong> arr[] = [2, 3, 4, 5]
<strong>Output :</strong> [5, 2, 4, 3]
<strong>Explanation: </strong>The rearranged array is [5, 2, 4, 3].
This arrangement maximizes the final value as 5 - 2 + 4 - 3 = 4. Other arrangements such as [5, 3, 4, 2], [4, 3, 5, 2], and [4, 2, 5, 3] also achieve the same value. However, [5, 2, 4, 3] is preferred because it places larger values at even indexes and smaller values at odd indexes as early as possible.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 1]<strong>
Output: </strong>[1, 1]<strong><br></strong><strong>Explanation: </strong>The final value is: 0 + 1 - 1 = 0
Since all elements are identical, every rearrangement produces the same result. Therefore, the original arrangement is returned.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints: <br></strong></span><span style="font-size: 18px;">1 ≤ n ≤ 10<sup>5</sup><br>1&nbsp;≤ arr[i]&nbsp;≤ 10<sup>9</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Sorting</code>&nbsp;<code>Misc</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;