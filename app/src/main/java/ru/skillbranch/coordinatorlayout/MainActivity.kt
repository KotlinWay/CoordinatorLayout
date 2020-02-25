package ru.skillbranch.coordinator_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import ru.skillbranch.coordinator_layout.extensions.init
import ru.skillbranch.coordinatorlayout.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        fab.setOnClickListener {
//            Snackbar.make(coordinator_container, "hello", Snackbar.LENGTH_SHORT).show()
//        }

        setupFabs()
    }

    private fun setupFabs() {
        mini1.init(-96f, -96f)
        mini2.init(0f, -128f)
        mini3.init(96f, -96f)

        fab.setOnClickListener {
            if (mini1.isOrWillBeShown) mini1.hide() else mini1.show()
            if (mini2.isOrWillBeShown) mini2.hide() else mini2.show()
            if (mini3.isOrWillBeShown) mini3.hide() else mini3.show()
        }
    }
}
