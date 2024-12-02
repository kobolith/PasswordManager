module com.kobolith.passwordmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.kobolith.passwordmanager to javafx.fxml;
    exports com.kobolith.passwordmanager;
}