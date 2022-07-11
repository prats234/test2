import java.util.Scanner;

public class test2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" --------------------------------------------");
        System.out.println("|       Welcome to Test competition          |");
        System.out.println(" --------------------------------------------");
        System.out.print("Question 1: How many eyes humans have..?  ");
        String ans = scan.next();

        if(ans.equals("2"))
        {
            System.out.println("            Well done..Your answer is correct..");
        }
        else
        {
            System.out.println("            Your answer is wrong..");
        }
        System.out.print("Question 2: How many letters in alphabets..?  ");
        String ans2 = scan.next();

        if(ans2.equals("26"))
        {
            System.out.println("            Great..Your Answer is correct..");
        }
        else
        {
            System.out.println("            Your answer is wrong");
        }
        System.out.print("Question 3:How many tongues Humans have..?  ");
        String ans3 = scan.next();

        if(ans3.equals("1"))
        {
            System.out.println("            Your Answer is correct..");
        }
        else
        {
            System.out.println("            Your answer is Wrong..");
        }
        if(ans.equals("2") && ans2.equals("26") && ans3.equals("1"))
        {
            System.out.println("            Well done you have A Grade..!!");
        }
        else if(ans.equals("2") || ans2.equals("26") && ans3.equals("1"))
        {
            System.out.println("            Well..you have B Grade...");
        }
        else if (ans.equals("2") && ans2.equals("26") || ans3.equals("1"))
        {
            System.out.println("            Well.. you have B Grade..");
        }
        else if(!ans.equals("2") && !ans2.equals("26") && !ans3.equals("1"))
        {
            System.out.println("            Well..you have C Grade..Better luck next time..");
        }
        else
        {
            System.out.println("            Try later..!!");
        }
    }
}
