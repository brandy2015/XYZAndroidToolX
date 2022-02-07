package com.xyztech.xyzandroidtoolx

import android.util.Log

@JvmName("PrintX1")
fun String.PrintXy(){
    Log.d("已运行,输出控制台xxxxxc",this) }

fun PrintXy(Message:String){
    Log.d("已运行,输出控制台xxxxxc",Message) }

fun PrintXy(Message:Int){
    Log.d("已运行,输出控制台xxxxc","${Message}") }
