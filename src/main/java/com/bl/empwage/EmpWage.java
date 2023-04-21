package com.bl.empwage;
import java.lang.Math;

public class EmpWage
{
    //class Variables
    int wagePerHour = 20;
    int fullDayHour = 8;
    int partTimeHour = 4;
    int WorkingDayPerMonth = 20;
    int totalDaysOfMonth = 30;
    int totalWageOfMonth = 0;
    int day = 0;
    int totalWorkingDay = 0;
    int totalWorkingHourForMonth = 100;
    int totalDailyWorkingHour = 0;
    // Method To Calculate Total Employee Wage.
    int calculateEmpWage()
    {
        while (day < totalDaysOfMonth && totalWorkingDay < WorkingDayPerMonth && totalDailyWorkingHour < totalWorkingHourForMonth)
        {
            //Checking Employee Present or Absent.
            switch ((int) ((Math.random() * 10) % 3))
            {
                case 1: {
                    System.out.println("Employee is Present Full Time");
                    int dailyWage = wagePerHour * fullDayHour; //Calculating Full Time Daily Wage.
                    System.out.println("Daily Employee Wage:" + dailyWage);
                    totalWageOfMonth += dailyWage; //Calculating Total Monthly Wage.
                    totalWorkingDay++;
                    totalDailyWorkingHour++;
                    break;
                }
                case 2: {
                    System.out.println("Employee is Present Part Time");
                    int dailyWage = wagePerHour * partTimeHour; //Calculating Part Time Daily Wage.
                    System.out.println("Daily Employee Wage:" + dailyWage);
                    totalWageOfMonth += dailyWage; //Calculating Total Monthly Wage.
                    totalWorkingDay++;
                    totalDailyWorkingHour++;
                    break;
                }
                default://if all cases are not matched.
                    System.out.println("Employee is Absent");
            }
            day++;
        }
        return totalWageOfMonth;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation Program!");

        EmpWage wage = new EmpWage();//Created obj of Class to call method.
        int totalEmpWage = wage.calculateEmpWage();
        System.out.print("Total Wage for a Month:" + totalEmpWage);
    }
}
