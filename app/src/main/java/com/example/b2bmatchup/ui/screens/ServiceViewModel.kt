package com.example.b2bmatchup.ui.screens

import androidx.lifecycle.ViewModel
import com.example.b2bmatchup.model.ServiceUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ServiceViewModel :ViewModel(){

    private val _uiState = MutableStateFlow(ServiceUiState())
    val uiState: StateFlow<ServiceUiState> = _uiState.asStateFlow()

    fun updateInformationsOne(
        companyName: String ,
        email: String ,
        password: String ,
        companyDescription: String ,
        serviceType: String ,
    ){
        _uiState.update {currentState ->
            currentState.copy(
                companyName = companyName,
                email = email,
                password = password,
                companyDescription = companyDescription,
                serviceType = serviceType
            )
        }
    }
}

