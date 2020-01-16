#!/usr/bin/env groovy
import com.cleverbuilder.GlobalVars

def call(String name = 'human') {
  echo "Hello, ${name}."
  println GlobalVars.foo
}

