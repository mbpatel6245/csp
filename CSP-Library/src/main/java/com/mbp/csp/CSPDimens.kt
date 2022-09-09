package com.mbp.csp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun ProvideFontDimens(
    dimensions: ComposableDimens,
    content: @Composable () -> Unit
) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

private val LocalAppDimens = staticCompositionLocalOf {
    ComposableDimens()
}

@Composable
fun getFontDimensType(): ComposableDimens {
    val screenWidthDp = LocalConfiguration.current.screenWidthDp
    return when {
        screenWidthDp <= 300 -> {
            sw300sp
        }
        screenWidthDp <= 330 -> {
            sw330sp
        }
        screenWidthDp <= 360 -> {
            sw360sp
        }
        screenWidthDp <= 390 -> {
            sw390sp
        }
        screenWidthDp <= 420 -> {
            sw420sp
        }
        screenWidthDp <= 450 -> {
            sw450sp
        }
        screenWidthDp <= 480 -> {
            sw480sp
        }
        screenWidthDp <= 510 -> {
            sw510sp
        }
        screenWidthDp <= 540 -> {
            sw540sp
        }
        screenWidthDp <= 570 -> {
            sw570sp
        }
        screenWidthDp <= 600 -> {
            sw600sp
        }
        screenWidthDp <= 630 -> {
            sw630sp
        }
        screenWidthDp <= 660 -> {
            sw660sp
        }
        screenWidthDp <= 690 -> {
            sw690sp
        }
        screenWidthDp <= 720 -> {
            sw720sp
        }
        screenWidthDp <= 750 -> {
            sw750sp
        }
        screenWidthDp <= 780 -> {
            sw780sp
        }
        screenWidthDp <= 810 -> {
            sw810sp
        }
        screenWidthDp <= 840 -> {
            sw840sp
        }
        screenWidthDp <= 870 -> {
            sw870sp
        }
        screenWidthDp <= 900 -> {
            sw900sp
        }
        screenWidthDp <= 930 -> {
            sw930sp
        }
        screenWidthDp <= 960 -> {
            sw960sp
        }
        screenWidthDp <= 990 -> {
            sw990sp
        }
        screenWidthDp <= 1020 -> {
            sw1020sp
        }
        screenWidthDp <= 1050 -> {
            sw1050sp
        }
        screenWidthDp <= 1080 -> {
            sw1080sp
        }
        else -> ComposableDimens()
    }
}

object CSP {
    val dimens: ComposableDimens
        @Composable
        get() = LocalAppDimens.current
}

val Dimens: ComposableDimens
    @Composable
    get() = CSP.dimens