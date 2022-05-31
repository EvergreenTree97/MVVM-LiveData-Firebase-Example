package com.example.mvvm_firebase_authentication.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_firebase_authentication.repository.AuthRepository
import com.google.firebase.auth.FirebaseUser

class MainViewModel : ViewModel(){
    private var authRepository: AuthRepository = AuthRepository()
    private val _userLiveData = authRepository.userLiveData

    val userLiveData: LiveData<FirebaseUser>
        get() = _userLiveData


    fun getUser(idToken: String){
        authRepository.getUser(idToken)
    }
}

