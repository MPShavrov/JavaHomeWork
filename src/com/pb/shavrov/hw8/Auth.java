package com.pb.shavrov.hw8;

import com.pb.shavrov.hw8.exception.WrongLoginException;
import com.pb.shavrov.hw8.exception.WrongPasswordException;

public class Auth {
    private String login;
    private String password;

    public boolean signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

           if (!validationLogin(login)){
               throw new WrongLoginException("Не правильный формат логина");
           } else

            if(!validationPassword(password)){
                throw new WrongPasswordException("Не правильный формат пароля");
            }else

            if(!equalsPassword(password, confirmPassword)){
                throw new WrongPasswordException("Вы ввели не верный повторный пароль");
            } else { return true;}
    }

    public void signIn(String login, String password) throws WrongLoginException{
        if ((this.login.equals(login)) && (this.password.equals(password))) {
            System.out.println("Вы вошли на сайт");
        } else {
            throw new WrongLoginException("Не верный логин или пароль");
        }
    }

    private boolean validationLogin(String login) throws WrongLoginException {
        String pattern = "^[a-zA-Z][a-zA-Z0-9]{4,20}$";
        return login.matches(pattern);
    }

    private boolean validationPassword(String password) throws WrongPasswordException {
        String pattern = "^[a-zA-Z][a-zA-Z0-9-_]{4,}$";
        return password.matches(pattern);
    }

    private boolean equalsPassword(String password, String confirmPassword) throws WrongPasswordException{
        return password.equals(confirmPassword);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
