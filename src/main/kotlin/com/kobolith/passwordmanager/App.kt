package com.kobolith.passwordmanager

import com.kobolith.passwordmanager.controllers.Controller
import com.kobolith.passwordmanager.controllers.PasswordListController

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.layout.Pane
import javafx.stage.Stage


class App : Application() {
    object Config {
        const val APP_TITLE = "Credentials Manager"
        const val APP_VERSION = "0.1.0"
        const val APP_ICON_PATH = "/app_icon.png"

        const val APP_INITIAL_WIDTH = 800.0
        const val APP_INITIAL_HEIGHT = 600.0
    }

    private lateinit var stage: Stage

    override fun start(stage: Stage) {
        this.stage = stage
        this.stage.scene = Scene(Pane())
        this.stage.title = "${Config.APP_TITLE} v${Config.APP_VERSION}"

        this.stage.width = Config.APP_INITIAL_WIDTH
        this.stage.height = Config.APP_INITIAL_HEIGHT

        try {
            val image = Image(
                javaClass.getResource(Config.APP_ICON_PATH)?.toExternalForm()
                    ?: throw IllegalArgumentException("Resource not found: ${Config.APP_ICON_PATH}")
            )
            this.stage.icons.add(image)
        } catch (e: IllegalArgumentException) {
            System.err.println(e.message)
        }

        switchController(PasswordListController())
    }


    /**
     * Loads any controller's view and switches to it
     *
     * @param controller The controller to switch to
     */
    fun switchController(controller: Controller) {
        stage.scene.root = controller.getView().getRoot()
        stage.show()
    }
}

fun main() {
    Application.launch(App::class.java)
}