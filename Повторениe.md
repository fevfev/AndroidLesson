# 📘 **Повторение: Kotlin и Jetpack Compose**

Этот конспект поможет вспомнить ключевые элементы Kotlin и Jetpack Compose. Особое внимание уделим анимациям и визуализации данных. 🚀  

---

## **🔑 Основы Kotlin**

### **1. Переменные**
- `val` — неизменяемые значения.
- `var` — изменяемые переменные.

```kotlin
val greeting = "Hello, Compose!"
var count = 0
count += 1
```
## 2. Типы данных

* Числа: Int, Float, Double.
* Логические: Boolean.
* Текст: String.
* Коллекции: List, Set, Map.

```kotlin
fun main() {
    val a: Int = 1000
    val b: String = "message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    val numbers = listOf(1, 2, 3)
    val unique = setOf("A", "B", "A")
    val map = mapOf("key" to "value")
    }
```

## 3. Функции
```kotlin
fun greet(name: String): String = "Hello, $name!"
val square = { x: Int -> x * x }
```

## 4. Классы
### простой класс:
```kotlin
class Person(val name: String, var age: Int)
```

### Data-классы:

```kotlin
data class User(val id: Int, val username: String)
```
# 🎨 Jetpack Compose

## 1. Компоненты
Все UI-элементы создаются через функции, помеченные аннотацией @Composable.

```kotlin
@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}
```

## 2. Основные элементы UI

![alt text](image-10.png)

### Text
```kotlin
Text(
    text = "Welcome to Jetpack Compose!",
    color = Color.Blue,
    fontSize = 18.sp,
    fontWeight = FontWeight.Bold
)
```
## Button
![alt text](image-11.png)
```kotlin
Button(onClick = { /* Событие нажатия */ }) {
    Text("Нажми на меня")
}
```
## Image
![alt text](image-12.png)
```kotlin
Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Example image",
            modifier = Modifier.size(100.dp)
        )
```
## TextField

![alt text](image-13.png)

```kotlin
 var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Введите текст") }
        )

```

# 📐 Расположение элементов (Layout)

Compose предоставляет мощные инструменты для верстки, позволяя компоновать элементы вертикально, горизонтально или накладывать их друг на друга.



## Column Колонка (вертикальная группа элементов ):

Элементы размещаются друг под другом.

Свойства:
* verticalArrangement — управление расстоянием между элементами (например, SpaceAround, Top).
* horizontalAlignment — выравнивание по горизонтали (например, CenterHorizontally, Start).

![alt text](image-14.png)

```kotlin
Column {
    Text("Элемент 1")
    Text("Элемент 2")
}

```

## Row Ряд (горизонтальная группа):
Элементы размещаются в строку.
Свойства:
* horizontalArrangement — управление расстоянием между элементами (например, SpaceEvenly, Start).
* verticalAlignment — выравнивание по вертикали (например, CenterVertically, Top).

![alt text](image-15.png)

```kotlin
Row {
    Text("Слева")
    Spacer(modifier = Modifier.width(8.dp))
    Text("Справа")
}


```

## Box коробка (накладывающиеся элементы):

Элементы накладываются друг на друга.

Свойства:
* contentAlignment — задает выравнивание вложенных элементов.
* Используй модификаторы align(Alignment) для индивидуального выравнивания.

![alt text](image-16.png)

```kotlin

Box(modifier = Modifier.size(100.dp)) {
    Text("Слой 1", modifier = Modifier.align(Alignment.TopStart))
    Text("Слой 2", modifier = Modifier.align(Alignment.Center))
}

```
## LazyColumn (список) 

![alt text](image-22.png)

Для работы с длинными списками или динамическими данными.
Свойства:
* items() — генерирует элементы из списка или диапазона.
* verticalArrangement — расстояние между элементами.

```kotlin
@Composable
fun LazyColumnExample() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(50) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}
```
![alt text](image-23.png)

## LazyRow (горизонтальный список)

Свойства:
* items() — генерирует элементы из списка или диапазона.
* horizontalArrangement  — расстояние между элементами.

```kotlin 
@Composable
fun LazyRowExample() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(50) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}
```
## Spacer (разделитель пространства)

![alt text](image-24.png)

```kotlin
@Composable
fun SpacerExample() {
    Column {
        Text("До")
        Spacer(modifier = Modifier.height(16.dp))
        Text("После")
    }
}
```

## Modifier: Настройка внешнего вида
### Модификаторы позволяют изменять размер, выравнивание, отступы, фоны и многое другое.

```kotlin 
 @Composable
        fun ModifierExample() {
            Text(
                "Styled Text",
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.LightGray)
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { /* Handle click */ }
            )
        }

        ModifierExample()
```



# Темы и стили

Применение темы нашего приложения, для применения оформления темы оборачиваем элементы темой:
## Без темы
![alt text](image-19.png)
## С темой
![alt text](image-20.png)

```kotlin
ExampleAppTheme {
    Button(onClick = { /* Событие нажатия */ }) {
    Text("Нажми на меня")
}
}

```

# 🌟 Анимации в Jetpack Compose

Для применения анимации в приложении Jetpack Compose предоставляет специальный API - Animation API. Этот API состоит из классов и функций, которые предоставляют широкие возможности по созданию анимации. Рассмотрим ключевые функции и классы Animation API.

Так, Compose Animation API предоставляет ряд анимаций состояния компонентов. В частности, это функции анимации для значений типов Bounds, Color, Dp, Float, Int, IntOffset, IntSize, Offset, Rect и Size. Подобные функции покрывают большинство потребностей в анимации компонентов.

Подобные функции анимаций используют одно и то же соглашение об именах. В частности, все они называются по шаблону:
```	
animate*AsState
```

## Анимация изменения состояния

![alt text](click.gif)

```kotlin
@Composable
private fun AnimatableSample() {
    var isAnimated by remember { mutableStateOf(false) }

    val color = remember { Animatable(Color.DarkGray) }

    // animate to green/red based on `button click`
    LaunchedEffect(isAnimated) {
        color.animateTo(if (isAnimated) Color.Green else Color.Red, animationSpec = tween(2000))
    }

    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f)
            .background(color.value)
    )
    Button(
        onClick = { isAnimated = !isAnimated },
        modifier = Modifier.padding(top = 10.dp)
    ) {
        Text(text = "Animate Color")
    }
}
```
## Анимация размера:

![alt text](size.gif)

```kotlin
@Composable
fun CircleImage(imageSize: Dp) {
    Image(
        painter = painterResource(R.drawable.andy_rubin),
        contentDescription = "Circle Image",
        contentScale = ContentScale.Crop,  
        modifier = Modifier
            .size(imageSize)
            .clip(CircleShape) 
            .border(5.dp, Color.Gray, CircleShape) 
    )
}

@Composable
private fun AnimateDpAsState() {
    val isNeedExpansion = rememberSaveable{ mutableStateOf(false) }
    
    val animatedSizeDp: Dp by animateDpAsState(targetValue = if (isNeedExpansion.value) 350.dp else 100.dp)

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        CircleImage(animatedSizeDp)
        Button(
            onClick = { 
            isNeedExpansion.value = !isNeedExpansion.value 
            },
            modifier = Modifier
                .padding(top = 50.dp)
                .width(300.dp)
        ) {
            Text(text = "animateDpAsState")
        }
    }
}
```
# 📚 Документация

[Jetpack Compose Basics Codelab](https://developer.android.com/codelabs/jetpack-compose-basics#0)

[Compose Animations](https://developer.android.com/jetpack/compose/animation)

[Layout in Compose](https://developer.android.com/jetpack/compose/layouts)