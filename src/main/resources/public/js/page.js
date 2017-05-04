var url = "/api/guests";

//$.get(url,function(gast) {
//    $("#title").text("JS komt hier langs");
//    $("#buttonGuestInformation").click(function(){
//        $("#body").text(gast.naam);
//    });
//});

$("#buttonGuestInformation").click(function(){
        $.get(url, function(guestregister){
            console.log(guestregister);
            $("#body").text(guestregister[0].naam);
        })
});