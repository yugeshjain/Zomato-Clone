package com.yugesh.zomatoclone.screens.restaurantScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yugesh.zomatoclone.R

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun OfferRowItem(
    offerText: String,
    couponCode: String
) {

    Card(
        modifier = Modifier
            .padding(5.dp)
            .width(170.dp),
        shape = RoundedCornerShape(10.dp),
        onClick = { },
        backgroundColor = Color.White,
        elevation = 4.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.discount_png),
                contentDescription = "Discount Image",
                tint = Color(0xFF3D6DDF),
                modifier = Modifier
                    .size(28.dp)
                    .padding(end = 2.dp)
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(3.dp),
            ) {
                Text(
                    text = offerText,
                    color = Color.Black,
                    overflow = TextOverflow.Clip,
                    maxLines = 1,
                    softWrap = true,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp
                )
                Text(
                    text = "use code $couponCode",
                    color = Color.Black,
                    overflow = TextOverflow.Clip,
                    maxLines = 1,
                    softWrap = true,
                    fontSize = 12.sp
                )
            }
        }
    }
}
