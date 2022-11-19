//Kareena
//19105112
/*Question 2. All the banks operating in India are controlled by RBI. RBI has set a well
defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum
withdrawal limit etc) which all banks must follow. For example, suppose RBI has set
minimum interest rate applicable to a saving bank account to be 4% annually; however,
banks are free to use 4% interest rate or to set any rates above it.

Write a program to implement bank functionality in the above scenario. Note: Create few
classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI,
PNB etc). Assume and implement required member variables and functions in each class. */

import java.util.Scanner;

  class Account{

      String acc_type,branch_type;

  }
  class Customer{

    String name,address;

    int age;

  }

  class RBI{ 

      int withdrawal_limit,n;

      double A,P,r;

      float t;

      long average,total,monthly_balance;

     

      int setWithdrawalLimit() {

          Scanner sc = new Scanner(System.in);

          String acc_type=sc.nextLine();

          String branch_type=sc.nextLine();

          if(acc_type=="SAVINGS" && branch_type=="METRO") {

              withdrawal_limit = 30000;

          }else {

              withdrawal_limit = 15000;

          }
          sc.close();

      return withdrawal_limit;

      }

     

      double setInterestRate() {

          A=(P+r)/n*t;

          return A;

      }

     

      long setMAB() {

          monthly_balance=(average+total)/31;

          return monthly_balance;

      }

  }

 

  class BankOfBaroda extends RBI{ // Children class1

      double setInterestRate() {

          A=P*(1+r/n)+n*t;

          return A;

      }

      long setMAB() {

          monthly_balance=(average+total)/30;

          return monthly_balance;


      }
  }

 

  class UjjivanBank extends RBI{ // Children class2

      double setInterestRate() {

          A=(P*r)/n+t;

          return A;

      }

     

      int setWithdrawalLimit() {

          withdrawal_limit=7000;

          return withdrawal_limit;

      }

  }

public class Question2 { //Testing the code

public static void main(String args[]) {

BankOfBaroda bob = new BankOfBaroda();

UjjivanBank ujjivan = new UjjivanBank();

bob.P=10.433;

bob.r=7.42;

bob.n=5;

bob.t=7;

Double bobInt=bob.setInterestRate();

System.out.println("BankOfBaroda interest rate is:"+bobInt);

int ujjivanWL= ujjivan.setWithdrawalLimit();

System.out.println("UjjivanBank withdraw limit is:"+ujjivanWL);

}

}
