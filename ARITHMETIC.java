import  java.util.*;
/**
 * ARITHMETIC
 */
public class ARITHMETIC 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1=s.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2=s.nextInt();
        System.out.println("THE ADDITION OF "+num1+" and "+num2+" is "+(num1+num2));
        System.out.println("THE SUBTRACTION OF "+num1+" and "+num2+" is "+(num1-num2));
        System.out.println("THE MULTIPLICATION OF "+num1+" and "+num2+" is "+(num1*num2));
        System.out.println("THE DIVISION OF "+num1+" and "+num2+" is "+(num1/num2));
        System.out.println("THE REMAINDER OF "+num1+" and "+num2+" is "+(num1%num2));
    }   
}