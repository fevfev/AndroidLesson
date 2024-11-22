package com.student.cv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.student.cv.ui.theme.CVTheme
import com.student.cv.ui.theme.Purple40
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CVTheme {
                    CVScreen()
                }
        }
    }
}

@Composable
fun CVScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
         // Оформить колонку https://developer.android.com/develop/ui/compose/layouts/basics
        ) {
            Image(
                painter = painterResource(id = R.drawable.head), // !!! Заменить на свое фото или изображение !!!
                contentDescription = "Profile Picture",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            // Разделить элементы с помощью Spacer https://developer.android.com/develop/ui/compose/modifiers?hl=ru  https://metanit.com/kotlin/jetpack/4.10.php или Divider https://developer.android.com/develop/ui/compose/components/divider?hl=ru
            Text(
                text = "ФИО: Иванов Иван Иванович", // !!! Заменить своими данными  !!!
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            /*  !!! По аналогии добавить 1-2 блоки с информацией о себе !!!
             Применить собственный стиль оформления (Поменять на свое изображение, изменить стиль и цвета текста, изменить иконки приложения и экрана загрузки, добавить доп оформление по желанию)
              Доп задание разобраться с Scaffold  https://developer.android.com/develop/ui/compose/components/scaffold?hl=ru
             Доп задание разобраться с LazyColumn  https://developer.android.com/develop/ui/compose/lists?hl=ru https://metanit.com/kotlin/jetpack/2.6.php
            */ Добавить элементы на свое усмотрение
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CVTheme {
        CVScreen()
    }
}