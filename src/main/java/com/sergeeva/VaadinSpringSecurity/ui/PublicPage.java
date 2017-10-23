//package com.sergeeva.VaadinSpringSecurity.ui;
//
//import com.vaadin.annotations.Theme;
//import com.vaadin.annotations.VaadinServletConfiguration;
//import com.vaadin.navigator.Navigator;
//import com.vaadin.server.ExternalResource;
//import com.vaadin.server.VaadinRequest;
//import com.vaadin.server.VaadinServlet;
//import com.vaadin.spring.annotation.SpringUI;
//import com.vaadin.spring.navigator.SpringViewProvider;
//import com.vaadin.ui.Label;
//import com.vaadin.ui.Link;
//import com.vaadin.ui.UI;
//import com.vaadin.ui.VerticalLayout;
//import com.vaadin.ui.themes.ValoTheme;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.servlet.annotation.WebServlet;
//
//@SpringUI
//@Theme(ValoTheme.THEME_NAME)
//public class PublicPage extends UI {
////
////    @Autowired
////    public PublicPage() {
////    }
//    @Autowired
//    SpringViewProvider viewProvider;
//
//    @Override
//    protected void init(VaadinRequest request) {
//
//        VerticalLayout layout = new VerticalLayout();
//        layout.addComponent(new Label("Welcome to Public Page"));
////        layout.addComponent(new Link("Login zone", new ExternalResource("http://localhost:8090/login/")));
////        layout.addComponent(new Link("User zone", new ExternalResource("http://localhost:8090/user/")));
////        layout.addComponent(new Link("Admin zone", new ExternalResource("http://localhost:8090/admin/")));
//        Navigator navigator = new Navigator(this, this);
//        navigator.addProvider(viewProvider);
//
//
//        setContent(layout);
//    }
//
//    @WebServlet(value = "/*", asyncSupported = true)
//    @VaadinServletConfiguration(productionMode = false, ui = PublicPage.class)
//    public static class Servlet extends VaadinServlet {
//    }
//}
