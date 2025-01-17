package com.campusdigitalfp.habitossaludables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.campusdigitalfp.habitossaludables.navigation.Navigation
import com.campusdigitalfp.habitossaludables.sampledata.SampleData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleData.loadData(this)
        enableEdgeToEdge()
        setContent {
            Navigation()
             }
           }
        }



