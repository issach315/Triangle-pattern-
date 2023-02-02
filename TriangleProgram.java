package nestedForLoop.Day1.day2;

public class TriangleProgram 
{
    
    public static void main(String[] args)
     {
        int n=5;
        
        // RightAngle tnagle pattern

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(" "+"*");
        }
        System.out.println();
    }
        
    }
    /*
     
    Output :-

        *
        * *
        * * *
        * * * *
        * * * * *

        
     */
}
