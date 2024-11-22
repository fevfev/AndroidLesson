package com.student.threenumbers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.student.threenumbers.ui.theme.ThreeNumbersTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThreeNumbersTheme {
                Answer()
            }
        }
    }
}

@Composable
fun Answer() {
    val userNumber = remember { mutableIntStateOf(0) }
    Column { //https://developer.android.com/develop/ui/compose/layouts/basics
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "Отгадай число от 1 до 3",
        ) //https://developer.android.com/develop/ui/compose/layouts/basics
        Spacer(modifier = Modifier.height(50.dp))
        Row {
            Button(onClick = {
                userNumber.value = 1
            }) {
                Text("1", fontSize = 25.sp)
            }
            Button(onClick = {
                userNumber.value = 2
            }) {
                Text("2", fontSize = 25.sp)
            }
            Button(onClick = {
                userNumber.value = 3
            }) {
                Text("3", fontSize = 25.sp)
            }
        }

        if (userNumber.value != 0) {
            println("user number $userNumber")
            if (userNumber.value == Random.nextInt(1, 3)) {
                Text(
                    "Вы выиграли",
                )
            } else {
                Text(
                    "Вы проигали",
                )
            }
        }
    }

}

@Preview(showBackground = true) //https://developer.android.com/develop/ui/compose/tooling/previews 
@Composable
fun GreetingPreview() {
    ThreeNumbersTheme {
        Answer()
    }
}

/*
Придумать свои условия для игры или добавить элементы
*/