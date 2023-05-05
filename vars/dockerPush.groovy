def call(String project, String imageTag, String hubUser){
  sh """
    docker image build -t ${hubUser}/${project}:${imageTag} .
  """
}