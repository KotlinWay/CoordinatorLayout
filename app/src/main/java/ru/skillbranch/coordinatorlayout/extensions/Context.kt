package ru.skillbranch.coordinator_layout.extensions

import android.content.Context
import android.util.TypedValue
import java.lang.reflect.Type

fun Context.dpToPx(dp:Int):Float{
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dp.toFloat(),
        this.resources.displayMetrics
    )
}

fun Context.dpToIntPx(dp:Int):Int {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dp.toFloat(),
        this.resources.displayMetrics
    ).toInt()
}