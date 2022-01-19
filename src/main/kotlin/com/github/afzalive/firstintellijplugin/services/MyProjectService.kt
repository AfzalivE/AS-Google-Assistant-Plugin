package com.github.afzalive.firstintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.afzalive.firstintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
