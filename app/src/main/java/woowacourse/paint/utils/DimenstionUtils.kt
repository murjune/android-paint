package woowacourse.paint.utils

import android.content.res.Resources

val density = Resources.getSystem().displayMetrics.density

val Int.dp
    get(): Int = (density * this).toInt()

val Float.dp
    get(): Float = density * this

val Int.px
    get(): Int = (this / density).toInt()

val Float.px
    get(): Float = this / density