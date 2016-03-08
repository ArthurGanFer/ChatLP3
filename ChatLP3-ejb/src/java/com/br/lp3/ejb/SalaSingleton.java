/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author 31338283
 */
@Singleton
@LocalBean
@WebListener
@Startup
public class SalaSingleton implements HttpSessionListener {

    private int count = 0;

    @PostConstruct
    private void init() {
        System.out.println("Sala Criada");
    }

    @PreDestroy
    private void close() {
        System.out.println("Sala Fechada");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        System.out.println("Usuarios ativos: " + count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count++;
        System.out.println("Usuarios ativos: " + count);
    }

}
