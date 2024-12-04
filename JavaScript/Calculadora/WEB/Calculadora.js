let pantalla = document.getElementById("pantalla")
let operador = null;
let num1 = null;

function seguirAgregando(numero)
{
    pantalla.value += numero;
}

function operar(op)
{
    if(pantalla.value !== "")
    {
        num1 = parseFloat(pantalla.value);
        operador = op;
        pantalla.value = "";
    }
}
function calcular()
{
    if((operador !== null) && (num1 !== null) && (pantalla.value !== ""))
    {
        const num2 = parseFloat(pantalla.value);
        let resultado;

        switch (operador)
        {
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado= num1-num2;
                break;
            case "*":
                resultado= num1*num2;
                break;
            case "/":
                if (num2 === 0)
                {
                    pantalla.value= "Math Error"
                    return;
                }
                resultado= num1/    num2;
                break;
            default:
                resultado = "Error: operador no valido";
        }
        pantalla.value = resultado;
        operador = null;
        num1 = null;
    }
}
function limpiarPantalla()
{
    pantalla.value = "";
    operador = null;
    num1 = null;
}
function borrarUltimo() {
    pantalla.value = pantalla.value.slice(0, -1);
}