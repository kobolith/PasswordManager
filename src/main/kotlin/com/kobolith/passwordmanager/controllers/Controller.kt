package com.kobolith.passwordmanager.controllers

import com.kobolith.passwordmanager.views.View

abstract class Controller {

    abstract fun getView(): View

}