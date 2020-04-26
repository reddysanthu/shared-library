class MavenBuilder{
  def mavenBuild(Map map){
    sh "mvn ${map.builder.maven.goal}"
  }
}
