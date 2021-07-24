package ubr.shaffof.eimzo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ubr.shaffof.eimzo.databinding.FragmentAptCategoryBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment

class AptCategoryFragment : BaseFragment() {

    private lateinit var binding: FragmentAptCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAptCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

}