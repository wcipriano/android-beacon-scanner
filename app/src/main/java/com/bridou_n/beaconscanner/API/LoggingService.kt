package com.bridou_n.beaconscanner.API

import android.os.Environment
import com.bridou_n.beaconscanner.models.LoggingRequest
import io.reactivex.Completable
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Url
import java.io.File
import java.io.PrintWriter

/**
 * Created by bridou_n on 24/08/2017.
 */

interface LoggingService {
    @POST
    fun postLogs(@Url url: String, @Body beacons: LoggingRequest) : Completable
}