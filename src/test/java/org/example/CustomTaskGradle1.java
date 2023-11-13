package org.example;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class CustomTaskGradle1 extends DefaultTask {
    @Input
    private String name;

    public void setName(String name){
        this.name = name;
    }

    @TaskAction
    public void performTask(){
        if(name != null){
            System.out.println("gk ada nama");
        }
        else{
            System.out.println("ada nama");
        }
    }
}
