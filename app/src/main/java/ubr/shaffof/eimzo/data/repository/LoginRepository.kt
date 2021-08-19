package ubr.shaffof.eimzo.data.repository

import kotlinx.coroutines.flow.flow
import okhttp3.MultipartBody
import okhttp3.RequestBody
import ubr.shaffof.eimzo.data.ApiServer
import ubr.shaffof.eimzo.data.model.LoginData
import ubr.shaffof.eimzo.util.DataState
import java.lang.Exception
import javax.inject.Inject

class LoginRepository @Inject constructor(private val apiServer: ApiServer) {


    suspend fun loginUser(loginData: LoginData) = flow {

        try {
            emit(DataState.Loading)

            val requestBody = MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("username", loginData.username)
                .addFormDataPart("password", loginData.password).build()

            val response = apiServer.loginApi(requestBody = requestBody)

            if (response.isSuccessful) emit(DataState.SuccessData(response.body()))
            else emit(DataState.ErrorData(response.message()))


        } catch (e: Exception) {
            e.printStackTrace()
        }
    }



}