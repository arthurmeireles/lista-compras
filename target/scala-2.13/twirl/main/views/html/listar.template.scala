
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

object listar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Produto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lista : List[Produto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Lista de Compras")/*3.26*/{_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<h2>Lista de compras</h2>
    <ul>
        """),_display_(/*7.10*/for(produto <- lista) yield /*7.31*/{_display_(Seq[Any](format.raw/*7.32*/("""
            """),format.raw/*8.13*/("""<li>
                <p>"""),_display_(/*9.21*/produto/*9.28*/.getNome),format.raw/*9.36*/("""</p>
                <p>"""),_display_(/*10.21*/produto/*10.28*/.getQuantidade),format.raw/*10.42*/("""</p> 

                <a href=""""),_display_(/*12.27*/controllers/*12.38*/.routes.HomeController.incrementar(lista.indexOf(produto))),format.raw/*12.96*/("""" style="margin: 0px 30px;"> Incrementar quantidade </a>
                <a href=""""),_display_(/*13.27*/controllers/*13.38*/.routes.HomeController.decrementar(lista.indexOf(produto))),format.raw/*13.96*/("""" style="margin: 0px 30px;;"> Diminuir  quantidade</a>
                <a href=""""),_display_(/*14.27*/controllers/*14.38*/.routes.HomeController.remover(lista.indexOf(produto))),format.raw/*14.92*/("""" style="margin: 0px 30px; color: white; background-color: red; text-decoration: none;"> Excluir filme </a>
            </li> 
        """)))}),format.raw/*16.10*/("""
    """),format.raw/*17.5*/("""</ul>
    <br>
    <a href="/inserir">Clique para inserir produto</a>
""")))}))
      }
    }
  }

  def render(lista:List[Produto]): play.twirl.api.HtmlFormat.Appendable = apply(lista)

  def f:((List[Produto]) => play.twirl.api.HtmlFormat.Appendable) = (lista) => apply(lista)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-17T11:25:16.271
                  SOURCE: C:/Users/Administrador/Desktop/Prova-recuperaco/questao-2/app/views/listar.scala.html
                  HASH: 0933142b27d7f37b41a04caf807bd577124f393a
                  MATRIX: 956->1|1073->25|1100->27|1132->51|1170->52|1202->58|1272->102|1308->123|1346->124|1386->137|1437->162|1452->169|1480->177|1532->202|1548->209|1583->223|1643->256|1663->267|1742->325|1852->408|1872->419|1951->477|2059->558|2079->569|2154->623|2321->759|2353->764
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|48->17
                  -- GENERATED --
              */
          