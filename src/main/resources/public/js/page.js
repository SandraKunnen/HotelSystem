var url = "/api/page";

$.get(url,function(result) {
$("#title").text(result.title);
$("#body").text(result.content);
});