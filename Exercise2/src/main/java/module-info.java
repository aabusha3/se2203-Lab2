module se2203b.exercise2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens se2203b.exercise2 to javafx.fxml;
    exports se2203b.exercise2;
}