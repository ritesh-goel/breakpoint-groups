package com.github.riteshgoel.breakpointgroups.services

import com.github.riteshgoel.breakpointgroups.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
