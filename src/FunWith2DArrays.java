public class FunWith2DArrays
{
    public int totalElements(int[][] entered)
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
}
