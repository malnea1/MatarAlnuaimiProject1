package cosc455.towson.edu

/**
  * Created by MBH on 11/10/2016.
  */

  trait LexicalAnalyzer {
    def addChar() : Unit
    def getChar() : Char
    def getNextToken() : Unit
    def lookup() : Unit = {
      println("this is lookup implementation!")
    }
  }
