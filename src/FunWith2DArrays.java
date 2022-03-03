public class FunWith2DArrays
{
    public static int totalElements(int[][] entered)
    {
        int rows = 0;
        int length = 0;
        for (int[] stuff: entered)
        {
            length = stuff.length;
            rows++;
        }
        return rows * length;
    }

    public static double average(int[][] list)
    {
        double sum = 0;
        double count = 0;
        for (int[] stuff: list)
        {
            for (int stuff2: stuff)
            {
                sum += stuff2;
                count++;
            }
        }
        return sum / count;
    }

    public static int[] indexFound(String[][] list, String target)
    {
        int[] temp = {-1, -1};
        for (int index = 0; index < list.length; index++)
        {
            for (int index2 = 0; index2 < list[index].length; index2++)
            {
                if (list[index][index2].equals(target))
                {
                    temp[0] = index;
                    temp[1] = index2;
                }
            }
        }
        return temp;
    }
}
