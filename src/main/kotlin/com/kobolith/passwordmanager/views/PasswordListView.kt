package com.kobolith.passwordmanager.views

import javafx.scene.Parent
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox

class PasswordListView: View() {

    private lateinit var root: Parent

    init {
        initializeRoot()
    }

    private fun initializeRoot() {
        val outerBox = VBox()
        val innerBox = HBox()

        innerBox.children.add(Label("Password List"))
        outerBox.children.add(innerBox)

        root = outerBox
    }

    override fun getRoot(): Parent {
        return root
    }
}