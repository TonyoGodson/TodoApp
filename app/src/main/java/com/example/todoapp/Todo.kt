package com.example.todoapp

data class Todo(
    val completed: Boolean,
    var id: Int,
    val title: String,
    val userId: Int
)
