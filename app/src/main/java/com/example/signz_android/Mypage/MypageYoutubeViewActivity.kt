package com.example.signz_android.Mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signz_android.databinding.MypageYoutubeviewBinding
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener

class MypageYoutubeViewActivity : AppCompatActivity() {
    private lateinit var binding : MypageYoutubeviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MypageYoutubeviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAllBack.setOnClickListener {
            finish()
        }

        val id = intent.getStringExtra("id").toString()

        lifecycle.addObserver(binding.youTubePlayerView)
        binding.youTubePlayerView.addYouTubePlayerListener(object: AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.cueVideo(id, 0f)
            }
        })
    }
}