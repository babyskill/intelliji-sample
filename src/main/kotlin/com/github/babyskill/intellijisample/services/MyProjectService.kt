package com.github.babyskill.intellijisample.services

import com.github.babyskill.intellijisample.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
