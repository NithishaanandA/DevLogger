package skynetbee.developer.nithish

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.Date
import java.util.Locale

//  
// DevLogger.kt
// skynetbee.developer.nithish
//
// Created by A. Nithish A on 01-03-2025



val _File = Thread.currentThread().stackTrace[3].fileName

val _Line = Thread.currentThread().stackTrace[3].lineNumber

@RequiresApi(Build.VERSION_CODES.O)
val _Date = LocalDate.now().toString()

val _Time: String
    get() {
        val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        return sdf.format(Date())
    }