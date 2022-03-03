public class NewRunner
{
    public static void main(String[] args)
    {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

        for (int index = 0; index < testArr1.length; index++)
        {
            for (int index2 = 0; index2 < testArr1[index].length; index2++)
            {
                System.out.println(testArr1[index][index2]);
            }
        }

        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        for (int[] stuff: testArr1)
        {
            for (int stuff2: stuff)
            {
                System.out.println(stuff2);
            }
        }

        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        for (int index = 0; index < testArr1[0].length; index++)
        {
            for (int index2 = 0; index2 < testArr1.length; index2++)
            {
                System.out.println(testArr1[index2][index]);
            }
        }

        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish

        for (String[] stuff: testArr2)
        {
            for (String stuff2: stuff)
            {
                System.out.println(stuff2);
            }
        }

        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        for (int index = 0; index < testArr2[0].length; index++)
        {
            for (int index2 = 0; index2 < testArr2.length; index2++)
            {
                System.out.println(testArr2[index2][index]);
            }
        }
    }
}
