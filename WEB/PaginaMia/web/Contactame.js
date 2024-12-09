const containerFormulario = document.getElementById('containerFormulario');
const nextButton = document.getElementById('nextButton');
const motivoTextarea = document.getElementById('motivo');
const nombreInput = document.getElementById('nombre');
const correoInput = document.getElementById('correo');

let etapa = 1;

emailjs.init("x0BYW9jIu_SlxnST3");

nextButton.addEventListener('click', (event) => {
    event.preventDefault();

    if (etapa === 1) {
        const nombre = nombreInput.value.trim();
        const correo = correoInput.value.trim();

        if (!nombre || !correo) {
            alert('Por favor, completa ambos campos antes de continuar.');
            return;
        }

        motivoTextarea.classList.add('visible');
        containerFormulario.classList.remove('collapsed');
        containerFormulario.classList.add('expanded');
        nextButton.textContent = 'Enviar Consulta';
        etapa = 2;
    } else if (etapa === 2) {
        const motivo = motivoTextarea.value.trim();

        if (!motivo) {
            alert('Por favor, completa el motivo de tu consulta.');
            return;
        }

        emailjs.send("service_aml7bvi", "template_0f85zmj", {
            nombre: nombreInput.value,
            correo: correoInput.value,
            motivo: motivo,
        })
            .then(() => {
                alert("Consulta enviada con éxito.");
            })
            .catch(() => {
                alert("Error al enviar la consulta.");
            });
    }
});
