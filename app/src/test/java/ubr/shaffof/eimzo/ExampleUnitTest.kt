package ubr.shaffof.eimzo

import org.junit.Test

import org.junit.Assert.*
import com.google.common.truth.Truth.*
import org.mockito.Mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    private val exampleUnit = ExampleUnit()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    @Throws(Exception::class)
    fun isValidEmailAddress() {
        val index = exampleUnit.setEmailAddress("ubozorboyev97@gmail.com")
        assertTrue(index > 0)
    }

    @Test
    fun `signUp function returns false when username or password is empty`() {
        val userName = "Ubr"
        val password = "12345"
        val repeatPassword = "12345"
        assertThat(AuthUtil.signUp(userName, password, repeatPassword)).isTrue()
    }

    @Test
    fun `signUp function returns false password is equals repeat password`() {
        val userName = "John 1"
        val password = "ubr123321"
        val repeatPassword = "ubr123321"
        assertThat(AuthUtil.signUp(userName, password, repeatPassword)).isTrue()
    }

    @Test
    @Throws(Exception::class)
    fun validUser() {
        assertTrue(exampleUnit.validUser(ExampleUnit.Companion.UserData("0ubr", "ubr77", "0011")))
    }


    @Test
    fun `valid fun for user if user already exits return false`() {
        assertTrue(
            exampleUnit.validUser(
                ExampleUnit.Companion.UserData(
                    "ubr777",
                    "unabsorbed",
                    "0997"
                )
            )
        )

    }







}
