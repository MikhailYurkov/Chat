module com.example.network_chat_client {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.network_chat_client to javafx.fxml;
    exports com.example.network_chat_client;
}