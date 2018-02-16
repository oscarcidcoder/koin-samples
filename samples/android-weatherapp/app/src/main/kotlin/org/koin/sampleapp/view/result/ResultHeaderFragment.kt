package org.koin.sampleapp.view.result

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_weather_title.*
import org.koin.sampleapp.R
import org.koin.sampleapp.util.ext.argument
import org.koin.sampleapp.view.Arguments.ARG_ADDRESS
import org.koin.sampleapp.view.Arguments.ARG_WEATHER_DATE
import java.util.*

class ResultHeaderFragment : Fragment() {

    val TAG = javaClass.simpleName

    // Get address
    private val address by argument<String>(ARG_ADDRESS)
    // get Last date
    private val now by argument<Date>(ARG_WEATHER_DATE)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_weather_title, container, false) as ViewGroup
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        weatherTitle.text = getString(R.string.weather_title).format(address, now)
    }
}