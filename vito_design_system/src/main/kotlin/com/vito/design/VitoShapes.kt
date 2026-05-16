package com.vito.design

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * Vito Shapes System.
 * Per DESIGN.md §7
 */
object VitoShapes {
    val extraSmall = RoundedCornerShape(4.dp)  // chips, badges
    val small = RoundedCornerShape(8.dp)          // input fields, small cards
    val medium = RoundedCornerShape(12.dp)         // cards, list items
    val large = RoundedCornerShape(16.dp)         // bottom sheets, modals
    val extraLarge = RoundedCornerShape(24.dp)      // hero cards, FABs

    // Bottom sheet specific (rounded top corners only)
    val bottomSheet = RoundedCornerShape(
        topStart = 20.dp,
        topEnd = 20.dp,
        bottomStart = 0.dp,
        bottomEnd = 0.dp
    )

    // M3 Shapes mapping
    val material3 = Shapes(
        extraSmall = extraSmall,
        small = small,
        medium = medium,
        large = large,
        extraLarge = extraLarge
    )
}