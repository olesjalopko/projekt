module com.example.projekt_teineosa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.projekt_teineosa to javafx.fxml;
    exports com.example.projekt_teineosa;
}