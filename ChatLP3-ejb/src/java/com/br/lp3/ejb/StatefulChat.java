package com.br.lp3.ejb;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 *
 * @author 31338283
 */
@Stateful(mappedName = "Chat2")
public class StatefulChat implements StatefulChatInterface {

    private String name = "Chico Cunha";

    @Override
    public void connect(String nome) {
        this.name = nome;
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
