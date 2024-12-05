const iniciarJuegoButton = document.getElementById("iniciarJuego");
const reiniciarJuegoButton = document.getElementById("reiniciarTablero");
const mensajeError = document.getElementById("mensajeError");
const tablero = document.querySelector(".juego");
const celdas = tablero.getElementsByTagName("td");



let jugadorX = "";
let jugadorO = "";
let turno = "X";
let juegoActivo = false;


iniciarJuegoButton.addEventListener('click', function() {
    jugadorX = document.getElementById("jugadorX").value.trim();
    jugadorO = document.getElementById("jugadorO").value.trim();

    if (jugadorX === "" || jugadorO === "") {
        mensajeError.style.display = "block";
        return;
    }

    mensajeError.style.display = "none";
    juegoActivo = true;
    turno = "X";
    document.getElementById("configuracion").style.display = "none";
    tablero.classList.remove("oculto");
    reiniciarTablero();
});

reiniciarJuegoButton.addEventListener('click', reiniciarJuego);

function reiniciarJuego() {
    jugadorX = "";
    jugadorO = "";
    turno = "X";
    juegoActivo = false;
    document.getElementById("configuracion").style.display = "block";
    tablero.classList.add("oculto");
    reiniciarTablero();
    reiniciarJuegoButton.style.display = "none";
}

// Reiniciar el tablero
function reiniciarTablero() {
    for (let i = 0; i < celdas.length; i++) {
        celdas[i].textContent = "";
        celdas[i].classList.remove("marked", "ganador");
        celdas[i].style.backgroundColor = "";
        celdas[i].removeEventListener("click", marcarCelda);
        celdas[i].addEventListener("click", marcarCelda);
    }


    function marcarCelda(event) {
        if (!juegoActivo || event.target.textContent !== "") {
            return;
        }

        event.target.textContent = turno;
        event.target.classList.add("marked");

        if (verificarVictoria()) {
            alert(`${turno === "X" ? jugadorX : jugadorO} ha ganado!`);
            juegoActivo = false;
            reiniciarJuegoButton.style.display = "inline-block";
            return;
        }

        if (verificarEmpate()) {
            alert("¡Empate!");
            juegoActivo = false;
            reiniciarJuegoButton.style.display = "inline-block";
            return;
        }


        turno = (turno === "X") ? "O" : "X";
        document.getElementById("turno").textContent = `Es el turno de ${turno}`;
    }


    function verificarVictoria() {
        const combinacionesGanadoras = [
            [0, 1, 2],
            [3, 4, 5],
            [6, 7, 8],
            [0, 3, 6],
            [1, 4, 7],
            [2, 5, 8],
            [0, 4, 8],
            [2, 4, 6]
        ];

        for (let combinacion of combinacionesGanadoras) {
            const [a, b, c] = combinacion;

            if (
                celdas[a].textContent === turno &&
                celdas[a].textContent === celdas[b].textContent &&
                celdas[a].textContent === celdas[c].textContent
            ) {
                resaltarCeldasGanadoras(combinacion);
                return true;
            }
        }
        return false;
    }

// Verificar empate
    function verificarEmpate() {
        for (let i = 0; i < celdas.length; i++) {
            if (celdas[i].textContent === "") {
                return false;
            }
        }
        return true;
    }


    function resaltarCeldasGanadoras(combinacion) {
        for (let index of combinacion) {
            celdas[index].style.backgroundColor = "lightgreen";
        }
    }
}
