package br.edu.infnet.app.contatos;

import br.edu.infnet.domain.contatos.Endereco;
import br.edu.infnet.infra.contatos.EnderecoService;
import org.apache.commons.lang.StringUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CadastroController {

    @WebServlet(name = "EnderecoController", urlPatterns = {"/EnderecoController"})
    public class EnderecoController extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            //Pass 1 - Recuperação dos Parâmetros
            String cep = request.getParameter("cep");
            //Passo 2 - Validação dos Parâmetros
            if(StringUtils.isNotBlank(cep)) {

                //Passo 3 - Processamento da Requisição
                EnderecoService es = new EnderecoService();
                Endereco end = es.obterPorCep(cep);
                //Passo 4 - Inserção de Objetos na requisição
                request.setAttribute("endereco", end);
            } else {

                //Passo 4 - Inserção de Objetos na requisição
                request.setAttribute("erro", "CEP Inválido");
            }
            //Passo 5 - Redirecionar
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo() {
            return "Short description";
        }// </editor-fold>

    }
}
