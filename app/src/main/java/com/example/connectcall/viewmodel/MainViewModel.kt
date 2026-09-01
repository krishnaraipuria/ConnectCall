package com.example.connectcall.viewmodel

import androidx.lifecycle.ViewModel
import com.example.connectcall.remote.FirebaseClient
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val firebaseClient: FirebaseClient
): ViewModel() {

}