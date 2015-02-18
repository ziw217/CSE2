//Zijia Wang

import java.util.Scanner;
import java.lang.String;

public class Banking{

private String name;
private double balance;
public Banking(String n, double b)
{
name = n;
balance = b;
}
public String toPrint()
{
String output;
output = name +", balance = " + balance;
return output;
}
public double deposit(double d)
{
if ( d >= 0) balance = balance + d;
if (d < 0)
System.out.println("Your deposit has to be >= 0");
return balance;
}
public double withdrawl(double w)
{
if (w >= 0 && w <= balance) balance = balance -w;
if (w > balance)
System.out.println("You don't have sufficient funds!");
if (w < 0)
System.out.println("Withdrawl must be >= 0");
return balance;
}
}