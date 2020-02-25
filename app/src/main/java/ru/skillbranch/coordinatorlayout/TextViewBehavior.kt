package ru.skillbranch.coordinator_layout

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.math.MathUtils
import androidx.core.view.ViewCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TextViewBehavior(context: Context, attributeSet: AttributeSet) : CoordinatorLayout.Behavior<TextView>(
    context, attributeSet
) {
    override fun onStartNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: TextView,
        directTargetChild: View,
        target: View,
        axes: Int,
        type: Int
    ): Boolean {
        return axes == ViewCompat.SCROLL_AXIS_VERTICAL
    }

    override fun onNestedPreScroll(
        coordinatorLayout: CoordinatorLayout,
        child: TextView,
        target: View,
        dx: Int,
        dy: Int,
        consumed: IntArray,
        type: Int
    ) {
        Log.wtf("FabBehavior","onNestedPreScroll dy = $dy")
        var clamp = MathUtils.clamp(child.translationY + dy, 0f, child.minHeight.toFloat())
        child.translationY = clamp
        Log.wtf("FabBehavior","onNestedPreScroll ${child.translationY} clamp = $clamp")
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type)
    }
}