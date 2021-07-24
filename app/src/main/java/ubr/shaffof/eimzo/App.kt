package ubr.shaffof.eimzo

import android.app.Application
import uz.sicnt.horcrux.Horcrux

class App : Application() {

    companion object {
        lateinit var instance: Application

        //        lateinit var context: Context
        lateinit var horcrux: Horcrux
    }

    private val apiKey =
        "B5246D3FC838676B72044A7E894D409C8DD43A0544609875956D54E98860594E4CE9BFAD801F9BF988A10BC53E3247E8E12958366F22E8965943E6737FA39E4C"

    override fun onCreate() {
        super.onCreate()
        instance = this
//        context = applicationContext
        horcrux =
            Horcrux(
                applicationContext,
                apiKey
            )
    }
}