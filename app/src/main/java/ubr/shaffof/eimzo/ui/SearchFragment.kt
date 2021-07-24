package ubr.shaffof.eimzo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ubr.shaffof.eimzo.databinding.FragmentSearchBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment

class SearchFragment : BaseFragment() {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }


}