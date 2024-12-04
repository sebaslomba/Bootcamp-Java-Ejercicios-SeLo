let pantalla = document.getElementById("pantalla")
let operador = null;
let num1 = null;
let num2 = null;
let esperandoSegundoNumero = false;

function escribirNumero(numeroo)
{
    if(esperandoSegundoNumero)
    {
        pantalla.value = numeroo;
        esperandoSegundoNumero = false;
    }else
    {
        pantalla.value += numeroo;
    }
}

function seguirAgregando(numero)
{
    pantalla.value += numero;
}

function operar(op)
{
    if(pantalla.value !== "")
    {
        if(num1 === null)
        {
            num1 = parseFloat(pantalla.value);
            operador = op;
            esperandoSegundoNumero = true;
            pantalla.value += (`${op}`);
        }else
        {
            num2 = parseFloat(pantalla.value);
            calcular();
            operador = op;
            pantalla.value += ` ${op} `;
            esperandoSegundoNumero = true;
        }
    }
}
function calcular()
{
    if((num1 !== null) && (operador !== null))
    {
        let partes = pantalla.value.split(`${operador}`)
        num2 = parseFloat(partes[1]);

        switch (operador)
        {
            case "+":
                num1 = num1+num2;
                break;
            case "-":
                num1= num1-num2;
                break;
            case "×":
                num1= num1*num2;
                break;
            case "÷":
                if (num2 === 0)
                {
                    pantalla.value= "Math Error"
                    return;
                }
                num1= (num1/num2);
                break;
            default:
                num1 = "Error: operador no valido";
        }
        pantalla.value = num1;
        operador = null;
        num2 = null;
        esperandoSegundoNumero = false;
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