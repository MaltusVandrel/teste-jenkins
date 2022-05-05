
def build(){
    echo 'building in a groovy way...'
    sh 'npm install'
    sh 'ng build'
    
}
def test(){
    echo 'testing in a groovy way...'
    // sh 'ng test'    
}
def deploy(){
    echo 'deploying in a groovy way...'
    sh 'sudo  cp -R dist/teste-jenkins /home/arena/applications'    
    sh 'sudo  cp /home/arena/applications/teste-jenkins/assets/logo_.png /home/arena/applications/teste-jenkins/assets/logo.png'    
    sh ' http-server  /home/arena/applications/teste-jenkins -p 8082'    
}

return this