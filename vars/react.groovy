def call(){
 def buildCommand =  "npm install"
  def nodeImage = "node:14-alpine"
  docker.image(nodeImage).inside(nodeEnv){
    sh 'npm install'
  }
}
