function raizPositiva(a,b,c)
{
    const d = b**2 - (4*a*c);
    if(d<0)
    {
        return "No existen soluciones reales ";
    }

    //RAIZ POSITIVA
    const raizP = ((-b+Math.sqrt(d))) / (2*a);
    return raizP;
}

        document.getElementById("ecuacion").addEventListener("submit", function (evento) {
        evento.preventDefault();
        const a = parseFloat(document.getElementById("a").value);
        const b = parseFloat(document.getElementById("b").value);
        const c = parseFloat(document.getElementById("c").value);

        if(a === 0)
        {
            document.getElementById("resultado").textContent = "el denominador no puede ser igual a 0";
            return;

        }

        const resultado = raizPositiva(a,b,c);
        document.getElementById("resultado").textContent = `el resultado de la version positiva de la ec es igual a  ${resultado}`
    });
//ejemplo de uso
/*
const a= 5;
const b=30;
const c = 2;
const resultado = raizPositiva(a,b,c);

console.log(resultado);
*/