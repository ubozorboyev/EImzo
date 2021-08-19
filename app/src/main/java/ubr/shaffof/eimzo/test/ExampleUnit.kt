package ubr.shaffof.eimzo.test

class ExampleUnit {

    companion object {

        data class UserData(val name: String, val userName: String, val phone: String)
    }

    private val users = listOf(UserData("ubr", "ubr77", "0011"))


    fun setEmailAddress(email: String): Int {
        return email.indexOf('@')
    }

    fun validUser(userData: UserData): Boolean {
        return when {
            userData.name.isEmpty() || userData.userName.isEmpty() -> false
            users.contains(userData) -> false
            else -> true
        }
    }

}