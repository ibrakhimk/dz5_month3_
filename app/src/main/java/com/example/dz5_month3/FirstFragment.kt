package com.example.dz5_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.dz5_month3.databinding.FragmentFirstBinding
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle.parent

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding;
    var num = 0
    val KEY_NAME = "name"

    @OptIn(InternalCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        binding.btnSend.setOnClickListener {
            val editText : EditText = binding.editN
            val input = editText.text.toString()
            val bundle = Bundle()
            bundle.putString("data",input)
            val fragment = SecondFragment()
            fragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction()?.replace(R.id.container_o,fragment)?.commit()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener {
            num++
            binding.textView.text = num.toString()
            if(num>9){
                binding.btnPlus.visibility = View.GONE
            }
        }
        binding.btnMinus.setOnClickListener {
            num -= 1
            binding.textView.text = num.toString()
            if (num<1){
                binding.btnMinus.visibility = View.GONE
            }
        }

//            requireActivity().supportFragmentManager.beginTransaction()
//                .replace(R.id.container_o, SecondFragment()).commit()
//            val bundle = Bundle()
//            bundle.putString(KEY_NAME, "Sharik")
//            val secondFragment = SecondFragment()
//            secondFragment.arguments=bundle
        }

    }


//        binding.btnPlus.setOnClickListener {
//            num++
//            binding.textView.text = num.toString()
//            when (num) {
//                10 -> {
//                    binding.btnPlus.visibility = View.GONE
//                }
//            }
//        }
//        binding.btnMinus.setOnClickListener {
//            num -= 1
//            binding.textView.text = num.toString()
//            when (num) {
//                0 -> {
//                    binding.btnMinus.visibility = View.GONE
//                }
//            }
//        }