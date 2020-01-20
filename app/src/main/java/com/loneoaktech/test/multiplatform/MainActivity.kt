package com.loneoaktech.test.multiplatform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jetbrains.handson.mpp.mobile.SampleItem
import com.jetbrains.handson.mpp.mobile.createApplicationScreenMessage
import com.jetbrains.handson.mpp.mobile.serializeSample
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloView.text = createApplicationScreenMessage()

        val item = SampleItem(
            name="Maven",
            length = 13,
            width = 4
        )

        jsonView.text = serializeSample( item )
    }
}
