package com.kobolith.passwordmanager

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage


const val APP_TITLE = "Password Manager"
const val APP_VERSION = "0.1.0"



class App : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(App::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "$APP_TITLE v$APP_VERSION"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(App::class.java)
}