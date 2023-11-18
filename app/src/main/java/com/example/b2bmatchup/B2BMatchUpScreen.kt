package com.example.b2bmatchup

import androidx.annotation.StringRes


enum class B2BMatchUpScreen(@StringRes val title:Int){
    SignUp(R.string.signup),
    LogIn(R.string.login),
    UpdateCompanyScreen(R.string.company_profile),
    ChooseService(R.string.choose_service),
    ListOfCompanies(R.string.choose_a_company),
    ServiseDetailesScreen(R.string.company_profile)
}


