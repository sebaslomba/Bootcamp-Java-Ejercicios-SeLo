const apiURL = "https://pokeapi.co/api/v2/pokemon?limit=200";

function cargarPokemones() {
    $("#id_container").empty();

    $.ajax({
        url: apiURL,
        method: "GET",
        success: function (data) {
            data.results.forEach(pokemon => {
                $.ajax({
                    url: pokemon.url,
                    method: "GET",
                    success: function (details) {
                        const characterElement = `
                        <div class="tarjeta">
                            <img src="${details.sprites.front_default}" alt="${pokemon.name}" />
                            <div class="texto_personaje">
                                <h2>${pokemon.name}</h2>
                                <p><strong>Altura:</strong> ${details.height}</p>
                                <p><strong>Peso:</strong> ${details.weight}</p>
                            </div>
                        </div>
                        `;
                        $("#id_container").append(characterElement);
                    },
                    error: function () {
                        console.error(`Error al obtener detalles de ${pokemon.name}`);
                    }
                });
            });
        },
        error: function () {
            console.error("Error al obtener la lista de pokémon.");
            $("#id_container").html("<p>Fallo de conexión</p>");
        }
    });
}

$(document).ready(function () {
    $("#cargar_pokemones").on("click", cargarPokemones);
});
