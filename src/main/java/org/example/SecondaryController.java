package org.example;

import java.io.IOException;
import javafx.fxml.FXML;


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}