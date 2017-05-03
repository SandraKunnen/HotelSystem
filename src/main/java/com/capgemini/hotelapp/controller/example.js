var name = "Piet";
var age = 43;
var url = "localhost:8080\"

$.get(url, function(result)) {
    console.log("Name" + result.name);

    $("#name").text(result.name);
}