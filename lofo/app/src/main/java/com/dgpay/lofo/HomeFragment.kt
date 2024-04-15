package com.dgpay.lofo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dgpay.lofo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<GridFragmentAdapter.GridViewHolder>? = null

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


        binding.rvFoods.apply {


            layoutManager = GridLayoutManager(activity, 2)
            val gridHeroAdapter = GridFragmentAdapter(list)
            adapter = gridHeroAdapter
        }

    }
}