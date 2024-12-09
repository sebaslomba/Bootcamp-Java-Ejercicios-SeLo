function actualizarInnerHTML(id,cadena){
    const elemento = document.getElementById(id);

    if (elemento)
    {
        elemento.innerHTML = cadena;
    }else
    {
       console.error(`no se encontro nigun elemento con el ID ${id}`);
    }
}