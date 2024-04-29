package br.com.weblivraria.pages;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import br.com.weblivraria.dao.DAOLivro;
 
/**

* Servlet implementation class Home

*/

public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**

     * @see HttpServlet#HttpServlet()

     */

    public Home() {
        super();

        // TODO Auto-generated constructor stub
    }
 
	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pagina = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"pt-br\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Home Livraria</title>\r\n"
				+ "\r\n"
				+ "    <style>\r\n"
				+ "        body{\r\n"
				+ "            margin: 0px;\r\n"
				+ "            padding: 0px;\r\n"
				+ "        }\r\n"
				+ "        header{\r\n"
				+ "            background-color: #022335;\r\n"
				+ "            color: white;\r\n"
				+ "            font-family: verdana;\r\n"
				+ "        }\r\n"
				+ "        #areausuario{\r\n"
				+ "            padding: 10px;\r\n"
				+ "            border-bottom: 1px solid silver;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "        }\r\n"
				+ "        #areapesquisa{\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: center;\r\n"
				+ "            align-items: center;\r\n"
				+ "            height: 100px;\r\n"
				+ "            border-bottom: 1px solid silver;\r\n"
				+ "        }\r\n"
				+ "        #localizacao img{\r\n"
				+ "            width: 16px;\r\n"
				+ "            height: 16px;\r\n"
				+ "        }\r\n"
				+ "        #usuario img{\r\n"
				+ "            height: 16px;\r\n"
				+ "            width: 16px;\r\n"
				+ "        }\r\n"
				+ "        #areapesquisa img{\r\n"
				+ "            width: 150px;\r\n"
				+ "            height: 85px;\r\n"
				+ "        }\r\n"
				+ "        #carrinho img{\r\n"
				+ "            width: 22px;\r\n"
				+ "            height: 22px;\r\n"
				+ "            margin-right: 10px;\r\n"
				+ "        }\r\n"
				+ "        form img{\r\n"
				+ "            width: 16px !important;\r\n"
				+ "            height: 16px !important;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        form{\r\n"
				+ "            background-color: white;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            margin-left: 80px;\r\n"
				+ "            margin-right: 80px;\r\n"
				+ "        }\r\n"
				+ "        input[type=text]{\r\n"
				+ "            width: 700px;\r\n"
				+ "            border: 0px;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            outline: none;\r\n"
				+ "        }\r\n"
				+ "        input[type=\"submit\"]{\r\n"
				+ "            background-color: rgba(218, 185, 0, 0.836);\r\n"
				+ "            color: black;\r\n"
				+ "            border: 0px;\r\n"
				+ "            font-size: 15pt;\r\n"
				+ "            padding: 10px;\r\n"
				+ "        }\r\n"
				+ "        #carrinho{\r\n"
				+ "            background-color: white;\r\n"
				+ "            padding: 15px;\r\n"
				+ "            color: black !important;\r\n"
				+ "        }\r\n"
				+ "        #areamenu{\r\n"
				+ "            padding: 15px;\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "        #areamenu a{\r\n"
				+ "            color: white;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "            margin-left: 10px;\r\n"
				+ "            margin-right: 10px;\r\n"
				+ "        }\r\n"
				+ "        #areamenu a:hover{\r\n"
				+ "            color: goldenrod;\r\n"
				+ "        } \r\n"
				+ "        footer{\r\n"
				+ "            background-color: #022335;\r\n"
				+ "            color: white;\r\n"
				+ "            font-family: verdana;\r\n"
				+ "            padding: 40px;\r\n"
				+ "        }\r\n"
				+ "        #rodape h2{\r\n"
				+ "            color:goldenrod;\r\n"
				+ "        }\r\n"
				+ "        #rodape{\r\n"
				+ "            line-height: 30px;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "        }\r\n"
				+ "        footer a{\r\n"
				+ "            color: white;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "        }\r\n"
				+ "        #contato a{\r\n"
				+ "            display: flex;\r\n"
				+ "            align-items: center;\r\n"
				+ "        }\r\n"
				+ "        #contato img{\r\n"
				+ "            width: 24px;\r\n"
				+ "            height: 24px;\r\n"
				+ "            margin: 5px;\r\n"
				+ "        }\r\n"
				+ "        #generos a{\r\n"
				+ "            display: block;\r\n"
				+ "        }\r\n"
				+ "        #generos{\r\n"
				+ "            width: 500px;\r\n"
				+ "        }\r\n"
				+ "        #copy{\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-top: 1px solid silver;\r\n"
				+ "        }\r\n"
				+ "        #listalivros{\r\n"
				+ "            display: flex;\r\n"
				+ "            flex-wrap: wrap;\r\n"
				+ "            width: 90%;\r\n"
				+ "            margin-left: auto;\r\n"
				+ "            margin-right: auto;\r\n"
				+ "            justify-content: center;\r\n"
				+ "        }\r\n"
				+ "        .livro{\r\n"
				+ "            width: 80%;\r\n"
				+ "            border: 1px solid #dddddd;\r\n"
				+ "            padding: 20px;\r\n"
				+ "        }\r\n"
				+ "        .livro img{\r\n"
				+ "            width: 100%;\r\n"
				+ "        }\r\n"
				+ "        .livro h4{\r\n"
				+ "            font-family: verdana;\r\n"
				+ "            font-size: 10pt;\r\n"
				+ "        }\r\n"
				+ "        .livro p{\r\n"
				+ "            font-family: verdana;\r\n"
				+ "            color: red;\r\n"
				+ "            font-size: 15pt;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ " #listalivros a{"
				+ "width:20%; text-decoration:none;color;black"		
				+	"}</style>\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <div id =\"areausuario\">\r\n"
				+ "            <div id =\"localizacao\">\r\n"
				+ "                <img src=\"localizacao.png\" alt=\"\">\r\n"
				+ "                Localização da loja\r\n"
				+ "            </div>\r\n"
				+ "            <div id =\"usuario\">\r\n"
				+ "                <img src=\"\" alt=\"\">\r\n"
				+ "                Logar / Cadastrar\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "        <div id =\"areapesquisa\">\r\n"
				+ "            <img src=\"bookstore.png\" alt=\"\">\r\n"
				+ "            <form action=\"ServiceSearch\" method=\"get\">\r\n"
				+ "                <img src=\"lupa.png\" alt=\"\">\r\n"
				+ "                <input type=\"text\" placeholder=\"Pesquise seu livro aqui\">\r\n"
				+ "                <input type=\"submit\" value=\"BUSCAR\">\r\n"
				+ "            </form>\r\n"
				+ "\r\n"
				+ "            <div id=\"carrinho\"><img src=\"carrinho.png\" alt=\"\">R$ 0,00</div>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "        <div id =\"areamenu\">\r\n"
				+ "\r\n"
				+ "            <nav>\r\n"
				+ "                <a href=\"HOME\">HOME</a>\r\n"
				+ "                <a href=\"#\">ROMANCE</a>\r\n"
				+ "                <a href=\"#\">AVENTURA</a>\r\n"
				+ "                <a href=\"#\">TERROR</a>\r\n"
				+ "                <a href=\"#\">FANTASIA</a>\r\n"
				+ "                <a href=\"#\">SUSPENSE</a>\r\n"
				+ "                <a href=\"#\">DRAMA</a>\r\n"
				+ "                <a href=\"#\">AÇAO</a>\r\n"
				+ "            </nav>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "    </header>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    <content>\r\n"
				+ "        <div id=\"painel\"><img src=\"painel1.png\" alt=\"\"></div>\r\n"
				+ "        <h2>Nossos Produtos</h2>\r\n"
				+ "        <div id=\"listalivros\">\r\n"

				;

				String conteudo="";
				DAOLivro dlivro = new DAOLivro();
				for( int i = 0; i < dlivro.listar().size() ; i++) {

				conteudo+= "<a href=ServiceLivro?id="+dlivro.listar().get(i).getIdlivro()+"> <div class=\"livro\">\r\n"

				+ "                <img src="+dlivro.listar().get(i).getCapa()+" alt=\"\">\r\n"
				+ "                <h4>"+dlivro.listar().get(i).getTitulo()+"</h4>\r\n"
				+ "                <p class=\"preco\"> R$ "+dlivro.listar().get(i).getPreco()+"</p>\r\n"
				+ "            </div> </a>\r\n"
				+ "\r\n"
				+ "           \r\n"

				;

				}

				pagina+=conteudo;

		pagina+= "        </div>\r\n"
				+ "\r\n"
				+ "    </content>\r\n"
				+ "    <footer>\r\n"
				+ "\r\n"
				+ "        <div id=\"rodape\">\r\n"
				+ "            <div id =\"contato\">\r\n"
				+ "                <h2>Nossos Contatos</h2>\r\n"
				+ "                (11) 5693-3786 | 3478-8236 <br>\r\n"
				+ "                Av. Sr Verissimo, 72 - Jardim Belem - São Paulo - SP <br>\r\n"
				+ "                <a href=\"https://wa.me/551187350294\"><img src=\"whatsapp.png\" alt=\"\">(11) 8735-0294</a>\r\n"
				+ "\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "            <div id =\"generos\">\r\n"
				+ "                <h2>Generos</h2>\r\n"
				+ "                <nav>\r\n"
				+ "                    <a href=\"HOME\">HOME</a>\r\n"
				+ "                    <a href=\"#\">ROMANCE</a>\r\n"
				+ "                    <a href=\"#\">AVENTURA</a>\r\n"
				+ "                    <a href=\"#\">TERROR</a>\r\n"
				+ "                    <a href=\"#\">FANTASIA</a>\r\n"
				+ "                    <a href=\"#\">SUSPENSE</a>\r\n"
				+ "                    <a href=\"#\">DRAMA</a>\r\n"
				+ "                    <a href=\"#\">AÇAO</a>\r\n"
				+ "                </nav>\r\n"
				+ "\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div id=\"copy\">\r\n"
				+ "            ©Copyright-todos os direitos reservados | design by <a href=\"https://github.com/Rafaellaomaria12\">Rafaella Maria</a></div>\r\n"
				+ "\r\n"
				+ "    </footer>\r\n"
				+ "</body>\r\n"
				+ "</html>";

		response.getWriter().append(pagina);

	}
 
}
