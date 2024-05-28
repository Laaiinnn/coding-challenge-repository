# Problem Set 2: Valid Parentheses
## Problem Description
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
valid. An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
## Solution Overview

Goal: Determine if the input string of brackets is valid.

Approach:
1. Stack Usage: Use a stack to keep track of opening brackets.
2. Matching Brackets: For every closing bracket, check if it matches the top opening bracket from the stack.
3. Validation:
- Iterate through the string:
  - Push opening brackets onto the stack.
  - For closing brackets, pop from the stack and check for a match.
- After the loop, check if the stack is empty to ensure all brackets were properly closed.
