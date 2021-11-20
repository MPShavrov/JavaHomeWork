package com.pb.shavrov.hw8.exception;

public class WrongPasswordException extends Exception{


   public WrongPasswordException(String mes){
       super(mes);
    }

   public WrongPasswordException(){}

}
