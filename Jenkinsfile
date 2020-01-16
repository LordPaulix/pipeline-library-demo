import com.cleverbuilder.GlobalVars 
@Library('pipeline-library-demo')_

node('RyanPC') {
  stage('Demo') {
    echo 'Hello World'
    sayHello 'Dave'
    println GlobalVars.foo
  }
}
