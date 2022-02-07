package com.xyztech.xyzandroidtoolx

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Vibrator
import android.util.Log
import android.view.HapticFeedbackConstants
import android.view.View
import com.google.android.material.internal.ContextUtils

class XYZFunctions {
}

@JvmName("PrintX1")
fun String.PrintX(){
    Log.d("已运行,输出控制台",this) }

fun PrintX(Message:String){
    Log.d("已运行,输出控制台",Message) }

fun PrintX(Message:Int){
    Log.d("已运行,输出控制台","${Message}") }

//fun XYZcopyTextToClipboardx(context: Context, textToCopy:String) {
//    val cm = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
//    val clipData = ClipData.newPlainText("text", textToCopy)
//    cm.setPrimaryClip(clipData)
//}
//XYZString
@SuppressLint("RestrictedApi")
fun XYZcopyTextToClipboard(context: Context, textToCopy:String) {
    val cm = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clipData = ClipData.newPlainText("text", textToCopy)
    cm.setPrimaryClip(clipData)
//    val clipboardManager = ContextUtils.getActivity(context)
//            ?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
//    val clipData = ClipData.newPlainText("text", textToCopy)
//    clipboardManager.setPrimaryClip(clipData)
//        Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_LONG).show()
}

@SuppressLint("RestrictedApi")
fun XYZpasteTextFromClipboard(context: Context):String {
    val clipboardManager = ContextUtils.getActivity(context)
            ?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val x = clipboardManager.primaryClip?.getItemAt(0)?.text
    return "${x}"
}





//震动反馈
//  performHapticFeedback  长震动
@SuppressLint("RestrictedApi")
fun XYZResponse1(context: Context){
    val contextX = ContextUtils.getActivity(context)
    val v = contextX?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    // Vibrate for 500 milliseconds
    // Vibrate for 500 milliseconds
    v.vibrate(500)
}
//  performHapticFeedback  轻震动
fun XYZResponse2(Viewx: View){
    Viewx.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
}





//    private fun updateLists() {
//        val lists = listDataManager.readLists()
//        listsRecyclerView.adapter = ListSelectionRecyclerViewAdapter(lists, this)
//    }
//    private fun loadFragment(fragment: Fragment){
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.fl_main, fragment)
//        transaction.disallowAddToBackStack()
//        transaction.commit()
//    }
//    And if you want to load fragment from a fragment,
//
//    val transaction = activity.supportFragmentManager.beginTransaction()
//    transaction.replace(R.id.fl_main, SecondFragment())
//    transaction.disallowAddToBackStack()
//    transaction.commit()
//
//    override fun listItemClicked(list: TaskList) { showListDetail(list) }
