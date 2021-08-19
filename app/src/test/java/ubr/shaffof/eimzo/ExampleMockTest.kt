package ubr.shaffof.eimzo

import androidx.lifecycle.Observer
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.mock
import ubr.shaffof.eimzo.test.ExampleViewModel

class ExampleMockTest {

    private val viewModel by lazy { ExampleViewModel() }

    @Mock
    private lateinit var mockObserver: Observer<String>


    @Test
    fun testData() {

    }


    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
       val data =  mock<String> {  }


    }


}