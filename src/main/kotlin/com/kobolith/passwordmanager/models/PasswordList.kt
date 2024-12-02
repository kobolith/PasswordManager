package com.kobolith.passwordmanager.models

import javafx.collections.FXCollections
import javafx.collections.ObservableList

class PasswordList {

    private var credentials: ObservableList<Credential> = FXCollections.observableList(ArrayList<Credential>())

    init {
        credentials.add(Credential("password", "username", "email", "website"))
        credentials.add(Credential("password2", "username2", "email2", "website"))
        credentials.add(Credential("password3", "username3", "email3", "website"))
        credentials.add(Credential("password4", "username4", "email4", "website"))
    }

    fun getCredentials(): ObservableList<Credential> {
        return credentials
    }

}