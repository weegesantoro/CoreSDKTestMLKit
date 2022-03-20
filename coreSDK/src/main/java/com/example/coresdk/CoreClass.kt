package com.example.coresdk

import com.google.mlkit.vision.pose.PoseDetection
import com.google.mlkit.vision.pose.accurate.AccuratePoseDetectorOptions

class CoreClass {
    val hiddenProperty = "you can't find me"

    fun usingMLKit(): Int {
        // Accurate pose detector on with streaming frames, when depending on the pose-detection-accurate sdk
        val options = AccuratePoseDetectorOptions.Builder()
            .setDetectorMode(AccuratePoseDetectorOptions.STREAM_MODE)
            .build()
        val poseDetector = PoseDetection.getClient(options)
        return poseDetector.detectorType
    }
}