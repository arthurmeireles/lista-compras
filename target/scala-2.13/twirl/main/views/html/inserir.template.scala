
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object inserir extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Questão 2")/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""<form action=""""),_display_(/*3.20*/controllers/*3.31*/.routes.HomeController.inserirProduto()),format.raw/*3.70*/("""" method="post">
        <label for="Nome">Nome do Produto:</label>
        <input type="text" name="nome" placeholder="Digite o nome do produto">
        <br>
        <label for="quantidade">Quantidade:</label>
        <input type="text" name="quantidade" placeholder="Digite a quantidade do produto">
        <br>
        <button type="submit">Enviar</button>
    </form>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-17T11:09:41.219
                  SOURCE: C:/Users/Administrador/Desktop/Prova-recuperaco/questao-2/app/views/inserir.scala.html
                  HASH: 27fd5f556940f7c6fd79ea380ae776db75aefe6c
                  MATRIX: 943->1|1039->5|1064->22|1102->23|1133->28|1174->43|1193->54|1252->93
                  LINES: 28->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3
                  -- GENERATED --
              */
          