package com.jad.helloworldmvc;

public class Controller implements IController {
    private final IModel model;
    private final IView view;

    public Controller(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void start() {
        this.view.showMessage(this.model.getHelloWorld());
        this.view.showMessage(this.model.getHelloWorldByCountry(this.view.askCountry()));

    }
}
