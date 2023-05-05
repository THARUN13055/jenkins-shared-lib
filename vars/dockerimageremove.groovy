def call(String project, String imageTag, String hubUser){
  sh "docker rmi -f ${docker images -aq}"
}