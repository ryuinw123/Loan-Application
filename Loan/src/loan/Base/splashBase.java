package loan.Base;

import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class splashBase extends StackPane {

    protected final ImageView imageView;

    protected final Pane pane;

    protected final Text text;

    public splashBase() {
        imageView = new ImageView();
        pane = new Pane();
        text = new Text();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(800.0);
        setPrefWidth(1340.0);
        imageView.setFitHeight(802.0);
        imageView.setFitWidth(1342.0);
        imageView.setPickOnBounds(true);
        File file = new File("src/loan/image/OkaneW.jpg");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
        pane.setOpacity(0.45);
        pane.setPrefHeight(280.0);
        pane.setPrefWidth(508.0);
        pane.setStyle("-fx-background-color: #000000;");
        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(414.0);
        text.setLayoutY(622.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("WELCOME");
        text.setWrappingWidth(511.5);
        text.setFont(new Font(96.0));
        getChildren().add(imageView);
        pane.getChildren().add(text);
        getChildren().add(pane);
    }
}
