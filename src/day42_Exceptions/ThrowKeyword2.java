package day42_Exceptions;

import day31_Constructors.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        throw new NoSuchElementException("There is no such element as break");    //unchecked exception

        //throw new InterruptedException();   //checked exception can not be used with throw

        //System.out.println("Hello world");    //you can not print anything after throw keyword

        //throw new Rectangle(5,7);     //you can not call class


    }
}
