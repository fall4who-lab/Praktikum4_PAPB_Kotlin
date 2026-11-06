package com.example.praktikum4_kotlin_naufal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.praktikum4_kotlin_naufal.ui.theme.Praktikum4_Kotlin_NaufalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Tugas 3: satu object Student
        val student = Student(name = "Naufal", score = 85)
        val resultTugas3 = formatStudent(student)

        //Tugas 1: List berisi minimal tiga Student
        val students = listOf(
            Student("Ani", 90),
            Student("Budi", 75),
            Student("Citra", 65),
            Student(null, 50)
        )
        val resultTugas1 = students.joinToString("\n") { formatStudent(it) }

        setContent {
            Column(modifier = Modifier.padding(32.dp)) {
                Text("Tugas 3:")
                Text(resultTugas3)
                Text("")
                Text("Tugas 1:")
                Text(resultTugas1)
            }
        }
    }
}