package com.kobolith.passwordmanager.controllers

import com.kobolith.passwordmanager.views.PasswordListView

class PasswordListController: Controller() {

    private val view: PasswordListView = PasswordListView()

    init {

    }

    override fun getView(): PasswordListView {
        return view
    }

}