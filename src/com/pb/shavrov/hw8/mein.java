package com.pb.shavrov.hw8;

import com.pb.shavrov.hw8.exception.WrongLoginException;
import com.pb.shavrov.hw8.exception.WrongPasswordException;

public class mein {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Auth auth = new Auth();

        String login = "d11111";
        String password = "dwd111111111";
        String confirmPassword = "dwd111111111";

        try {
            if (auth.signUp(login, password, confirmPassword)) {
                auth.setLogin(login);
                auth.setPassword(password);
                System.out.println("Регистрация успешна");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            auth.signIn("d11111", "dwd111111111");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }

    }


}
