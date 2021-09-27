package com.github.pickupstar.wxread.services

import com.intellij.openapi.project.Project
import com.github.pickupstar.wxread.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
