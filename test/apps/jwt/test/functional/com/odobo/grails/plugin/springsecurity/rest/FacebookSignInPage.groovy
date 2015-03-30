package com.odobo.grails.plugin.springsecurity.rest

import geb.Page

class FacebookSignInPage extends Page {

    static at = {
        title == "Log into Facebook | Facebook"
    }

    void login(String username, String password) {
        $('#email').value username
        $('#pass').value password
        $('input', name: "Log In").click()
    }

}
