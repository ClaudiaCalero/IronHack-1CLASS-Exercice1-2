package com.company;

/*Ejercicio 1
Working in pairs, create a new project where you iterate over an array of integers and update each position of this array by multiplying that value by the value of the next position. The last position must be multiplied by the first position of the array.
`Example
input: [5, 4, 3, 7, 28] output: [20, 12, 6, 2, 5] // Explanation 54, 43, 32, 21, 1*5`

Ejercicio 2
Working in pairs, in the same project create a method to invert an array
Example
input: [1, 2, 7, 4, 25]
output: [25, 4, 7, 2, 1]


*/
public class Main {

    public static void main(String[] args) {
        System.out.println("===ejercicio 1 dia dos===");
        //  int[] numbers = {5, 4, 3, 7, 28};
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int [] result = new int[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {
            result[i] = numbers[i] * numbers[i+1];
        }
        result[numbers.length - 1] =numbers[0] * numbers[numbers.length - 1];

        for (int num : result){
            System.out.println(num);
        }

        System.out.println("===ejercicio 2 dia dos===");

        int[] result2 = new int[numbers.length];
        int counter = 0;
        for(int i = numbers.length - 1; i >= 0; i--) {
            result2[counter++] = numbers[i];
        }

        for (int num1 : result2){
            System.out.println(num1);
        }

    }

}

