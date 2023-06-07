package com.swlove.mvi

import android.content.Context
import android.widget.Toast

class SimpleToast {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun show() {
            println("Hello, World!")
        }
    }
}