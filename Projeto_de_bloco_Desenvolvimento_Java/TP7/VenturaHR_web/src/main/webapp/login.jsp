<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>VenturaHR - Home</title>
    </head>
    <body>
        <header>
            <h1>VenturaHR</h1>
            <p>Sistema de vagas de emprego</p>
        </header>
        <main>
            <section>
                <div>
                   <h2>Título da seção principal da página</h2>
                   <p></p>
                </div>
                <form action="j_security_check" method="post">
                    <span>Login</span>
                    <div>
                            <input type="text" name="j_username" placeholder="Email">
                    </div>

                    <div>
                            <input type="password" name="j_password" placeholder="Senha">
                    </div>
                    <div>
                        <input type="submit" value="Entrar"/>
                    </div>
                    <div>
                            <span>Esqueci: </span>
                            <a>Usuário / Senha?</a>
                    </div>
                    <div>
                            <a href="#">Criar conta</a>
                    </div>
                </form>    
             </section>
          </main>
          <footer>
              <h1>Bruno Fernandes 2021 - Instituto INFNET</h1>
          </footer>
    </body>
</html>