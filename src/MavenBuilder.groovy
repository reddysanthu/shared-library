class MavenBuilder{
Map map_var
  def mavenBuild(){
    script{
      sh "mvn "+ map_var.builder.maven.goal
    }
  }
}
