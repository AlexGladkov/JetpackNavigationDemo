package ru.agladkov.uitls.navigation

interface NavigationProvider {
    fun launch(navCommand: NavCommand)
}