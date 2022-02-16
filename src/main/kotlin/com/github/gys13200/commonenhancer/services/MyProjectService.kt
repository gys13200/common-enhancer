package com.github.gys13200.commonenhancer.services

import com.intellij.openapi.project.Project
import com.github.gys13200.commonenhancer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
