package ubr.shaffof.eimzo.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ubr.shaffof.eimzo.data.model.LoginData
import ubr.shaffof.eimzo.data.model.LoginResponse
import ubr.shaffof.eimzo.data.repository.LoginRepository
import ubr.shaffof.eimzo.util.DataState
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: LoginRepository) :
    ViewModel() {

    private val _responseData = MutableLiveData<DataState<LoginResponse>>()
    val responseData: LiveData<DataState<LoginResponse>> get() = _responseData


    fun loginUser(loginData: LoginData) {

        viewModelScope.launch {
            repository.loginUser(loginData).collect {
                _responseData.postValue(it)
            }
        }
    }


}