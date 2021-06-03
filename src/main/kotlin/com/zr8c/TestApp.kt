package com.zr8c

import tornadofx.*

class TestApp: App(TestView::class)

class TestView: View() {
    override val root = label("Hello Kotlin!")
}

fun main(args: Array<String>) {
    launch<TestApp>(args)
}