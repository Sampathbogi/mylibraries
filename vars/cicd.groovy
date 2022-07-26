def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
   sh 'mvn package'
}
def newDeploy(credentials,ip,context)
{
  deploy adapters: [tomcat9(credentialsId: "${credentials}", path: '', url: "${ip}")], contextPath: ${context}, war: '**/*.war'
}
