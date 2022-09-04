
function eliminar(id) {
    swal({
        title: "Estas seguro de eliminar?",
        text: "Once deleted, you will not be able to recover this imaginary file!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
            .then((OK) => {
                if (OK) {
                    $.ajax({
                        url:"/eliminar/"+id,
                        success: function(res){
                            console.log(res);
                        }
                    }).then((ok)=>{
                        if(ok){
                         location.href="/listar";   
                        }
                    });
                } else {
                    location.href="/listar"; 
                }
            });
}