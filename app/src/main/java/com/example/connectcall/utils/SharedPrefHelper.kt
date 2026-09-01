package com.example.connectcall.utils

import android.content.Context
import javax.inject.Inject
import androidx.core.content.edit

class SharedPrefHelper @Inject constructor(context: Context){

    private  val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    companion object{
        private const val PREF_NAME = "mini_chat_pref"
        private const val USER_ID = "user_id"
    }

    fun getuserId(): String{
        val userId = sharedPreferences.getString(USER_ID, null)
        return if(userId.isNullOrEmpty()){
            val newUserId = java.util.UUID.randomUUID().toString().substring(0,6)
            saveUserId(newUserId)
            newUserId
        }
        else {
            userId
        }
    }

    private  fun saveUserId(userId: String){
        sharedPreferences.edit { putString(USER_ID, userId) }

    }
}