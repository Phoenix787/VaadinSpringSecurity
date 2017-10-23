//package com.sergeeva.VaadinSpringSecurity.ui;
//
//import com.vaadin.navigator.View;
//import com.vaadin.navigator.ViewChangeListener;
//import com.vaadin.spring.annotation.SpringView;
//import com.vaadin.ui.*;
//
//@SpringView(name = "") // root view
//public class LoginView extends VerticalLayout implements View {
//
//    public LoginView() {
//        setMargin(true);
//        Panel panel = new Panel("Авторизация");
//        panel.setSizeUndefined();
//        addComponent(panel);
//
//        FormLayout content = new FormLayout();
//        TextField userName = new TextField("Логин");
//        userName.focus();
//
//
//        addComponent(new Label("User Zone"));
//    }
//
//    @Override
//    public void enter(ViewChangeListener.ViewChangeEvent event) {
//        //NOP
//    }
//}
