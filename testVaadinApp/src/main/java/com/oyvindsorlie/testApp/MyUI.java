package com.oyvindsorlie.testApp;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        // Our canvas where everything else is put...use one of the Layout-classes below
        //HorizontalLayout horizontalLayout = new HorizontalLayout();
        VerticalLayout verticalLayout = new VerticalLayout();

        TextField firstName = new TextField();
        firstName.setCaption("Fornavn");
        TextField lastName = new TextField("Etternavn");
        TextField userName = new TextField("brukernavn");

        PasswordField passwordField = new PasswordField("Skriv inn passord");

        Label showName = new Label();

        Button loginButton = new Button("Login");
        loginButton.addClickListener(e -> {
            showName.setValue(firstName.getValue() + " " + lastName.getValue());
            Notification.show("Hallo " + userName.getValue());
        });
        //showName.setValue("");

        verticalLayout.setMargin(true);
        verticalLayout.setSpacing(true);
        // To put everything in the center, we can add the following;
        verticalLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        verticalLayout.addComponents(firstName, lastName, userName, passwordField, showName, loginButton);

        setContent(verticalLayout);

        // The following is standard pre-written code when creating a new maven project :)
       /* final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        layout.addComponents(name, button);
        
        setContent(layout);*/
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
