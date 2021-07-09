package world.ucode.animation;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class XYAnimations {
    public static void xShaking(Node object) {
        TranslateTransition translateTransition = new TranslateTransition();

        translateTransition.setDuration(Duration.millis(80));
        translateTransition.setNode(object);

        translateTransition.setFromX(0);
        translateTransition.setToX(10);
        translateTransition.setCycleCount(3);
        translateTransition.setAutoReverse(true);
        translateTransition.play();
    }
}
