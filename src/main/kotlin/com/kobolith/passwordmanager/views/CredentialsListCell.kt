package com.kobolith.passwordmanager.views

import com.kobolith.passwordmanager.models.Credential
import javafx.scene.control.Label
import javafx.scene.control.ListCell
import javafx.scene.layout.VBox

class CredentialsListCell: ListCell<Credential>() {
        override fun updateItem(item: Credential?, empty: Boolean) {
            super.updateItem(item, empty)
            if (item != null && !empty) {
                val vBox = VBox()
                val usernameLabel = Label(item.getUsername())
                val passwordLabel = Label(item.getPassword())
                usernameLabel.style = "-fx-font-size: 16px;"
                passwordLabel.style = "-fx-font-size: 14px;"
                vBox.children.addAll(usernameLabel, passwordLabel)
                graphic = vBox
            }
        }
}