package ubr.shaffof.eimzo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ubr.shaffof.eimzo.R
import ubr.shaffof.eimzo.databinding.FragmentLoginBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment

class LoginFragment : BaseFragment() {

    private lateinit var binding: FragmentLoginBinding

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
            findNavController().navigate(R.id.homeFragment)
        }

    }

}