$.ajax({
    url: 'http://localhost:8080/Pizzaria/Listarprodutos',
    dataType: 'application/json',
    complete: function(data){
        console.log(data);
    },
    success: function(data){
        alert(data)
    }
})