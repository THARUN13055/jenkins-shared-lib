def call(){
  sh "docker rmi -f ${docker images -aq}"
}