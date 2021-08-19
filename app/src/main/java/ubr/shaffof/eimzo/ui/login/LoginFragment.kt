package ubr.shaffof.eimzo.ui.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ubr.shaffof.eimzo.R
import ubr.shaffof.eimzo.data.model.LoginData
import ubr.shaffof.eimzo.databinding.FragmentLoginBinding
import ubr.shaffof.eimzo.extension.longToast
import ubr.shaffof.eimzo.extension.shortToast
import ubr.shaffof.eimzo.ui.base.BaseFragment
import ubr.shaffof.eimzo.util.Common
import ubr.shaffof.eimzo.util.DataState


@AndroidEntryPoint
class LoginFragment : BaseFragment() {

    private lateinit var binding: FragmentLoginBinding
    private val viewModel by viewModels<LoginViewModel>()

    private val TAG = "LoginFragment"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.verificationButton.setOnClickListener {
            validUser()
        }

        viewModel.responseData.observe(viewLifecycleOwner) {

            when (it) {
                is DataState.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is DataState.SuccessData -> {
                    binding.progressBar.visibility = View.INVISIBLE

                    Log.d(TAG, "onViewCreated: ${it.data}")

                    if (it.data?.user?.status != null && it.data.user.status == 0)
                        "Sizda malumotlardan foydalanish uchun ruxsat yo'q".longToast(requireContext())
                    else if (it.data?.user?.status == 1) {

                        Common.token = it.data.user.auth_key
                        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
                    }

                }
                is DataState.ErrorData -> {
                    binding.progressBar.visibility = View.INVISIBLE
                    it.message?.shortToast(requireContext())
                }
            }

        }
    }


    private fun validUser() {

        binding.loginLayout.error = ""
        binding.passwordLayout.error = ""
        var valid = true

        val login = binding.inputLogin.text.toString()
        val password = binding.inputPassword.text.toString()

        if (login.isEmpty()) {
            binding.loginLayout.error = "login is empty"
            valid = false
        }

        if (password.isEmpty()) {
            binding.passwordLayout.error = "password is empty"
            valid = false
        }

        if (valid) viewModel.loginUser(LoginData(login, password))

    }


}