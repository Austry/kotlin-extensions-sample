package com.austry.samplelib

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.i_image.*

class SampleHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    val image = sample_image
}