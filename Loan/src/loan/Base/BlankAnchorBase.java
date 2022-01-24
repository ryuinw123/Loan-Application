package loan.Base;

import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import loan.Controller.LoginMainController;

public abstract class BlankAnchorBase extends AnchorPane {

    public BlankAnchorBase() {
        if (!LoginMainController.getIsSplashLoaded()) {
            loadSplashScreen();
        }
        setId("AnchorPane");
        setPrefHeight(800.0);
        setPrefWidth(1340.0);
        setOpaqueInsets(new Insets(0.0));
    }

    protected abstract void loadSplashScreen();
}
