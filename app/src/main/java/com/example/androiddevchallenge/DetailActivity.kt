/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.getFakePuppyList
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Detail(intent.getParcelableExtra("puppy")!!)
            }
        }
    }
}

@Composable
fun Detail(puppy: Puppy) {
    Surface(color = Color.White, modifier = Modifier.fillMaxHeight(1f)) {
        PuppyDetail(puppy = puppy)
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun DetailPreview() {
    MyTheme {
        Detail(getFakePuppyList()[0])
    }
}

@Composable
fun PuppyDetail(puppy: Puppy) {
    Row(verticalAlignment = Alignment.Top, modifier = Modifier.padding(16.dp)) {
        Column {
            Image(
                painter = painterResource(puppy.image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                puppy.name, Modifier.padding(top = 8.dp), fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Text(puppy.description, Modifier.padding(top = 8.dp))
        }
    }
}
