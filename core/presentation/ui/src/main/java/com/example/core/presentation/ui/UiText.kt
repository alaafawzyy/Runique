package com.example.core.presentation.ui

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

sealed interface UiText {

    data class DynamicText(val value:String):UiText

    class StringResource(
        @StringRes val id:Int,
        val args:Array<Any> = arrayOf()
         ):UiText

    @Composable
    fun asString():String{
       return when(this){   // ← this نوعه UiText (عام)
            is DynamicText ->value
           // ✨ هنا Kotlin عرف إن this أكيد من نوع DynamicText
           // فـ Kotlin حوّل this تلقائياً لـ DynamicText
           // يعني بقى this as DynamicText
           //value  // ← value موجودة في DynamicText ✅
          // يعني فعلياً: (this as DynamicText).value
            is StringResource -> stringResource(id,*args)
        }
    }

    fun asString(context:Context):String{
        return when(this){
            is DynamicText ->value
            is StringResource -> context.getString(id,*args)
        }
    }
}



/*
interface Employee {
    fun getSalary(): Int  // ← كل موظف لازم يقدر يجيب مرتبه
}

class Developer: Employee {  // ← المبرمج موظف
    // ✅ تلقائياً عنده getSalary()
}

class Designer: Employee {   // ← المصمم موظف
    // ✅ تلقائياً عنده getSalary()
}

// الاستخدام:
val dev = Developer()
dev.getSalary()  // ✅ يقدر لأنه Employee

val des = Designer()
des.getSalary()  // ✅ يقدر لأنه Employee






sealed interface UiText {
    fun asString(): String  // ← كل UiText لازم يقدر يتحول لـ String
}

// DynamicString هو UiText ✅
val text1 = DynamicString("مرحباً")
text1.asString()  // ✅ يقدر لأنه UiText

// StringResource هو UiText ✅
val text2 = StringResource(R.string.hello)
text2.asString()  // ✅ يقدر لأنه UiText
 */