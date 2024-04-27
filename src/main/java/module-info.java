module music.app {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens music.app to javafx.fxml;
    exports music.app;
}