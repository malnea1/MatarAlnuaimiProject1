package cosc455.towson.edu

/**
  * Created by MBH on 11/10/2016.
  */

  trait SyntaxAnalyzer {
    def gittex() : Unit
    def title() : Unit
    def body() : Unit
    def paragraph() : Unit
    def innertext() : Unit
    def heading() : Unit
    def vardef() : Unit
    def varuse() : Unit
    def bold() : Unit
    def italics() : Unit
    def listitem() : Unit
    def inneritem() : Unit
    def link() : Unit
    def images() : Unit
    def newline() : Unit
  }
