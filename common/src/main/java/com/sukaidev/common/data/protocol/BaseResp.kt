package com.sukaidev.common.data.protocol

/**
 * Created by sukai on 2019/08/10.
 *
 */
data class BaseResp<out T>(val status: Int, val message: String, val data: T)