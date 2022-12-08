module com.mycompany.helloworldjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.helloworldjavafx to javafx.fxml;
    exports com.mycompany.helloworldjavafx;
}
