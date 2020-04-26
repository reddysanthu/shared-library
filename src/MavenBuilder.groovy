class MavenBuilder{
  
  def mavenBuild(){
    Map map_var
    sh "mvn ${map_var.builder.maven.goal}"
  }
}
