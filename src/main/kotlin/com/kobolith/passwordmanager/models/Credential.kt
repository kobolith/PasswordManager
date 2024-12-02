package com.kobolith.passwordmanager.models

/**
 * Represents a password
 *
 * @param password The password
 * @param username The username
 * @param email The email
 * @param website The website
 */
class Credential(
    private var password: String = "",
    private var username: String = "",
    private var email: String = "",
    private var website: String = ""
) {

    /**
     * Returns the password
     *
     * @return The password
     */
    fun getPassword(): String {
        return password
    }

    /**
     * Sets the password
     *
     * @param password The password
     */
    fun setPassword(password: String) {
        this.password = password
    }

    /**
     * Returns the username
     *
     * @return The username
     */
    fun getUsername(): String {
        return username
    }

    /**
     * Sets the username
     *
     * @param username The username
     */
    fun setUsername(username: String) {
        this.username = username
    }

    /**
     * Returns the email
     *
     * @return The email
     */
    fun getEmail(): String {
        return email
    }

    /**
     * Sets the email
     *
     * @param email The email
     */
    fun setEmail(email: String) {
        this.email = email
    }

    /**
     * Returns the website
     *
     * @return The website
     */
    fun getWebsite(): String {
        return website
    }

    /**
     * Sets the website
     *
     * @param website The website
     */
    fun setWebsite(website: String) {
        this.website = website
    }

    /**
     * Returns a string representation of the password
     *
     * @return A string representation of the password
     */
    override fun toString(): String {
        return "Credential(password='$password', username='$username', email='$email', website='$website')"
    }

}