/*
 * Copyright 2018 Google LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.videoplayersample

import android.net.Uri
import android.support.v4.media.MediaDescriptionCompat

/**
 * Manages a set of media metadata that is used to create a playlist for [VideoActivity].
 */

open class MediaCatalog(private val list: MutableList<MediaDescriptionCompat>) :
        List<MediaDescriptionCompat> by list {

    companion object : MediaCatalog(mutableListOf())

    init {
        // More creative commons, creative commons videos - https://www.blender.org/about/projects/
        list.add(
                with(MediaDescriptionCompat.Builder()) {
                    setDescription("MP4 loaded from assets folder")
                    setMediaId("1")
                    setMediaUri(Uri.parse("asset:///video_1.mp4"))
                    //setMediaUri(Uri.parse("http://download.blender.org/peach/bigbuckbunny_movies/BigBuckBunny_320x180.mp4"))
                    setTitle("Video 1")
                    setSubtitle("local video")
                    build()
                })
        list.add(
                with(MediaDescriptionCompat.Builder()) {
                    setDescription("MP4 loaded from assets folder")
                    setMediaId("2")
                    setMediaUri(Uri.parse("asset:///video_2.mp4"))
                    setTitle("Video 2")
                    setSubtitle("local video")
                    build()
                })
        list.add(
                with(MediaDescriptionCompat.Builder()) {
                    setDescription("MP4 loaded from assets folder")
                    setMediaId("3")
                    setMediaUri(Uri.parse("asset:///video_3.mp4"))
                    setTitle("Video 3")
                    setSubtitle("local video")
                    build()
                })
    }
}