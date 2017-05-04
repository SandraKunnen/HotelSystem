//Hier moet javascript
   // var input = document.getElementsByName("input")[0].value; //de var(iabele) input wordt gedefinieerd voor JS
$('#submit').click(function(e){            //Als je op submit klikt dan start de functie
    e.preventDefault();

    var formData = {string:$("#input").val()};
    console.log(formData);

    $.ajax(
{
          contentType: "application/json",
          url: "/api/page",
          type: "POST",
          data: JSON.stringify(formData),
          success: function(result){
                //data server
            console.log(result);
            var resultToShow = result.output;

            $("#result").append(resultToShow);
    }//,
//  error: function(jqXHR, textStatus, errorThrown){
//  }
});

});
