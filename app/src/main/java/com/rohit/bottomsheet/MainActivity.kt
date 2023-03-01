package com.rohit.bottomsheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.rohit.bottomsheet.databinding.ActivityMainBinding
import com.rohit.bottomsheet.databinding.SheetBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            var dialog = BottomSheetDialog(this)
            var  sheetBinding=SheetBinding.inflate(layoutInflater)
            dialog.setContentView(sheetBinding.root)
            sheetBinding.tvName.setText(binding.tvtext1.text.toString())
            sheetBinding.btnG.setOnClickListener {
                if (sheetBinding.tvName.text.isEmpty()){
                    sheetBinding.tvName.error="Enter Name"
                }else{
                    binding.tvtext1.text=sheetBinding.tvName.text.toString()
                    dialog.dismiss()
                }
            }
            dialog.show()
        }
    }
}