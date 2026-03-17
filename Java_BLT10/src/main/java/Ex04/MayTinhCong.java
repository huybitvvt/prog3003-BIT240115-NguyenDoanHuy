package Ex04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MayTinhCong extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Label label1 = new Label("số đầu tiên:");
        TextField txt1 = new TextField();

        Label label2 = new Label("số thứ hai:");
        TextField txt2 = new TextField();

        Label result = new Label("Kết quả:");

        Button btn = new Button("Bấm để cộng");

        btn.setOnAction(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());

                double sum = a + b;

                result.setText("Ket qua: " + sum);

            } catch (Exception ex) {
                result.setText("Lỗi..");
            }
        });

        grid.add(label1, 0, 0);
        grid.add(txt1, 1, 0);

        grid.add(label2, 0, 1);
        grid.add(txt2, 1, 1);

        grid.add(btn, 0, 2);

        grid.add(result, 1, 2);

        Scene scene = new Scene(grid, 300, 200);

        stage.setTitle("Máy tính cộng..");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
