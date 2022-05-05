def test(){
    echo 'testing in a groovy way...'
    sh 'ng test'    
}
def build(){
    echo 'building in a groovy way...'
    sh 'npm install'
    sh 'ng build --watch'
    
}
def deploy(){
    echo 'deploying in a groovy way...'
    sh 'cp -R dist/teste-jenkins /home/arena/applications'    
    sh 'cp /home/arena/applications/teste-jenkins/assets/logo_.png /home/arena/applications/teste-jenkins/assets/logo.png'    
    sh 'lite-server --baseDir="/home/arena/applications/teste-jenkins"'    
}

return this