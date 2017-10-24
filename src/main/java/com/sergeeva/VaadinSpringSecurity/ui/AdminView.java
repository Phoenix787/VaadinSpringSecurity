package com.sergeeva.VaadinSpringSecurity.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name="admin")
public class AdminView extends VerticalLayout implements View {

    public AdminView() {
        setMargin(true);
        addComponent(new Label("Admin Zone"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
