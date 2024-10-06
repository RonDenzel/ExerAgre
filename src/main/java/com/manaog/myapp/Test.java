/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.manaog.myapp;
import com.manaog.mylibs.Date;
import com.manaog.mylibs.Publisher;
import com.manaog.mylibs.Address;
import com.manaog.mylibs.Book;

/**
 *
 * @author MPO407-24
 */
public class Test {

    public static void main(String[] args) {
        Book b1 = new Book("Clark, Dan","C# Object-oriented Programming", new Date(28, 12, 2020));
              
        b1.setPublisher(new Publisher("Appress", new Address(123,"NY","USA")));
        
        System.out.print(b1.getAuthor()+". " + b1.getTitle()+". " + b1.getPublisher().getName()+". " + b1.getPublisher().getAddress().getCity() 
               +". " + b1.getPublisher().getAddress().getCountry() +". "+ b1.getPubDate().convertMonth()+", "+b1.getPubDate().getYear());
        
        if(b1.checkBookAge()==0){
            System.out.println("(old)");
        }else {
        System.out.println("(new)");
        }
    
        Book b2 = new Book("Clrk, Dan","C# Object-oriented Programming", new Date(24, 01, 2023));
        b2.setPublisher(new Publisher("Appress", new Address(123,"NY","USA")));
        
        System.out.print(b2.getAuthor()+". " + b2.getTitle()+". " + b2.getPublisher().getName()+". " + b2.getPublisher().getAddress().getCity() 
               +". " + b2.getPublisher().getAddress().getCountry() +". "+ b2.getPubDate().convertMonth()+", "+b2.getPubDate().getYear());
        if(b2.checkBookAge()==0){
            System.out.println("(old)");
        }else {
        System.out.println("(new)");
        }
        
        Book b3 = new Book("Llark, Dan","C# Object-oriented Programming", new Date(22, 05, 2024));
        b3.setPublisher(new Publisher("Appress", new Address(123,"NY","USA")));
        
        System.out.print(b3.getAuthor()+". " + b3.getTitle()+". " + b3.getPublisher().getName()+". " + b3.getPublisher().getAddress().getCity() 
               +". " + b3.getPublisher().getAddress().getCountry() +". "+ b3.getPubDate().convertMonth()+", "+b3.getPubDate().getYear());
        if(b3.checkBookAge()==0){
            System.out.println("(old)");
        }else {
        System.out.println("(new)");
        }
        
    }
    
    
    
}
