package com.example.teste_ps_raccoon

interface UpdateAndDelete{
    fun modifyItem(itemUID :String, isDone: Boolean)
    fun onItemDelete(itemUID: String)
}