package com.kobolith.passwordmanager.controllers

import com.kobolith.passwordmanager.models.PasswordList
import com.kobolith.passwordmanager.views.PasswordListView

class PasswordListController: Controller() {

    private var passwordList: PasswordList = PasswordList()
    private val view: PasswordListView = PasswordListView()

    init {
        view.getListView().items = passwordList.getCredentials()
        view.getLabel().text = "Number of Passwords: ${view.getListView().items.size}"
    }

    override fun getView(): PasswordListView {
        return view
    }

}