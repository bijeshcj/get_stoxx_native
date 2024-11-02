package com.bijesh.navigationargs.getstoxx.presentation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bijesh.navigationargs.databinding.FragmentMvvmBaseV3Binding


/**
 * A simple [Fragment] subclass.
 * Use the [MVVMBaseFragmentV3.newInstance] factory method to
 * create an instance of this fragment.
 */
open class MVVMBaseFragmentV3 : Fragment() {

    private lateinit var bBinding: FragmentMvvmBaseV3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bBinding = FragmentMvvmBaseV3Binding.inflate(inflater,container,false)
        return bBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleBundle()

    }

    open fun handleBundle() {
        // no-op, override to implement
    }


}