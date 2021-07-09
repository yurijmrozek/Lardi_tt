package world.ucode.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import world.ucode.animation.XYAnimations;

public class MainController {
    @FXML
    private TextArea output_text_area;

    @FXML
    private Pane input_text_fields_pane;

    @FXML
    private Text error_text;

    @FXML
    void on_do_button_clicked(MouseEvent event) {
        StringBuilder output = new StringBuilder();

        for (Node field : input_text_fields_pane.getChildren()) {
            if (field instanceof TextArea textArea) {
                if (textArea.getText().isBlank()) {
                    error_text.setVisible(true);
                    XYAnimations.xShaking(error_text);
                    return;
                }
                output.append(textArea.getText());
            }
        }
        error_text.setVisible(false);
        output_text_area.setText(String.valueOf(output));
    }
}
