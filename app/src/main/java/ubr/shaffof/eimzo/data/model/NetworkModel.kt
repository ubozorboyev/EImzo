package ubr.shaffof.eimzo.data.model

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ubr.shaffof.eimzo.data.ApiServer
import ubr.shaffof.eimzo.util.Common.BASE_URL
import javax.inject.Singleton


@Module()
@InstallIn(SingletonComponent::class)
object NetworkModel {


    @Volatile
    private lateinit var retrofit: Retrofit


    @Provides
    @Singleton
    fun getOkHttpClient(@ApplicationContext context: Context): OkHttpClient {

        val logging = HttpLoggingInterceptor()

        logging.level = HttpLoggingInterceptor.Level.BODY

        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

    }


    @Provides
    @Singleton
    fun getApiInterface(okHttpClient: OkHttpClient): ApiServer {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiServer::class.java)

    }


}