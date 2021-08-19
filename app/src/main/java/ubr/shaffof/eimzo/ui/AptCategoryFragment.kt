package ubr.shaffof.eimzo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import ubr.shaffof.eimzo.databinding.FragmentAptCategoryBinding
import ubr.shaffof.eimzo.ui.base.BaseFragment

@AndroidEntryPoint
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }
}

fun main() {

    println(countPrimes(3))

}

fun countPrimes(n: Int): Int {

    var count = 0

    if (n == 2) return 1
    else if (n <= 1) return 0

    for (i in 2..n) {
        if (isPrime(i)) count ++
    }

    return count
}

fun isPrime(number: Int): Boolean {

    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }

    return true

}
