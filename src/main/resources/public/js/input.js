//Hier moet javascript
//$('#submit').on('click', function() { //Als je op submit klikt dan start de functie
   // var input = document.getElementsByName("input")[0].value; //de var(iabele) input wordt gedefinieerd voor JS

$.ajax(
{
  contentType: "application/json",
  type: "POST",
  url: url,
  data: JSON.stringify(formData,
  success: success,
  dataType: dataType
});

}