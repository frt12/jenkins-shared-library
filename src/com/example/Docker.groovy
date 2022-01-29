#!/usr/bin/env groovy
package com.example

class Docker implements Serializable {

    def script

    Docker(script) {
        this.script = script
    }

    def buildDockerImage(String imageName) {
        script.echo "building the docker image..."
        
    }

    def dockerLogin() {
        script.echo "logining in docker hub"
        }
    }

    def dockerPush(String imageName) {
        script.echo "docker push image"
    }

}
