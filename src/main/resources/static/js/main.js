//Modo dark
/*let themeDark = false;
let btnTema = document.getElementById("btnTema");

const cambiarTema = () => {
    themeDark = !themeDark;
    if (!themeDark) {
        document.documentElement.dataset.bsTheme = "light";
        btnTema.innerHTML = "<i class='bi bi-sun-fill'></i>";
        btnTema.className = "btn btn-outline-dark mx-2";
    } else {
        document.documentElement.dataset.bsTheme = "dark";
        btnTema.innerHTML = "<i class='bi bi-moon-stars-fill'></i>";
        btnTema.className = "btn btn-outline-light mx-2";
    }
    //console.log(document.documentElement.dataset.bsTheme);
};
*/

//Modo dark
let themeDark = false;
let btnTema = document.getElementById("btnTema");

const cambiarTema = () => {
    themeDark = !themeDark;
    const iconos = document.querySelectorAll('.tema'); // Icono con nombre Tema
    const botonesTema = document.querySelectorAll('.temaBoton'); // Botones con nombre TemabBOTON
    const botonesTema2 = document.querySelectorAll('.botonTema2'); // Botones amarillos y negros

    if (!themeDark) {
        document.documentElement.dataset.bsTheme = "light";
        btnTema.innerHTML = "<i class='bi bi-sun-fill'></i>";
        btnTema.className = "btn btn-outline-dark mx-2";
        iconos.forEach(icono => icono.classList.remove('text-light'));
        iconos.forEach(icono => icono.classList.add('text-dark'));
        botonesTema.forEach(botonesTema => botonesTema.classList.remove('btn-light'));
        botonesTema.forEach(botonesTema => botonesTema.classList.add('btn-dark'));
        botonesTema2.forEach(botonesTema2 => botonesTema2.classList.remove('btn-warning'));
        botonesTema2.forEach(botonesTema2 => botonesTema2.classList.add('btn-dark'));


    } else {
        document.documentElement.dataset.bsTheme = "dark";
        btnTema.innerHTML = "<i class='bi bi-moon-stars-fill'></i>";
        btnTema.className = "btn btn-outline-light mx-2";
        iconos.forEach(icono => icono.classList.remove('text-dark'));
        iconos.forEach(icono => icono.classList.add('text-light'));
        botonesTema.forEach(botonesTema => botonesTema.classList.remove('btn-dark'));
        botonesTema.forEach(botonesTema => botonesTema.classList.add('btn-light'));
        botonesTema2.forEach(botonesTema2 => botonesTema2.classList.remove('btn-dark'));
        botonesTema2.forEach(botonesTema2 => botonesTema2.classList.add('btn-warning'));
    }
};

// Código login
function validateEmail(input) {
    const email = input.value;
    if (email.includes('@') && email.indexOf('@') !== email.lastIndexOf('@')) {
        input.classList.remove('is-invalid');
        input.classList.add('is-valid');
    } else if (email.includes('@') && email.split('@')[1].length > 0) {
        input.classList.remove('is-invalid');
        input.classList.add('is-valid');

    } else {
        input.classList.remove('is-valid');
        input.classList.add('is-invalid');
    }
}

