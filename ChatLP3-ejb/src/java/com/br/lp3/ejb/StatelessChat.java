package com.br.lp3.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author 31338283
 */
@Stateless
public class StatelessChat implements StatelessChatInterface {

    private String name = "Anonymous";

    @Override
    public void connect() {
        System.out.println(name + " entered the room");
    }

    @Override
    public void disconnect() {
        System.out.println(name + " left the room");
    }

    @Override
    public void say(String msg) {
        System.out.println(name + " said: " + msg);
    }

}
