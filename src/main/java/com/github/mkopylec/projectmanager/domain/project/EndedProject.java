package com.github.mkopylec.projectmanager.domain.project;

public class EndedProject {

    private String projectIdentifier;

    public EndedProject(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }
}