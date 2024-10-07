package woowacourse.paint

import woowacourse.paint.view.BrushType

data class PanelState(
    val type: PanelType,
    val brushType: BrushType = BrushType.PEN,
) {
    val blushColorVisible: Boolean
        get() = type == PanelType.BRUSH_COLOR

    val brushStrokeVisible: Boolean
        get() = type == PanelType.BRUSH_STROKE

    val toolVisible: Boolean
        get() = type == PanelType.TOOL
}