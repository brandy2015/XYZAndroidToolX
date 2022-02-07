package com.zhangqian.xyzandroidtool

import android.widget.ImageView
import androidx.core.content.ContextCompat

class XYZImage {
}

fun ImageView.setdrawableImageWithName(imageName: String) {
    this.setImageDrawable(
        ContextCompat.getDrawable(this.context, resources.getIdentifier(imageName, "drawable", context.getPackageName())
        )
    )
}