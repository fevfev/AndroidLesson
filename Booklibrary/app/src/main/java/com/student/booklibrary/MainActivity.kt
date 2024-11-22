@file:Suppress("ComposePreviewMustBeTopLevelFunction")

package com.student.booklibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.animation.with
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.student.booklibrary.ui.theme.BooklibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BooklibraryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BookCard(
                        Добавить переменные, подсказка о переменных в функции
                    )
                }
                }
            }
        }
    }

    @Composable
    fun BookCard(
        bookTitle: String,
        bookDescription: String,
        bookImageRes: Int
    ) {


    Card( //https://developer.android.com/develop/ui/compose/components/card
        Добавить элемент карточки для вывода карточки товара
        ),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Изображение обложки книги, добавить через image свое изображение импортировать в проект
            Image(
         
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Название книги, добавить Text элемент
            Text(
              
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Кнопка "Подробнее"
            (
                // https://developer.android.com/develop/ui/compose/components/button?hl=ru
                )
            ) {
                Text(if (expanded) "Скрыть" else "Подробнее")
            }

            // Анимация при полном описание
            AnimatedVisibility(visible = expanded) {
             
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Кнопка "Добавить в избранное" с анимацией
            Button(
               
            ) {
                // Добавить анимацию при выборе состояния
                    if (*****) {
                        Icon(
                        //   Добавить иконку активную, можно изменять саму иконку или цвет иконки
                        )
                    } else {
                        Icon(
                           //Обычная иконка
                        )
                    }
                }
            }
        }
    }
}

/*
Изменить тему и цветовое оформление на подходящее к обложке, добавить анимацию появления текста и изменить цвета текста, желатьельно на градиент.
* */