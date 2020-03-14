package com.example.myapp.usecase

import com.example.myapp.RetrofitUtil
import com.example.myapp.UserService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class GetUserDataUsecase {
    val userService: UserService =
        RetrofitUtil.retrofitBuilder().create(UserService::class.java)

    fun userdata(id: Int) = userService.getUserData(id)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}