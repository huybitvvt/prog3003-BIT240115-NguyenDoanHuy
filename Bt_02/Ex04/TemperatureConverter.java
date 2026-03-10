package Ex04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {

    @Override
    public void start(Stage stage) {

        TextField inputCelsius = new TextField();
        inputCelsius.setPromptText("Nhập độ C");

        Button convertButton = new Button("Chuyển đổi");

        Label resultLabel = new Label("Kết quả: ");

        convertButton.setOnAction(e -> {
            try {
                double c = Double.parseDouble(inputCelsius.getText());
                double f = c * 9 / 5 + 32;
                resultLabel.setText("Fahrenheit: " + f);
            } catch (Exception ex) {
                resultLabel.setText("Nhập số hợp lệ!");
            }
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(inputCelsius, convertButton, resultLabel);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Chuyển đổi nhiệt độ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}