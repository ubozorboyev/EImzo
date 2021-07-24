package ubr.shaffof.eimzo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import ubr.shaffof.eimzo.R
import ubr.shaffof.eimzo.databinding.FragmentHomeBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment

class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val navController = Navigation.findNavController(requireActivity(), R.id.navigation_home_host)


        binding.bottomNavigationView.setupWithNavController(navController)


    }


}