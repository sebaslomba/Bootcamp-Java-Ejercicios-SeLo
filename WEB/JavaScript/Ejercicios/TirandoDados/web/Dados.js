const tirarDados = document.getElementById('tirar-dados');
const mesa = document.getElementById("mesa");

function generarNumeroAleatorio() {
    return Math.ceil(Math.random() * 6);
}

function crearDadoGrafico(numero) {
    const patrones = {
        1: '<span class="punto centro">•</span>',
        2: '<span class="punto esquina-superior-izquierda">•</span><span class="punto esquina-inferior-derecha">•</span>',
        3: '<span class="punto esquina-superior-izquierda">•</span><span class="punto centro">•</span><span class="punto esquina-inferior-derecha">•</span>',
        4: '<span class="punto esquina-superior-izquierda">•</span><span class="punto esquina-superior-derecha">•</span><br><span class="punto esquina-inferior-izquierda">•</span><span class="punto esquina-inferior-derecha">•</span>',
        5: '<span class="punto esquina-superior-izquierda">•</span><span class="punto esquina-superior-derecha">•</span><br><span class="punto centro">•</span><br><span class="punto esquina-inferior-izquierda">•</span><span class="punto esquina-inferior-derecha">•</span>',
        6: '<span class="punto esquina-superior-izquierda">•</span><span class="punto esquina-superior-derecha">•</span><br><span class="punto esquina-inferior-izquierda">•</span><span class="punto esquina-inferior-derecha">•</span><br><span class="punto centro-izquierda">•</span><span class="punto centro-derecha">•</span>',
    };
    return patrones[numero];
}

function tirarDado() {
    mesa.innerHTML = ""; // Limpiar la mesa antes de generar los nuevos dados

    for (let i = 0; i < 5; i++) {
        const numero = generarNumeroAleatorio();
        const dado = document.createElement("div");
        dado.classList.add("dado");
        dado.innerHTML = crearDadoGrafico(numero);
        mesa.appendChild(dado);
    }
}

tirarDados.addEventListener("click", tirarDado);