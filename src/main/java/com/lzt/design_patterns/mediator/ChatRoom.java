package com.lzt.design_patterns.mediator;

import java.util.Date;

/**
 * Created by viruser on 05/17.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
