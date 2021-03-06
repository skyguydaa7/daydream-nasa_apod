package com.lbbento.daydreamnasa.ui.view

import android.net.Uri
import android.service.dreams.DreamService

abstract class BaseServiceView : DreamService(), BaseViewContract {

    override fun onCreate() {
        super.onCreate()
        setupInjection()
    }

    @Throws(Exception::class)
    override fun parseUri(uriToParse: String): Uri {
        return Uri.parse(uriToParse)
    }
}

