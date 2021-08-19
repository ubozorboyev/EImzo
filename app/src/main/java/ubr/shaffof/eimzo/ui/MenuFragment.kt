package ubr.shaffof.eimzo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import ubr.shaffof.eimzo.databinding.FragmentMenuBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment
import java.util.*

@AndroidEntryPoint
class MenuFragment : BaseFragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.calendarView.setDate(Calendar.getInstance().timeInMillis, true, true)

    }


}