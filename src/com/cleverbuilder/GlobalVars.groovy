#!/usr/bin/env groovy
package com.cleverbuilder
import com.cleverbuilder.GlobalVars

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}
