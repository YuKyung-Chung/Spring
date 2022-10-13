package com.codestates.chapter2.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class CafeClient {
    public static void main(String[] args) {
        //MenuService menuService = new MenuServiceStub();
        //MenuController controller = new MenuController(menuService);
        GenericApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MenuController controller = context.getBean(MenuController.class);

        List<Menu> menuList = controller.getMenus();
    }
}