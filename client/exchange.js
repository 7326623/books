function exchenge() {

var lis = document.querySelectorAll('#itemGrid input[id]');

var arr = [];
for (var i = 0; i < lis.length; i++) {
  arr.push(+lis[i].checked);
}
localStorage.setItem('ganr', arr);
console.log(localStorage.ganr);
/*если есть обмены рисуем окно*/
   if(true==true)

           var a = window.open("","",'height=800,width=600');
           a.document.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\"><script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>");
           a.document.write("<div class=\"alert alert-info\" role=\"alert\"><strong>Heads up!</strong> This alert needs your attention, but its not super important.</div>");
           /*сюда список обменов */
           a.document.write("<div class=\"text-end\"><button type=\"button\" id=\"ex-but\" class=\"btn btn-primary\" disabled=\"disabled\">Подтвердить обмен</button></div>");

    }