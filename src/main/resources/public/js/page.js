var url = "/api/page";

//$.get(url,function(gast) {
//    $("#title").text("JS komt hier langs");
//    $("#buttonGuestInformation").click(function(){
//        $("#body").text(gast.naam);
//    });
//});

$("#buttonGuestInformation").click(function(){
        $.get(url, function(guest){
            $("#body").text(guest.naam);
        })

});