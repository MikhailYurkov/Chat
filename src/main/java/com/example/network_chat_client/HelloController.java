package com.example.network_chat_client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    private ListView<String> allMessages;

    @FXML
    private ListView<String> allUsers;

    @FXML
    private TextField toSend;


    @FXML
    void send(ActionEvent event) {
        if (!toSend.getText().equals("")) {
            allMessages.getItems().add(toSend.getText());
        }
    }
}