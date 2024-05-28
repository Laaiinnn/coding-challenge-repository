# Problem Set 1: Palindrome Pairs
## Problem Description
Given a list of unique words, your task is to find all pairs of distinct indices (i, j) in the list so that
the concatenation of the two words, i.e., words[i] + words[j], forms a palindrome.
## Solution Overview
Palindrome Check: Use a helper function to check if a string is a palindrome (reads the same forwards and backwards).
Mapping Words: Store each word and its index in a HashMap for quick look-up.
Forming Pairs:
- For each word, split it into two parts at all possible positions.
- Check if the left part is a palindrome and if the reversed right part exists in the map.
- Check if the right part is a palindrome and if the reversed left part exists in the map (excluding the case where the split is at the end to avoid duplicates).
- Add valid pairs of indices to the result list.
