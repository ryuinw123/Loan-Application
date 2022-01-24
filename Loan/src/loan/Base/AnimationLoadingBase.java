package loan.Base;

import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public abstract class AnimationLoadingBase extends AnchorPane {

    protected final ImageView imageView;

    public AnimationLoadingBase() {
        imageView = new ImageView();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(141.0);
        setPrefWidth(213.0);
        File file = new File("src/loan/image/source2.gif");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
        imageView.setFitHeight(141.0);
        imageView.setFitWidth(213.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        getChildren().add(imageView);
    }
}
