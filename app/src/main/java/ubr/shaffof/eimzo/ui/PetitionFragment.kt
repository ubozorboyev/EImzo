package ubr.shaffof.eimzo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ubr.shaffof.eimzo.R
import ubr.shaffof.eimzo.databinding.FragmentPetitionBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment

class PetitionFragment : BaseFragment() {

    private lateinit var binding: FragmentPetitionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPetitionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.notificationIcon.setOnClickListener {

            findNavController().navigate(R.id.aptCategoryFragment)

        }

    }


}