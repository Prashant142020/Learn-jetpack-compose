package com.example.learn.L1_basics.C1_basics

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showSystemUi = true)
@Composable
private fun Prev_T2_1Screen() {
    TutorialContent()
}


@Composable
fun TutorialContent(modifier: Modifier = Modifier) {


}


@Composable
fun ClickableModifierExample(modifier: Modifier = Modifier) {
    // Provides a Context that can be used by Android applications
    val context = LocalContext.current

    // Weight in Row acts as Weight in LinearLayout with horizontal orientation

    Row(Modifier.height(120.dp)) {

        Column(modifier = Modifier
            .weight(1f)
            .fillMaxSize()
            .background(Color(0xFF388E3C))
            .clickable {
//                onClick = {
//                    Toast.makeText(
//                        context,
//                        "surface(Right ) Inside Box is clicked",
//                        Toast.LENGTH_SHORT
//                    )
//                        .show()
//
//                }
            }


        ) {

        }

    }

}