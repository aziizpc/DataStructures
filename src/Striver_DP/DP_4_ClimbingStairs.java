// LC - 70

package Striver_DP;

/*
 * 
Visualization of an example of when n = 4.
"From the [n-1] point, we can take one single step to reach [n].
And from the [n-2] point, we could take two steps to get there"

steps[n-2] = 2
1 + 1
2

steps[n-1] = 3
1 + 1 + 1
1 + 2
2 + 1

Add 2 steps at n - 2.
Add 1 step at n - 1.
You get the number of steps at n:

steps[n] = 5 = steps[n - 1] + steps[n - 2]
1 + 1 + 2
2 + 2

1 + 1 + 1 + 1
1 + 2 + 1
2 + 1 + 1


 */

public class DP_4_ClimbingStairs {

	public static void main(String[] args) {

	}

}