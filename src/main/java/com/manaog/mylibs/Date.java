/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manaog.mylibs;

/**
 *
 * @author MPO407-24
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    
    
    public String convertMonth(){
        String [] monthList = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        if(month>=1 && month <= 12){
        return monthList[month-1];
        
        
        }else{
        
            return "invalid month";
        
        }
        
      }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
