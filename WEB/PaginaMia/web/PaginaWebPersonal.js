document.addEventListener("DOMContentLoaded", function() {
    const descargarBtn = document.getElementById("descargarBtn");

    descargarBtn.addEventListener("click", function() {
        descargarBtn.style.display = 'none';
        const content = document.getElementById("content");

        const options = {
            margin:       1,
            filename:     'pagina_web.pdf',
            image:        { type: 'jpeg', quality: 0.98 },
            html2canvas:  { scale: 2 },
            jsPDF:        { unit: 'in', format: 'letter', orientation: 'portrait' }
        };

        html2pdf().from(content).set(options).save();
    });
});
