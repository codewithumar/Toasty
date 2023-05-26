package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

object toast {
    fun toast(context : Context){
        Toast.makeText(context,"Hello Android",Toast.LENGTH_LONG).show();
    }
}