def call(){
    
    withCredentials([usernamePassword(credentialsId: 'tharun', passwordVariable: 'pass', usernameVariable: 'user')]) {
      sh "docker login -u '$user' -p '$pass'"
    }
    
}