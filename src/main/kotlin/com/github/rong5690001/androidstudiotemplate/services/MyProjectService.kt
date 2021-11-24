package com.github.rong5690001.androidstudiotemplate.services

import com.intellij.openapi.project.Project
import com.github.rong5690001.androidstudiotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
