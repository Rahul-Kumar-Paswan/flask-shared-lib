#!/usr/bin/env groovy

import com.example.Docker

def call(String imageName){
    echo "deploying the docker image... from groovy from call"
    return new Docker(this).deployApp(imageName)
}