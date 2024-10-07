package woowacourse.paint.view.shape

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

data class Pencil(
    override val startX: Float,
    override val startY: Float,
    override val paint: Paint,
    override val strokeWidth: Float,
) : BrushShape(startX, startY, paint, strokeWidth) {
    private val path =
        Path().apply {
            moveTo(startX, startY)
        }

    override fun updatePosition(
        x: Float,
        y: Float,
    ) {
        path.lineTo(x, y)
    }

    override fun draw(canvas: Canvas) {
        canvas.drawPath(path, paint)
    }
}