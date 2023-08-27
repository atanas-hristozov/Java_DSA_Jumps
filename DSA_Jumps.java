import java.util.Scanner;

import java.util.Stack;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] elements = new int[length];

        for (int i = 0; i < length; i++) {

            elements[i] = scanner.nextInt();

        }

        scanner.close();

        int[] jumps = new int[length];

        Stack<Integer> stack = new Stack<>();

        int count=0;

        int i;

        int maxJumps=0;

        while(count<length) {

            i = count;

            for (; i < length; i++) {

                if(stack.isEmpty()) {

                    stack.push(elements[i]);

                    continue;

                }

                if (stack.peek() < elements[i]) {

                    stack.push(elements[i]);

                }

            }

            jumps[count]=stack.size()-1;

            if(stack.size()-1>maxJumps) {

                maxJumps = stack.size()-1;

            }

            stack.clear();

            count++;



        }

        StringBuilder builder = new StringBuilder();

        builder.append(maxJumps +"\n");

        for(int e:jumps){

            builder.append(e +" ").trimToSize();

        }

        System.out.println(builder);



    }

}
