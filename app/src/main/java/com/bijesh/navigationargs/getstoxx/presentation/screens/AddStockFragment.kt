package com.bijesh.navigationargs.getstoxx.presentation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
//import androidx.fragment.app.viewModels
import com.bijesh.navigationargs.databinding.FragmentAddStockBinding
import com.bijesh.navigationargs.getstoxx.presentation.screens.view_models.AddStockFragmentViewModel
import com.bijesh.navigationargs.getstoxx.presentation.screens.view_models.BaseViewModelV3
import org.koin.androidx.viewmodel.ext.android.viewModel


class AddStockFragment : MVVMBaseFragmentV3() {

    private var _binding: FragmentAddStockBinding? = null
    private val binding get() = _binding

//    private val viewModel : AddStockFragmentViewModel by viewModels()
    private val viewModel : AddStockFragmentViewModel by viewModel<AddStockFragmentViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddStockBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       binding?.let { binding ->
           binding.ivCalender.setOnClickListener {
               viewModel.openCalendar(requireContext())
           }
       }
        initObservers()
    }

    private fun initObservers(){
        viewModel.dateSelection.observe(viewLifecycleOwner){ date ->
            binding?.let {
//                binding!!.etInvestmentDate.setText(date)
            }
        }

        viewModel.uiState.observe(viewLifecycleOwner){ uiState ->
            when(uiState){
                is BaseViewModelV3.UiState.OnSuccess<*> -> {
                    when(uiState.holder){
                        is AddStockFragmentViewModel.UiState.OpenCalenderSuccess -> {
                            binding!!.etInvestmentDate.setText(uiState.holder.selectedDate)
                        }
                    }
                }
                is BaseViewModelV3.UiState.OnError -> {

                }
                is BaseViewModelV3.UiState.OnLoading -> {

                }
                is BaseViewModelV3.UiState.OnIdle -> {

                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = AddStockFragment()
    }
}