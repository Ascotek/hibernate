//function showAlert(){
//alert("alert from button");
//}
//alert("testowo");
//console.log("hello world in console");

//const NumberToGuess =10;
//let isNumberGuessed = false;
//
//while(!isNumberGuessed){
////pobieranie danych od uzytkownika
//let result = prompt("Podaj liczbę", 0);
//// wyświetlanie komunikatu
//if(result === 10){
//alert("Trafiłeś");
//}else{
//allert("Błąd! Jeszcze raz");
//}
//}


//var array = [2,3,67,23,5,8,22,1000,45678,24566799,76];
//var max = Math.max.apply(null, array);
//var min = Math.min.apply(null, array);
//
//console.log("Największa wartość to: " + max);
//console.log("Najmnijesza wartość to: " + min);

//console.log("------------------")
//var tab = new Array(89,45,7,35, 23,56);
//var min = tab[0];
//var max = tab[0];
//
//
//for (i = 1; i < tab.length; i++) {
//    if (min > tab[i]) {
//    min = tab[i];
//
//}
//    if (max < tab[i]) {
//    max = tab[i];
//
//}
//}
//console.log(tab.length)
//console.log("Największy element tablicy to: " + max);
//console.log("Najmniejszy element tablicy to: " + min);


function convertToMorse(input){
    input = input.toLowerCase();
    let morse = ["•—", "—•••", "-•-•", "-••", "•", "••-•", "--•", "••••", "••", "•---", "-•-", "•-••", "--", "-•", "---", "•--•", "--•-", "•-•", "•••", "-", "••-", "•••-", "•--", "-••-", "-•--", "--•"];
    let output = "";
    for(let i = 0; i < input.length; i++){
        output = output + " " + morse[input.charCodeAt(i) - 97];
    }
    return output;
}

function check(){
var x = document.getElementById("dane").value
document.getElementById("wynik").value = convertToMorse(x);
}











