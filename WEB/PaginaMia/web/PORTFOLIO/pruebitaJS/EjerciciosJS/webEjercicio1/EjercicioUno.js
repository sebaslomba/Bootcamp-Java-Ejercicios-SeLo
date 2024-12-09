/*Programa una función que cuente el número de caracteres de una cadena de texto*/
function contarCaracteres(cadena){
    return cadena.length;
}
console.log("la cantidad de caracteres de la cadena ingresada es de:  ");
console.log(contarCaracteres("Mathias Sebastian Lombardi Recalde"));

//probar mejoras y variaciones
let decision = prompt("Desea continuar con el programa?  Y : si   N : no");
if(decision.toUpperCase() === "Y"){
   let nombre = prompt("Ingrese la cadena que quiera contar, (los espacios cuentan)");
    console.log("la cantidad de caracteres de la cadena ingresada es de: ");
    console.log(contarCaracteres(nombre));
}else if (decision.toUpperCase() === "N"){
    process.exit(0);
}else{
    alert("favor ingrese una opcion valida");
}