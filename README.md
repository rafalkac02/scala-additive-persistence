# Additive Persistence

### Description
Calculate the [additive persistence](https://mathworld.wolfram.com/AdditivePersistence.html) of a number, defined as how many loops you have to do summing its digits until you get a single digit number. Take an integer N:
1. Add its digits
2. Repeat until the result has 1 digit

The total number of iterations is the additive persistence of N.

Your challenge today is to implement a function that calculates the additive persistence of a number.

### Examples
```
13 -> 1
1234 -> 2
9876 -> 2
199 -> 3
```
---
Credits: [Reddit post](https://www.reddit.com/r/dailyprogrammer/comments/akv6z4/20190128_challenge_374_easy_additive_persistence/)
