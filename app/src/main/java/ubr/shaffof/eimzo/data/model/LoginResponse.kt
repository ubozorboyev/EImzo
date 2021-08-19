package ubr.shaffof.eimzo.data.model

data class LoginResponse(
    val avaibleRole: List<AvaibleRole>,
    val role: List<RoleData>,
    val user: User
)

data class AvaibleRole(
    val created_at: Int,
    val `data`: Any,
    val description: String,
    val group_code: Any,
    val name: String,
    val rule_name: Any,
    val type: Int,
    val updated_at: Int
)

data class RoleData(
    val created_at: Int,
    val `data`: Any,
    val description: String,
    val group_code: Any,
    val name: String,
    val rule_name: Any,
    val type: Int,
    val updated_at: Int
)

data class User(
    val auth_key: String,
    val bind_to_ip: String,
    val city_id: Int,
    val confirmation_token: Any,
    val created_at: Int,
    val email: String,
    val email_confirmed: Int,
    val fio: String,
    val id: Int,
    val password_hash: String,
    val phone: Any,
    val region: Int,
    val registration_ip: String,
    val signature: String,
    val status: Int,
    val superadmin: Int,
    val type_user: Int,
    val uid: Int,
    val updated_at: Int,
    val username: String
)