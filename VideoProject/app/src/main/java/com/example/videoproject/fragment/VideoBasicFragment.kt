package com.example.videoproject.fragment

import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import com.example.videoproject.MainActivity
import com.example.videoproject.R
import com.example.videoproject.util.dialogBasic
import kotlinx.android.synthetic.main.fragment_video_basic.*

class VideoBasicFragment : Fragment() {

    private lateinit var videoView: VideoView
    private lateinit var mediaController: MediaController
    private lateinit var currentActivity: MainActivity
    private var videoRootPath: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        currentActivity = activity as MainActivity
        videoRootPath = "android.resource://${currentActivity.packageName}/"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val currentView = inflater.inflate(R.layout.fragment_video_basic, container, false)
        with(currentView)
        {
            videoView = videoView_fragment_video_basic
        }
        mediaController = MediaController(currentActivity)
        return currentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mediaController.apply {
            setAnchorView(videoView)
            setMediaPlayer(videoView)
        }

        videoView.apply {
            setMediaController(mediaController)
            setVideoURI(Uri.parse(videoRootPath + R.raw.pexels_videos))
            setOnCompletionListener {
                dialogBasic(currentActivity, "동영상 재생을 완료 하였습니다.").show()
            }
        }.requestFocus()

        Handler().postDelayed({
            mediaController.show(0)
        }, 100)
    }
}
