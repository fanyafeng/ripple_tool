package com.ripple.tool.date

import java.text.SimpleDateFormat
import java.util.*

/**
 * Author: fanyafeng
 * Data: 2020/7/20 16:49
 * Email: fanyafeng@live.cn
 * Description:
 */

/**
 * 转换日期
 */
@JvmOverloads
fun Long.long2Date(pattern: String = "yyyy-MM-dd HH:mm:ss:SSS"): String {
    val date = Date(this)
    val sd = SimpleDateFormat(pattern, Locale.getDefault())
    return sd.format(date)
}

fun getNowTimeString(): String {
    val dateFormat = SimpleDateFormat("[ yyyy年MM月dd日HH时mm分ss秒 ]", Locale.CHINA)
    return dateFormat.format(Date(System.currentTimeMillis()))
}

fun Date.defaultFormat() = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.CHINA).format(this)