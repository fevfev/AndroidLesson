package com.student.notesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.student.notesapp.ui.theme.NotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotesTheme {
                    NotesScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesScreen() {
    var noteText by remember { mutableStateOf("") }
    var notesList by remember { mutableStateOf(listOf<String>()) }

    Scaffold(
        topBar = { //https://developer.android.com/develop/ui/compose/components/app-bars
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),  // TopAppBar https://developer.android.com/develop/ui/compose/components/app-bars
                title = {
                    Text("Мои дела")
                }
            )
        },
        floatingActionButton = {  // https://developer.android.com/develop/ui/compose/components/fab?hl=ru
            FloatingActionButton(onClick = {
                if (noteText.isNotEmpty()) {
                    notesList = notesList + noteText
                    noteText = ""
                }
            }) {
                Icon(Icons.Default.Add, contentDescription = "Добавить заметку")
            }
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            TextField( //https://developer.android.com/develop/ui/compose/text/user-input?hl=ru
                value = noteText,
                onValueChange = { noteText = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Введите текст заметки") }
            )

            LazyColumn {
                items(notesList.size) { index ->
                    Text(
                        text = notesList[index],
                        fontSize = 18.sp,
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NotesTheme {
        NotesScreen()
    }
}

/*
Изменить тему, иконку и описание на собственную, добавить эдементы по желанию
Прочитать про Shared-preferences https://developer.android.com/training/data-storage/shared-preferences
DataStore https://developer.android.com/topic/libraries/architecture/datastore
Room https://developer.android.com/training/data-storage/room

   Задачи на модуль данных Обновить функцию NotesScreen для работы с сохранением и удалением данных
   Добавить категории для разных типов задач
   Добавить чекбоксы для выполненных задач
   Добавить изменение и удаление задач
*/