(function () {
    function adicionar() {
        var dados = JSON.stringify({
            name    : document.querySelector("input[name=nome]").value,
            mail    : document.querySelector("input[name=email]").value
        });
        // tbClientes.push(dados);
        localStorage.setItem("storage", JSON.stringify(dados));
        alert("Registro Adicionado!");
        return true;
    }
    var form = document.querySelector("form");
    form.addEventListener("submit", function () {
        // event.preventDefault(); event
        return adicionar();
    });
})();