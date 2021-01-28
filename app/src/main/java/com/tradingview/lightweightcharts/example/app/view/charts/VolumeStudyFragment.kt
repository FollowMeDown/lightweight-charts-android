package com.tradingview.lightweightcharts.example.app.view.charts

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import com.tradingview.lightweightcharts.api.options.models.*
import com.tradingview.lightweightcharts.example.app.view.charts.BaseFragment
import com.tradingview.lightweightcharts.example.app.viewmodel.BarChartViewModel
import com.tradingview.lightweightcharts.example.app.viewmodel.VolumeStudyViewModel

class VolumeStudyFragment: BaseFragment<VolumeStudyViewModel>() {

    override fun provideViewModel() {
        viewModel = ViewModelProvider(this).get(VolumeStudyViewModel::class.java)
    }

    override fun applyChartOptions() {
        firstChartApi.applyOptions {
            layout = layoutOptions {
                backgroundColor = Color.parseColor("#131722")
                textColor = Color.parseColor("#d1d4dc")
            }
            rightPriceScale = priceScaleOptions {
                scaleMargins = priceScaleMargins {
                    top = 0.3f
                    bottom = 0.25f
                }
                borderVisible = false
            }
            grid = gridOptions {
                vertLines = gridLineOptions {
                    color = Color.argb(0, 42, 46, 57)
                }
                horzLines = gridLineOptions {
                    color = Color.argb(0.6f, 42f, 46f, 57f)
                }
            }
        }
    }
}