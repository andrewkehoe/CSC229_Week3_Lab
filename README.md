## Question 1
See the comments on [NewClass](https://github.com/andrewkehoe/CSC229_Week3_Lab/blob/master/src/main/java/com/mycompany/week3_lab/NewClass.java) for the full explanation.

## Question 2
You can determine the heavy bag by giving each bag a number. Number each bag 1-20, then take that number of M&Ms from it. Take 1 from Bag 1, Take 2 from Bag 2... etc. 

At this point, weigh the amount of M&Ms, we’ll call this w.  

To eliminate the 1.0 gram pieces, we can subtract 210g from w, because the total amount of M&Ms from all 20 bags was 210, and each of them is 1.0 gram. The remainder is the difference in the weight of the 1.1g pieces. This difference is 0.1g. Therefore, if we multiply w by 10 now, we will then get the number of the heavy bag. 

In one formula... this can be represented as n = 10*(w-210), where n is the bag number and w is the weight. 

_________________

Let’s test this: say we numbered all the bags, and upon weighing, we get 211.3g.  

Subtract 210, get 1.3g, multiply by 10. The heavy bag must be #13. 
