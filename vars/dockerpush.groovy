def call(String project, String imageTag, String hubUser){
    
    withCredentials([usernamePassword(credentialsId: 'tharun', passwordVariable: 'pass', usernameVariable: 'user')]) {
      sh "docker login -u '$user' -p '$pass'"
    }
    sh "docker push ${hubUser}/${project}:${imageTag}"

}