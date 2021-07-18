package com.github.artdoncenter.tempplugin.services

import com.github.artdoncenter.tempplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
