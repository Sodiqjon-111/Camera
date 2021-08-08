package com.simplemobiletools.camera

import android.app.IntentService
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simplemobiletools.commons.extensions.getFilenameFromPath
import com.simplemobiletools.commons.helpers.REFRESH_PATH
import kotlinx.android.synthetic.main.activity_upload_image.*
import android.graphics.BitmapFactory

import android.graphics.Bitmap
import android.util.Base64


class UploadImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_image)


        val image = intent.getStringExtra(REFRESH_PATH)

        tv_text_description.text = image


       // val bm = BitmapFactory.decodeFile(image)
        truc_image1.setImageBitmap(BitmapFactory.decodeFile(image))


    }
}
