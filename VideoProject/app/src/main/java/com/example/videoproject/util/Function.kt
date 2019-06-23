package com.example.videoproject.util

import android.app.AlertDialog
import android.content.Context

fun dialogBasic(context: Context, message: String): AlertDialog {
    return AlertDialog.Builder(context)
        .setMessage(message)
        .setCancelable(false)
        .setPositiveButton("확인", null)
        .create()
}