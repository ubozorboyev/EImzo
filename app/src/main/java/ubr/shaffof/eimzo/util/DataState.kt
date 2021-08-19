package ubr.shaffof.eimzo.util

sealed class DataState<out T> {

    object Loading : DataState<Nothing>()
    class SuccessData<T>(val data: T?) : DataState<T>()
    class ErrorData(val message: String?) : DataState<Nothing>()

}
