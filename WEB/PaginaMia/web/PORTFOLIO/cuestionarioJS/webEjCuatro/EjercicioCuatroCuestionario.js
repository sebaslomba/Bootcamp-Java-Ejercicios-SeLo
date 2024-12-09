function numeroAleatorio(id)
{
    const elemento = document.getElementById(id);

    if (elemento)
    {
        const numeroEnteroGenerado = Math.floor(Math.random() * (100-1 +1) +1);

        elemento.innerHTML = numeroEnteroGenerado;

    }else
    {
        console.error(`No se encontró ningún elemento con el id "${id}".`);
    }

    console.log("el numero entero generado aleatoriamente es igual a: " +numeroEnteroGenerado);
}