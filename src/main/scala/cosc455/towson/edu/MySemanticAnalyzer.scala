package cosc455.towson.edu

/**
  * Created by MBH on 11/13/2016.
  */
class MySemanticAnalyzer extends MySyntaxAnalyzer{
  override def gittex(): Unit = {
    if (Compiler.currentToken.equalsIgnoreCase(CONSTANTS.DOCB)){
      // add to parse tree / stack
      Compiler.Scanner.getNextToken()
    }
    else {
      println("Error")
      System.exit(1)
    }
  }

  override def paragraph(): Unit = ???

  override def inneritem(): Unit = ???

  override def innertext(): Unit = ???

  override def link(): Unit = ???

  override def italics(): Unit = ???

  override def body(): Unit = ???

  override def bold(): Unit = ???

  override def newline(): Unit = ???

  override def title(): Unit = ???

  override def vardef(): Unit = ???

  override def images(): Unit = ???

  override def varuse(): Unit = ???

  override def heading(): Unit = ???

  override def listitem(): Unit = ???

}
