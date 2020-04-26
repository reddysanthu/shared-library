class MavenBuilder{
Map map_var
  def mavenBuild(){
    sh "mvn ${map_var.builder.maven.goal}"
  }
}
