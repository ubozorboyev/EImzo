package ubr.shaffof.eimzo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExampleViewModel : ViewModel() {

    /*


    here have view model fo controlling data layer and ui layer


    */

    private val _message = MutableLiveData<String>()
    val message: LiveData<String> get() = _message

}

