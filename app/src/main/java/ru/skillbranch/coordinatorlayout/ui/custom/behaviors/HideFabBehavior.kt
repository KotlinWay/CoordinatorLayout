package ru.skillbranch.coordinator_layout

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HideFabBehavior() : CoordinatorLayout.Behavior<FloatingActionButton>() {
    constructor(ctx: Context, attrs: AttributeSet) : this()

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: FloatingActionButton,
        dependency: View
    ): Boolean {
        dependency as CustomFab
        return if (dependency.isChecked && dependency.isOrWillBeHidden) {
            Log.wtf("HideFabBehavior","onDependentViewChanged hide")
            child.hide(); true
        } else if (dependency.isChecked) {
            Log.wtf("HideFabBehavior","onDependentViewChanged show")
            child.show(); true
        } else {
            Log.wtf("HideFabBehavior","onDependentViewChanged false")
            false
        }
    }
}