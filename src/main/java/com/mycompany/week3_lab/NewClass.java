
package com.mycompany.week3_lab;

public class NewClass {
    /* Computing Big O Notation - Andrew Kehoe CSC229
        In order to compute the efficiency of this algorithm, we have to determine the amount of steps.
    */
    int getLargest(int[] nmList ){
        int max= nmList [0]; //Step 1 is declaring this integer.
        int indx = 0;        //Step 2 is declaring another integer.
        
        //At this point, we begin a while loop...
        //It goes for as long as nmList.length is, which is "n".
        while( indx< nmList.length ) { //Every while test runs "n" times.
            if (nmList [indx] > max){  //Every if test also runs "n" times.
                    max= nmList [indx];//Every definition of max also runs a maximum of "n" times, worst case scenario.
              }
            indx++; //Every addition runs "n" times.
        }
        return max; //Finally, the algorithm returns 1 time.
    } //Therefore, the amount of steps is 3 constant, and 4n, for as big as data "n" is. It is LINEAR.
      //In other words, there are 3+4n steps.
    
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        int[] arr = { 3, 6, -1, 10, 15,-8};
        int mx = nc.getLargest(arr);
        System.out.println("Th max is "+ mx);
    }
}
