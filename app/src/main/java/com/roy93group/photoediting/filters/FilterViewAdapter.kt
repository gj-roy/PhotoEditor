package com.roy93group.photoediting.filters

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Pair
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.roy93group.photoediting.R
import com.roy.photoeditor.PhotoFilter
import java.io.IOException
import java.util.ArrayList

/**
 * @author [Burhanuddin Rashid](https://github.com/burhanrashid52)
 * @version 0.1.2
 * @since 5/23/2018
 */
class FilterViewAdapter(private val mFilterListener: FilterListener) :
    RecyclerView.Adapter<FilterViewAdapter.ViewHolder>() {
    private val mPairList: MutableList<Pair<String, PhotoFilter>> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.v_row_filter_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filterPair = mPairList[position]
        val fromAsset = getBitmapFromAsset(holder.itemView.context, filterPair.first)
        holder.mImageFilterView.setImageBitmap(fromAsset)
        holder.mTxtFilterName.text = filterPair.second.name.replace("_", " ")
    }

    override fun getItemCount(): Int {
        return mPairList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mImageFilterView: ImageView = itemView.findViewById(R.id.imgFilterView)
        val mTxtFilterName: TextView = itemView.findViewById(R.id.txtFilterName)

        init {
            itemView.setOnClickListener{
                mFilterListener.onFilterSelected(
                    mPairList[layoutPosition].second
                )
            }
        }
    }

    private fun getBitmapFromAsset(context: Context, strName: String): Bitmap? {
        val assetManager = context.assets
        return try {
            val istr = assetManager.open(strName)
            BitmapFactory.decodeStream(istr)
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    private fun setupFilters() {
        mPairList.add(Pair("filters/filter_original.jpg", PhotoFilter.NONE))
        mPairList.add(Pair("filters/filter_auto_fix.png", PhotoFilter.AUTO_FIX))
        mPairList.add(Pair("filters/filter_brightness.png", PhotoFilter.BRIGHTNESS))
        mPairList.add(Pair("filters/filter_contrast.png", PhotoFilter.CONTRAST))
        mPairList.add(Pair("filters/filter_documentary.png", PhotoFilter.DOCUMENTARY))
        mPairList.add(Pair("filters/filter_dual_tone.png", PhotoFilter.DUE_TONE))
        mPairList.add(Pair("filters/filter_fill_light.png", PhotoFilter.FILL_LIGHT))
        mPairList.add(Pair("filters/filter_fish_eye.png", PhotoFilter.FISH_EYE))
        mPairList.add(Pair("filters/filter_grain.png", PhotoFilter.GRAIN))
        mPairList.add(Pair("filters/filter_gray_scale.png", PhotoFilter.GRAY_SCALE))
        mPairList.add(Pair("filters/filter_lomish.png", PhotoFilter.LOMISH))
        mPairList.add(Pair("filters/filter_negative.png", PhotoFilter.NEGATIVE))
        mPairList.add(Pair("filters/filter_posterize.png", PhotoFilter.POSTERIZE))
        mPairList.add(Pair("filters/filter_saturate.png", PhotoFilter.SATURATE))
        mPairList.add(Pair("filters/filter_sepia.png", PhotoFilter.SEPIA))
        mPairList.add(Pair("filters/filter_sharpen.png", PhotoFilter.SHARPEN))
        mPairList.add(Pair("filters/filter_temprature.png", PhotoFilter.TEMPERATURE))
        mPairList.add(Pair("filters/filter_tint.png", PhotoFilter.TINT))
        mPairList.add(Pair("filters/filter_vignette.png", PhotoFilter.VIGNETTE))
        mPairList.add(Pair("filters/filter_cross_process.png", PhotoFilter.CROSS_PROCESS))
        mPairList.add(Pair("filters/filter_b_n_w.png", PhotoFilter.BLACK_WHITE))
        mPairList.add(Pair("filters/filter_flip_horizental.png", PhotoFilter.FLIP_HORIZONTAL))
        mPairList.add(Pair("filters/filter_flip_vertical.png", PhotoFilter.FLIP_VERTICAL))
        mPairList.add(Pair("filters/filter_rotate.png", PhotoFilter.ROTATE))
    }

    init {
        setupFilters()
    }
}