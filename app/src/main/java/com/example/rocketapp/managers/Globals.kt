package com.ddtech.ddverifier.managers

import android.graphics.Bitmap
import android.view.SurfaceControl
import com.example.rocketapp.model.rocketsmodel
import java.util.*

public class Globals {

    companion object {
        private var instance: Globals? = null

        val shared: Globals
            get() {
                if (instance == null) {
                    instance = Globals()
                }

                return instance!!
            }
    }



    val BaseWebservice = "https://api.spacexdata.com/v3/"
    var StoredData : rocketsmodel? = null



}