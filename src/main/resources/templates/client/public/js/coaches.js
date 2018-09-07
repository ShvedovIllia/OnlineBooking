$(document).ready(function(){
    console.log("ready");
});

$("#getAll").click(function(){
    console.log("click");
    getCoaches();
});

var blueObject = $("#showAll");

function getCoaches(){
    var html = "<table>"
    $.ajax({
        url: "http://localhost:8088/coach/getAll",
        method: 'get',
        contentType: 'application/json',
        dataType : 'json',
        success: function(result){
            console.log("123");
            console.log(result);
            $.each(result, function(i){
            html+= "<tr><td>" + result[i].id + "</td> <td>" + result[i].firstName + "</td>  </tr>";
            });
            html +="</table>";
            blueObject.html(html);
            
        }
    });
}