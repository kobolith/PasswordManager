package com.kobolith.passwordmanager.views

import com.kobolith.passwordmanager.models.Credential
import javafx.scene.Parent
import javafx.scene.control.Label
import javafx.scene.control.ListView
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox

class PasswordListView: View() {

    private lateinit var root: Parent
    private lateinit var listView: ListView<Credential>
    private lateinit var label: Label

    init {
        initializeRoot()
    }

    private fun initializeRoot() {
        val outerBox = VBox()
        val innerBox = HBox()
        listView = ListView<Credential>()
        listView.setCellFactory { CredentialsListCell() }

        label = Label("Number of Passwords: ${listView.items.size}")

        innerBox.children.add(listView)
        innerBox.children.add(label)
        outerBox.children.add(innerBox)

        root = outerBox
    }

    override fun getRoot(): Parent {
        return root
    }

    fun getListView(): ListView<Credential> {
        return listView
    }

    fun getLabel(): Label {
        return label
    }

}