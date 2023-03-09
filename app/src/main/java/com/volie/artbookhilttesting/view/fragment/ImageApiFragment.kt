package com.volie.artbookhilttesting.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.volie.artbookhilttesting.adapter.ImageRecyclerAdapter
import com.volie.artbookhilttesting.databinding.FragmentImageApiBinding
import javax.inject.Inject

class ImageApiFragment @Inject constructor(
    imageRecyclerAdapter: ImageRecyclerAdapter
) : Fragment() {
    private var _mBinding: FragmentImageApiBinding? = null
    private val mBinding get() = _mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _mBinding = FragmentImageApiBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _mBinding = null
    }
}