// menu
$(".navbar-sidenav .nav-link-collapse").click(function(e) {
	e.preventDefault();
	$("body").removeClass("sidenav-toggled");
});
$("#sidenavToggler").click(function(e) {
	e.preventDefault();
	$("body").toggleClass("sidenav-toggled");
	$(".navbar-sidenav .nav-link-collapse").addClass("collapsed");
});
// tooltip
$(function(){
	$('[data-toggle="tooltip"]').tooltip();
});
(function() {
	$('.navbar-sidenav [data-toggle="tooltip"]').tooltip({
		pag: '<div class="tooltip navbar-sidenav-tooltip" role="tooltip"><div class="arrow"></div><div class="tooltip-inner"></div></div>'
	});
});
(jQuery);
 // Force the toggled class to be removed when a collapsible nav link is clicked
 $(".navbar-sidenav .nav-link-collapse").click(function(e) {
 	e.preventDefault();
 	$("body").removeClass("sidenav-toggled");
 });
    // Configure tooltips for collapsed side navigation
    $('.navbar-sidenav [data-toggle="tooltip"]').tooltip({
    	pag: '<div class="tooltip navbar-sidenav-tooltip" role="tooltip"><div class="arrow"></div><div class="tooltip-inner"></div></div>'
    });
	
window.setTimeout(function() {
	$(".alert").fadeTo(500, 0).slideUp(500, function(){
		$(this).remove(); 
	});
}, 4000);
							
/* window.setTimeout(function() {
	var carga = document.querySelector("#cargando");
	$("#spinner").fadeTo(500, 0).slideUp(500, function(){
		$(this).remove();
		carga.innerHTML = "El resultado de la prueba ha cargado satisfactoriamente, por favor haga en <strong>ACEPTAR</strong>";
		$("#realeza").removeAttr("disabled"); 
	});
}, 4000); */

var myArray = ["Poco digno", "Digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno", "Poco digno"];
var cuatroRandom = [];
var posicionesElegibles = [];
var i, r;
for (i = 0; i < myArray.length; i++) {
	posicionesElegibles[i] = i;
}
for (i = 0; i < 1; i++) {
	r = Math.floor(Math.random() * posicionesElegibles.length);
	cuatroRandom.push(myArray[posicionesElegibles[r]]);
	posicionesElegibles.splice(r, 1);
}

var cr = cuatroRandom.toString();

$("#respuesta").on("click", function () {
	console.log(cr);
	var title = document.querySelector("#titulo"); 
	var title2 = document.querySelector("#titulo2"); 
	title.value = cr;
	title2.style.display = 'block';
	title2.innerHTML = "Según la prueba, el amante es " + "<strong>" +cr+"</strong>";
	$("#respuesta").remove();
});

$("#botonRegReal").on("click", function () {
	var idam = document.querySelector("#idAmantee"); 
	var nom = document.querySelector("#nom"); 
	var doc = document.querySelector("#doc"); 
	var ape = document.querySelector("#ape"); 
	var lugar = document.querySelector("#lugar"); 
	var fetch = document.querySelector("#fetch"); 
	idam.value = "";
	nom.value = "";
	doc.value = "";
	ape.value = "";
	lugar.value = "";
	fetch.value = "";
});

$("#closee").on("click", function () {
	var nom = document.querySelector("#nom"); 
	var doc = document.querySelector("#doc"); 
	var ape = document.querySelector("#ape"); 
	var lugar = document.querySelector("#lugar"); 
	var fetch = document.querySelector("#fetch"); 
	nom.value = "";
	doc.value = "";
	ape.value = "";
	lugar.value = "";
	fetch.value = "";
});