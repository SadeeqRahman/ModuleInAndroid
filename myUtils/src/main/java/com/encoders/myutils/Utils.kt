package com.encoders.myutils

import android.content.Context
import android.widget.Toast

class Utils {

    fun ShowToast(context: Context) {
        Toast.makeText(context, "Hello this is module work ", Toast.LENGTH_SHORT).show()

    }
}