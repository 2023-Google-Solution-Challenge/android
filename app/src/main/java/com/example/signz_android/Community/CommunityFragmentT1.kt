package com.example.signz_android.Community

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.signz_android.BoardData
import com.example.signz_android.OMain.*
import com.example.signz_android.databinding.FragmentCommunityT1Binding

class CommunityFragmentT1 : Fragment() {
    private lateinit var binding: FragmentCommunityT1Binding
    private lateinit var listAdapter: CommunityT1RVAdapter

    private val board = ArrayList<BoardData>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommunityT1Binding.inflate(inflater, container, false)

        binding.btnWriteBoard.setOnClickListener {
            startActivity(Intent(context, CommunityBoardWriteActivity::class.java))
        }

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        board.apply { add(BoardData("Can I get a weekly holiday pay?", "che**y", "2023-03-25", 1, 16))
            add(BoardData("About employment contract", "knv**7", "2023-03-16", 2, 12))
            add(BoardData("Inquiries about the minimum wage", "ye**j", "2023-03-15", 1, 20))
            add(BoardData("Please help me with my salary", "hye**j", "2023-03-12", 4, 35))}
        listAdapter = CommunityT1RVAdapter(board)
        binding.communityT1Recycle.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.communityT1Recycle.adapter = listAdapter

        listAdapter.setItemClickListener(object : CommunityT1RVAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                val intent = Intent(activity, CommunityBoardViewActivity::class.java)
                startActivity(intent)
            }

        })

    }

}