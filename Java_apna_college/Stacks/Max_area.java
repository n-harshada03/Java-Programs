package Java_apna_college.Stacks;

import java.util.Stack;

public class Max_area {
    public static void maxArea(int[] heights) {
        int maxArea = 0;
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];

        // Next smaller right
        Stack<Integer> s = new Stack<>();
        for (int j = heights.length - 1; j >= 0; j--) {
            while (!s.isEmpty() && heights[j] <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[j] = heights.length;
            } else {
                nsr[j] = s.peek();
            }
            s.push(j);
        }

        // Next smaller left
        s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Area calculation
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println(maxArea);
    }

    
    public static void main(String[] args) {
        // int heights[]={2,1,5,6,2,3};
        int heights[]={9,0};
        maxArea(heights);
    }
    
}
