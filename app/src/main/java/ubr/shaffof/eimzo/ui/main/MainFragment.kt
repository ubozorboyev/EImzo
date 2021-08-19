package ubr.shaffof.eimzo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import ubr.shaffof.eimzo.R
import ubr.shaffof.eimzo.databinding.FragmentMainBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment

class MainFragment : BaseFragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val navController = Navigation.findNavController(requireActivity(), R.id.navigation_home_host)

        binding.bottomNavigationView.setupWithNavController(navController)


    }


}