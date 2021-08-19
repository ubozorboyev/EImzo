package ubr.shaffof.eimzo.data

import android.graphics.Paint
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*
import ubr.shaffof.eimzo.data.model.LoginResponse


interface ApiServer {

    @POST("auth")
    suspend fun loginApi(
         @Body requestBody: RequestBody
    ): Response<LoginResponse>


}